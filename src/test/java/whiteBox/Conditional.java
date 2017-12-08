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

public class Conditional {
    Calendar calendar = Calendar.getInstance();

    @Test
    public void whiteBoxConditional0() {
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
    public void whiteBoxConditional1() {
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
    public void whiteBoxConditional2() {
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
    public void whiteBoxConditional3() {
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
    public void whiteBoxConditional4() {
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
    public void whiteBoxConditional5() {
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
    public void whiteBoxConditional6() {
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
    public void whiteBoxConditional7() {
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
    public void whiteBoxConditional8() {
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
    public void whiteBoxConditional9() {
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
    public void whiteBoxConditional10() {
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
    public void whiteBoxConditional11() {
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
    public void whiteBoxConditional12() {
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
    public void whiteBoxConditional13() {
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
    public void whiteBoxConditional14() {
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
    public void whiteBoxConditional15() {
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
    public void whiteBoxConditional16() {
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
    public void whiteBoxConditional17() {
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
    public void whiteBoxConditional18() {
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
    public void whiteBoxConditional19() {
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
    public void whiteBoxConditional20() {
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
    public void whiteBoxConditional21() {
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
    public void whiteBoxConditional22() {
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
    public void whiteBoxConditional23() {
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
    public void whiteBoxConditional24() {
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
    public void whiteBoxConditional25() {
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
    public void whiteBoxConditional26() {
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
    public void whiteBoxConditional27() {
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
    public void whiteBoxConditional28() {
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
    public void whiteBoxConditional29() {
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
    public void whiteBoxConditional30() {
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
    public void whiteBoxConditional31() {
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
    public void whiteBoxConditional32() {
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
    public void whiteBoxConditional33() {
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
    public void whiteBoxConditional34() {
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
    public void whiteBoxConditional35() {
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
    public void whiteBoxConditional36() {
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
    public void whiteBoxConditional37() {
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
    public void whiteBoxConditional38() {
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
    public void whiteBoxConditional39() {
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
    public void whiteBoxConditiona40() {
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
    public void whiteBoxConditional41() {
        calendar.set(2017, 12, 18);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 251, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 251, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 49, false));


        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }

    @Test
    public void whiteBoxConditional42() {
        calendar.set(2018, 3, 17);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.02, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 251, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }

    @Test
    public void whiteBoxConditional43() {
        calendar.set(2018, 3, 17);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.02, false));


        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }

    @Test
    public void whiteBoxConditional44() {
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
    public void whiteBoxConditional45() {
        calendar.set(2017, Calendar.OCTOBER, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 20, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }

    @Test
    public void whiteBoxConditional46() {
        calendar.set(2017, Calendar.OCTOBER, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 20, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }

    @Test
    public void whiteBoxConditional47() {
        calendar.set(2017, Calendar.OCTOBER, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 20, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }

    @Test
    public void whiteBoxConditional48() {
        calendar.set(2017, Calendar.OCTOBER, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 20, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }

    @Test
    public void whiteBoxConditional49() {
        calendar.set(2017, Calendar.OCTOBER, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 20, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }

    @Test
    public void whiteBoxConditional50() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();


        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 5, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 5, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }

    @Test
    public void whiteBoxConditional51() {
        calendar.set(2018, 2, 2);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 4, 600, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 4, 600, false));


        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }

    @Test
    public void whiteBoxConditional52() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 150, 5, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 150, 3, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 150, 3, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }

    @Test
    public void whiteBoxConditional53() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 150, 3, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }
}