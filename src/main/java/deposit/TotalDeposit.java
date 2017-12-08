package deposit;

import order.Order;
import order.OrderItem;
import order.ProductType;
import order.ShipmentType;

import java.util.Calendar;
import java.util.Date;

/**
 * Class for calculating total amount deposited
 * to a seller's account after selling a given Order.
 *
 * @author Dan Tavrov
 *
 */
public class TotalDeposit {
    //the order being sold
    private Order order;

    private static final Calendar calendar = Calendar.getInstance();

    //dates of the sales
    private final Date jewelrySalesStartDate;
    private final Date jewelrySalesEndDate;

    //dates for referral fees
    private final Date watchReferralStartDate;
    private final Date watchReferralEndDate;

    //some constants for watch referral fee
    private final double WATCH_REFERRAL_LIMIT1 = 200.0;
    private final double WATCH_REFERRAL_LIMIT2 = 800.0;
    private final double WATCH_REFERRAL_RATE1 = 0.16;
    private final double WATCH_REFERRAL_RATE2 = 0.15;
    private final double WATCH_REFERRAL_RATE3 = 0.12;

    //per-item fee
    private final double PER_ITEM_FEE = 0.99;

    //limits for free shipping
    private final double FREE_SHIPPING_BOOK_LIMIT = 25.0;

    /* №1
     * Для електроніки не встановлено окремого ліміту для безкоштовної доствки
     *
     * private final double FREE_SHIPPING_ELECTRONICS_LIMIT = 99.0;
     */

    private final double FREE_SHIPPING_LIMIT = 49.0;

    //some constants for jewelry sales
    private final double JEWELRY_SALES_LIMIT = 500.0;

    private final double JEWELRY_SALES_RATE = 0.9;

    public TotalDeposit(Order order){
        this.order = new Order(order);

        //set dates
        /*
        * #2
        * В Java розрахунок місяців починається з нуля
        *
        * WARNING!
        * #3
        *
        * Розібратися з часом.
        * */

        calendar.set(2017, 11, 16, 0, 0, 1);
        jewelrySalesStartDate = calendar.getTime();

        calendar.set(2018, 2, 30, 23, 59, 59);
        jewelrySalesEndDate = calendar.getTime();

        calendar.set(2018, 0, 16, 0, 0, 1);
        watchReferralStartDate = calendar.getTime();

        calendar.set(2018, 8, 30, 23, 59, 59);
        watchReferralEndDate = calendar.getTime();
    }

    public Order getOrder(){
        return order;
    }

    public void setOrder(Order order){
        this.order = new Order(order);
    }

    /**
     * Method for calculating the total amount deposited
     * to a seller's account when the order is sold.
     *
     * It calculates the total amount as the sum of the
     * following quantities:
     * 1) + item price (possibly adjusted for any sales standing);
     * 2) + shipment charge (if the order is eligible for free
     * shipping, the charge is not collected);
     * 3) + gift wrap charge;
     * 4) - referral fees;
     * 5) - variable closure fees;
     * 6) - per-item fee of $0.99.
     *
     * @return Total amount deposited to a seller's
     * account.
     */
    public double getTotalDeposit(){
        boolean jewelrySalesApplicable = isJewelrySalesApplicable();
        boolean freeShipping = isEligibleForFreeShipping();

        double totalDeposit = 0.0;
        double totalWatchPrice = 0.0;

        for (OrderItem orderItem:order.getOrderItems()){
            if (orderItem.getProductType() == ProductType.WATCHES
                    &&
                    order.getDate().after(watchReferralStartDate)
                    &&
                    order.getDate().before(watchReferralEndDate)){
                //since in this date range referral fees for watches depend
                //on the total price, we first calculate it,
                //and then we will analyze it
                totalWatchPrice += orderItem.getTotalPrice();
            } else {
                //first calculate the item price,
                //including the sales and referral fees
                if (orderItem.getPrice()
                        * getReferralFeeRate(orderItem.getProductType())
                        > getReferralFeeMinimum(orderItem.getProductType())){
                    /*
                    * BUG!!!
                    *
                    * Надлишкова перевірка
                    * */

                    if (jewelrySalesApplicable){
                        totalDeposit += orderItem.getTotalPrice() *
                                (JEWELRY_SALES_RATE - getReferralFeeRate(ProductType.JEWELRY));
                    }
                    else{
                        totalDeposit += orderItem.getTotalPrice() *
                                (1.0 - getReferralFeeRate(orderItem.getProductType()));
                    }
                }
                else{
                    if (jewelrySalesApplicable){
                        totalDeposit += (orderItem.getTotalPrice() * JEWELRY_SALES_RATE)
                                - (orderItem.getQuantity()
                                * getReferralFeeMinimum(orderItem.getProductType()));
                    }
                    else{
                        totalDeposit += orderItem.getTotalPrice()
                                - (orderItem.getQuantity()
                                * getReferralFeeMinimum(orderItem.getProductType()));
                    }
                }
            }

            //add shipment charges

            /*
             * BUG!!!
             *
             * №4
             *
             * Необхідно додати перевірку на тип доставки, оскільки INTERNATIONAL
             * доставка не може бути безкоштовною.
             *
             */

            /*
             * BUG!!!
             *
             * #5
             *
             * Необхідно ввести перевірку на фурнітуру та декор, оскільки для неї відсутня
             * безкоштовна доставка
             *
             */
            if (!freeShipping
                    || order.getShipmentType() == ShipmentType.INTERNATIONAL
                    || order.getShipmentType() == ShipmentType.INTERNATIONAL_EXPEDITED
                    || orderItem.getProductType() == ProductType.FURNITUREDECOR){
                //unless the order is eligible for free shipping
                totalDeposit += orderItem.getQuantity()
                        * getShippingRate(orderItem.getProductType(),
                        order.getShipmentType());
            }

            //add gift wrap charges
            if (orderItem.isGiftWrap()){
                totalDeposit += orderItem.getQuantity()
                        * getGiftWrapRate(orderItem.getProductType());
            }

            //subtract variable closing fee
            totalDeposit -= orderItem.getQuantity()
                    * getVariableClosingFree(orderItem.getProductType(),
                    order.getShipmentType());

            //subtract per-item fee
            /*
            * BUG!!!
            *
            * #6
            * 0.99$ не включно
            *
            * */

            if (orderItem.getPrice() > PER_ITEM_FEE){
                totalDeposit -= orderItem.getQuantity() * PER_ITEM_FEE;
            }
        }

        //tackle the problem of referral fees for watches
        if (totalWatchPrice > 0.0) {
            //if there were some watches in the order,
            //this means that the date of the order
            //falls in the specified range, and we
            //need to calculate appropriate referral fees

            if (totalWatchPrice <= WATCH_REFERRAL_LIMIT1){
                //decide, which one to apply---regular or minimum
                if (totalWatchPrice * WATCH_REFERRAL_RATE1
                        > getReferralFeeMinimum(ProductType.WATCHES)){
                    totalDeposit += totalWatchPrice
                            * (1.0 - WATCH_REFERRAL_RATE1);
                }
                else{
                    totalDeposit += totalWatchPrice
                            - getReferralFeeMinimum(ProductType.WATCHES);
                }
            }
            else if (totalWatchPrice <= WATCH_REFERRAL_LIMIT2){
                totalDeposit +=
                        WATCH_REFERRAL_LIMIT1
                                * (1.0 - WATCH_REFERRAL_RATE1) +
                                (totalWatchPrice - WATCH_REFERRAL_LIMIT1)
                                        * (1.0 - WATCH_REFERRAL_RATE2);
            }
            else{

                /*
                 * BUG!!!
                 *
                 * #7
                 * Замінити totalWatchPrice на WATCH_REFERRAL_LIMIT2
                 */

                totalDeposit +=
                        WATCH_REFERRAL_LIMIT1
                                * (1.0 - WATCH_REFERRAL_RATE2) +
                                (WATCH_REFERRAL_LIMIT2 - WATCH_REFERRAL_LIMIT1)
                                        * (1.0 - WATCH_REFERRAL_RATE1) +
                                (totalWatchPrice - WATCH_REFERRAL_LIMIT2)
                                        * (1.0 - WATCH_REFERRAL_RATE3);
            }
        }

        return totalDeposit;
    }

    /**
     * Method for determining if the order is eligible for
     * free shipping.
     *
     * @return Returns true if the order is eligible for
     * free shipping.
     */
    private boolean isEligibleForFreeShipping(){
        for (ProductType productType:ProductType.values()){
            /*
            * BUG!!!
            *
            * #8
            * totalPrice рахується по кожному типу окремо
            *
            * */
            double totalPriceInType = 0.0;

            //calculate the total price in this category
            for (OrderItem orderItem:order.getOrderItems()){
                if (orderItem.getProductType() == productType){
                    totalPriceInType += orderItem.getTotalPrice();
                }
            }

            //check the eligibility conditions
            if (productType == ProductType.BOOKS){
                /*
                * BUG!!!
                *
                * #9
                * FREE_SHIPPING_BOOK_LIMIT знак >= включно.
                *
                * */
                if (totalPriceInType >= FREE_SHIPPING_BOOK_LIMIT){
                    return true;
                }
            }

            /*
             * BUG!!!
             *
             * #10
             * Див. помилку №1. Зайва перевірка для електроніки.
             *
             * else if (productType == ProductType.ELECTRONICS){
             *     if (totalPriceInType > FREE_SHIPPING_ELECTRONICS_LIMIT){
             *         return true;
             *     }
             * }
             *
             */

            else {
                if (totalPriceInType >= FREE_SHIPPING_LIMIT){
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Method for determining if jewelry sales are applicable
     * to this order.
     *
     * @return Returns true if jewelry sales are applicable to this order.
     */
    private boolean isJewelrySalesApplicable(){
        //first check if the order date belongs to
        //the interval of the sales dates
        if (order.getDate().after(jewelrySalesStartDate)
                &&
                order.getDate().before(jewelrySalesEndDate)){
            //calculate total price of all jewelry items
            double totalJewelryPrice = 0.0;

            //keep track of the number of jewelry items in the order
            int jewelryCount = 0;

            for (OrderItem orderItem : order.getOrderItems()){
                if (orderItem.getProductType() == ProductType.JEWELRY){
                    totalJewelryPrice += orderItem.getTotalPrice();

                    /*
                     * BUG!!!
                     *
                     * #11
                     *
                     * Необхідно рахувати усі одиниці ювелірних виробів, а не одиниці
                     * замовлень з ними
                     */

                    jewelryCount += orderItem.getQuantity();
                }
            }

            if (jewelryCount > 1 && totalJewelryPrice > JEWELRY_SALES_LIMIT){
                //if the number of jewelry items is bigger than one,
                //and the total price is bigger than JEWELRY_SALES_LIMIT
                return true;
            }
        }

        return false;
    }

    private double getShippingRate(ProductType productType,
                                   ShipmentType shipmentType){

        double shippingRate = 0.0;

        switch (productType){
            case BOOKS:
                switch (shipmentType){
                    case DOMESTIC:
                        shippingRate = 3.99;
                        break;
                    case DOMESTIC_EXPEDITED:
                        shippingRate = 6.99;
                        break;
                    case INTERNATIONAL:
                        shippingRate = 16.95;
                        break;
                    case INTERNATIONAL_EXPEDITED:
                        shippingRate = 46.50;
                        break;
                }

                /*
                    BUG!!!

                    # 12
                    Для Clothing не визначено окремої вартості доставки

                    case CLOTHING:
                        switch (order.getShipmentType()){
                            case DOMESTIC:
                                return 3.99;
                            case DOMESTIC_EXPEDITED:
                                return 6.99;
                            case INTERNATIONAL:
                                return 16.95;
                            case INTERNATIONAL_EXPEDITED:
                                return 46.50;
                            default:
                                return 0.00;
                        }
                */

            case MUSIC:
                /*
                 * BUG!!!
                 *
                 * #13
                 * Замість order.getShipmentType() необхідно вкахувати просто
                 * shipmentType
                 */
                switch (shipmentType){
                    case DOMESTIC:
                        shippingRate = 3.99;
                        break;
                    case DOMESTIC_EXPEDITED:
                        /*
                        * BUG!!!
                        *
                        * # 14
                        * Вартість доставки 6.19$, а не 6.99$.
                        *
                        * */
                        shippingRate = 6.99;
                        break;
                    case INTERNATIONAL:
                        shippingRate = 14.95;
                        break;
                    case INTERNATIONAL_EXPEDITED:
                        shippingRate = 46.50;
                        break;
                }
            case VIDEO:
                switch (shipmentType){
                    case DOMESTIC:
                        shippingRate = 3.99;
                        break;
                    case DOMESTIC_EXPEDITED:
                        shippingRate = 6.19;
                        break;
                    case INTERNATIONAL:
                        shippingRate = 14.95;
                        break;
                    case INTERNATIONAL_EXPEDITED:
                        shippingRate = 46.50;
                        break;
                }
            default:
                switch (shipmentType){
                    case DOMESTIC:
                        shippingRate = 4.49;
                        break;
                    case DOMESTIC_EXPEDITED:
                        shippingRate = 6.49;
                        break;
                    case INTERNATIONAL:
                        shippingRate = 24.95;
                        break;
                    case INTERNATIONAL_EXPEDITED:
                        shippingRate = 66.50;
                        break;
                }
        }

        return shippingRate;
    }

    private double getGiftWrapRate(ProductType productType){
        double giftWrapRate;

        switch (productType){
            case CLOTHING:
                giftWrapRate = 6.99;
                break;
            case ELECTRONICS:
                /*
                 * BUG!!!
                 *
                 * #15
                 * Для ELECTRONICS вартість обгортки становить 11.99$, а не 10.99;
                 *
                 */
                giftWrapRate = 11.99;
                break;
            case FURNITUREDECOR:
                giftWrapRate = 24.99;
                break;
            case JEWELRY:
                giftWrapRate = 3.79;
                break;
            case WATCHES:
                giftWrapRate = 2.99;
                break;
            default:
                giftWrapRate = 0.0;
                break;
        }

        return giftWrapRate;
    }

    /*
    * BUG!!!
    *
    * # 16
    *
    * Недосяжний участок коду в default.
    * */
    private double getReferralFeeRate(ProductType productType) {
        double referralFeeRate = 0.0;

        switch (productType){
            case BOOKS:
                referralFeeRate = 0.15;
                break;
            case CLOTHING:
                referralFeeRate = 0.15;
                break;
            case ELECTRONICS:
                referralFeeRate = 0.08;
                break;
            case FURNITUREDECOR:
                referralFeeRate = 0.15;
                break;
            case JEWELRY:
                referralFeeRate = 0.20;
                break;
            case MUSIC:
                referralFeeRate = 0.15;
                break;
            case VIDEO:
                referralFeeRate = 0.15;
                break;
            case WATCHES:
                referralFeeRate = 0.15;
                break;
        }

        return referralFeeRate;
    }

    private double getReferralFeeMinimum(ProductType productType){
        double referralFeeMinimum = 0.0;

        switch (productType){
            case BOOKS:
                referralFeeMinimum = 0.00;
                break;
            case CLOTHING:
                referralFeeMinimum = 1.00;
                break;
            case ELECTRONICS:
                referralFeeMinimum = 1.00;
                break;
            case FURNITUREDECOR:
                referralFeeMinimum = 1.00;
                break;
            case JEWELRY:
                referralFeeMinimum = 2.00;
                break;
            case MUSIC:
                referralFeeMinimum = 0.00;
                break;
            case VIDEO:
                referralFeeMinimum = 0.00;
                break;
            case WATCHES:
                referralFeeMinimum = 2.00;
                break;
        }

        return referralFeeMinimum;
    }

    private double getVariableClosingFree(ProductType productType,
                                          ShipmentType shipmentType){

        double variableClosingFee = 0.0;

        switch (productType){
            case BOOKS:
                variableClosingFee = 1.35;
                break;
            case VIDEO:
                variableClosingFee = 1.35;
                break;
            case MUSIC:
                /*
                * BUG!!!
                *
                * #17
                * Variable closing fees don't apply to music
                *
                * */
                variableClosingFee = 0.0;
                break;
            default:
                switch (shipmentType){
                    case DOMESTIC:
                        variableClosingFee = 0.45;
                        break;
                    case DOMESTIC_EXPEDITED:
                        variableClosingFee = 0.65;
                        break;
                    case INTERNATIONAL:
                        variableClosingFee = 0.95;
                        break;
                    case INTERNATIONAL_EXPEDITED:
                        variableClosingFee = 1.15;
                        break;
                }
        }

        return variableClosingFee;
    }
}