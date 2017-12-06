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
}