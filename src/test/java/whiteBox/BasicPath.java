package whiteBox;

import deposit.FixedTotalDeposit;
import deposit.TotalDeposit;
import order.Order;
import order.OrderItem;
import order.ProductType;
import order.ShipmentType;
import org.junit.Test;

import java.util.Calendar;
import static org.junit.Assert.assertTrue;

/**
 * Created by vashanin on 06.12.17.
 */
public class BasicPath {
    Calendar calendar = Calendar.getInstance();

    @Test
    public void whiteBoxBasicPath0() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 260, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 10, 2, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath1() {
        calendar.set(2018, Calendar.MARCH, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 25, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 2, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath2() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 150, 5, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 150, 3, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath3() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 5, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 100, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath4() {
        calendar.set(2018, Calendar.MARCH, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 20, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 20, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath5() {
        calendar.set(2017, Calendar.OCTOBER, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 250, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 20, 21, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath6() {
        calendar.set(2018, Calendar.NOVEMBER, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.9, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath7() {
        calendar.set(2018, Calendar.MARCH, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.9, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 100, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath8() {
        calendar.set(2018, Calendar.MARCH, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 850, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 20, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath9() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 30, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 2, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath10() {
        calendar.set(2017, Calendar.OCTOBER, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 20, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath11() {
        calendar.set(2017, Calendar.OCTOBER, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 50, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 5, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath12() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 20, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 3, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath13() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 50, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath14() {
        calendar.set(2018, Calendar.MARCH, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 200, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 5, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath15() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 400, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 20, 21, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath16() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 12, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath17() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 30, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 2, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath18() {
        calendar.set(2017, Calendar.OCTOBER, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 20, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 21, 2, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath19() {
        calendar.set(2017, Calendar.OCTOBER, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 15, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath20() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 20, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 5, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath21() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 50, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 7, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath22() {
        calendar.set(2018, Calendar.MARCH, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 21, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 3, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath23() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 40, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath24() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 10, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath25() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 30, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 2, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath26() {
        calendar.set(2017, Calendar.OCTOBER, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 20, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 3, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath27() {
        calendar.set(2017, Calendar.OCTOBER, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 50, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 5, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath28() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 20, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath29() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 50, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 3, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath30() {
        calendar.set(2018, Calendar.MARCH, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 200, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 2, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath31() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 400, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 5, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath32() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 10, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath33() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 150, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 10, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath34() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 20, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 5, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath35() {
        calendar.set(2017, Calendar.OCTOBER, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 1, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath36() {
        calendar.set(2017, Calendar.JANUARY, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 2, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath37() {
        calendar.set(2019, Calendar.JANUARY, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 3, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath38() {
        calendar.set(2019, Calendar.MAY, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 1, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath39() {
        calendar.set(2016, Calendar.APRIL, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 2, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath40() {
        calendar.set(2020, Calendar.OCTOBER, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 3, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath41() {
        calendar.set(2016, Calendar.MAY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 4, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath42() {
        calendar.set(2015, Calendar.DECEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath43() {
        calendar.set(2017, Calendar.OCTOBER, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 2, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath44() {
        calendar.set(2017, Calendar.JANUARY, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 3, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath45() {
        calendar.set(2019, Calendar.JANUARY, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 4, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath46() {
        calendar.set(2019, Calendar.MAY, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 1, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath47() {
        calendar.set(2016, Calendar.APRIL, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 2, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath48() {
        calendar.set(2017, Calendar.OCTOBER, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 3, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath49() {
        calendar.set(2017, Calendar.JANUARY, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 4, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath50() {
        calendar.set(2019, Calendar.JANUARY, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 1, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath51() {
        calendar.set(2019, Calendar.MAY, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 2, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath52() {
        calendar.set(2016, Calendar.APRIL, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 3, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath53() {
        calendar.set(2019, Calendar.MAY, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 4, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath54() {
        calendar.set(2017, Calendar.JANUARY, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 2, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath55() {
        calendar.set(2019, Calendar.JANUARY, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 2, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath56() {
        calendar.set(2019, Calendar.MAY, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 3, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath57() {
        calendar.set(2016, Calendar.APRIL, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 1, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath58() {
        calendar.set(2017, Calendar.OCTOBER, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 2, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath59() {
        calendar.set(2017, Calendar.JANUARY, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 3, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath60() {
        calendar.set(2019, Calendar.JANUARY, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 2, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath61() {
        calendar.set(2019, Calendar.MAY, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 1, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 4, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath62() {
        calendar.set(2016, Calendar.APRIL, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 2, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath63() {
        calendar.set(2019, Calendar.MAY, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 3, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath64() {
        calendar.set(2017, Calendar.OCTOBER, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 2, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath65() {
        calendar.set(2017, Calendar.JANUARY, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 1, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath66() {
        calendar.set(2019, Calendar.JANUARY, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 3, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath67() {
        calendar.set(2019, Calendar.MAY, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 1, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath68() {
        calendar.set(2016, Calendar.APRIL, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 2, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath69() {
        calendar.set(2019, Calendar.MAY, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 1, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 4, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath70() {
        calendar.set(2018, Calendar.FEBRUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 900, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 450, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath71() {
        calendar.set(2018, Calendar.FEBRUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 250, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 450, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath72() {
        calendar.set(2018, Calendar.FEBRUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1000, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 450, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath73() {
        calendar.set(2018, Calendar.FEBRUARY, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 450, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 1200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxBasicPath74() {
        calendar.set(2018, Calendar.MARCH, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 320, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 650, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }

    @Test
    public void whiteBoxBasicPath75() {
        calendar.set(2018, Calendar.MARCH, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, -3, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, -5, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }
}
