package blackBox;

import deposit.FixedTotalDeposit;
import deposit.TotalDeposit;
import order.Order;
import order.OrderItem;
import order.ProductType;
import order.ShipmentType;
import org.junit.Test;

import java.util.Calendar;
import java.util.LinkedList;

import static org.junit.Assert.assertTrue;

/**
 * Created by vashanin on 06.12.17.
 */

public class OneWay {
    Calendar calendar = Calendar.getInstance();

    @Test
    public void blackBoxOneWay0() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxOneWay1() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxOneWay2() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 1, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxOneWay3() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 1, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 6.6, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxOneWay4() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 6.74, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxOneWay5() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 25, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 9.95, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxOneWay6() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 10.05, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxOneWay7() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 49, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxOneWay8() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 200, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxOneWay9() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 13.26, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxOneWay10() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 800, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxOneWay11() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxOneWay12() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 25, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 25, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxOneWay13() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxOneWay14() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 49, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 49, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxOneWay15() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 200, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxOneWay16() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 200.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxOneWay17() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 800, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 800, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxOneWay18() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 800.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxOneWay19() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 500, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 500, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxOneWay20() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 500, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 500.01, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 500.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxOneWay21() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 0, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 0, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }
}