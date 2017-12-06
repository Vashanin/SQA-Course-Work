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
public class TwoWay {

    Calendar calendar = Calendar.getInstance();

    @Test
    public void blackBox0() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox1() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox2() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 0, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox3() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 0, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 1, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 6.6, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox4() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 0, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 6.74, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox5() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 0, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 9.95, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox6() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 0, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 10.05, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox7() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 0, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox8() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 12.63, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox9() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox10() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 0, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox11() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 0, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox12() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 0, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox13() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 0, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 25, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox14() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 0, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox15() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 0, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 49, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox16() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 0, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 200, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 200.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox17() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 0, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 800, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox18() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 0, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 800, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 800.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox19() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 0, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 500, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox20() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 0, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 500, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 500.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox21() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 0, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox22() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 0, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 0.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox23() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox24() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox25() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 1, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 6.74, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox26() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 9.95, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox27() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox28() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 12.37, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox29() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 12.63, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox30() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 13.26, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox31() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox32() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox33() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 25, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox34() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 48.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox35() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 25, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 49, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox36() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 200, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox37() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 49, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 200.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox38() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 200, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 800, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox39() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 800.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox40() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 800, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 500, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox41() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 500.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox42() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 500, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 0, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox43() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 500.01, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 0.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox44() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 0, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox45() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox46() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 6.74, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox47() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 1, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 9.95, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox48() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox49() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 12.37, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox50() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox51() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 13.26, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox52() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 13.4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox53() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 24.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox54() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 25, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox55() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox56() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 49, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox57() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 25, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox58() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 200.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox59() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 49, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 800, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox60() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 200, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 800.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox61() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 500, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox62() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 800, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 500.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox63() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 0, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox64() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 500, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox65() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 0.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox66() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 1, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 0, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox67() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 1, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 6.74, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox68() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 1, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 9.95, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox69() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 1, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 1, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 10.05, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox70() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 1, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 12.37, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox71() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 1, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 12.63, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox72() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 1, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox73() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 1, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox74() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 1, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 24.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox75() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 1, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox76() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 1, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox77() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 1, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox78() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox79() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 1, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 25, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 200.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox80() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 1, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 800, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox81() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 1, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 49, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 800.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox82() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 1, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 200, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 500, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox83() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 1, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 500.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox84() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 1, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 800, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox85() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 1, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 0.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox86() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 1, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 500, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 0.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox87() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 1, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 500.01, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox88() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 0, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 6.74, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox89() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 9.95, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox90() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox91() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 1, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox92() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox93() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 13.26, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox94() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox95() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox96() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox97() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox98() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox99() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox100() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 200.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox101() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 25, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 800, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox102() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 800.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox103() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 49, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 500, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox104() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 200, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 500.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox105() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox106() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 800, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 0.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox107() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox108() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 500, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox109() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 500.01, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 6.6, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox110() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 25, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 0, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 9.95, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox111() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 25, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 10.05, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox112() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 25, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox113() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 25, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 1, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox114() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 25, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox115() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 25, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox116() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 25, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox117() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 25, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox118() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 25, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 48.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox119() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 25, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 49, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox120() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 25, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox121() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 25, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 200.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox122() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 25, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 800, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox123() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 25, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 25, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 800.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox124() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 25, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 500, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox125() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 25, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 49, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 500.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox126() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 25, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 200, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox127() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 25, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 0.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox128() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 25, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 800, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 0.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox129() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 25, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox130() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 25, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 500, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox131() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 25, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 6.74, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox132() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 0, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox133() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 12.37, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox134() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox135() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 1, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox136() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 13.4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox137() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox138() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox139() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 48.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox140() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 49, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox141() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 200, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox142() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 200.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox143() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 800, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox144() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 800.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox145() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 25, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 500, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox146() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 500.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox147() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 49, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox148() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 200, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 0.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox149() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 0.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox150() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 800, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox151() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox152() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 500, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 6.74, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox153() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 9.95, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox154() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 49, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 0, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox155() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 49, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 12.63, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox156() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 49, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox157() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 49, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 1, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox158() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 49, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 24.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox159() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 49, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox160() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 49, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox161() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 49, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 49, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox162() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 49, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox163() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 49, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 200.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox164() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 49, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 800, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox165() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 49, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 800.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox166() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 49, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 500, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox167() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 49, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 25, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 500.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox168() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 49, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 0, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox169() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 49, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 49, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox170() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 49, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 200, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 0.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox171() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 49, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox172() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 49, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 800, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox173() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 49, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 6.74, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox174() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 49, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 500, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 9.95, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox175() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 49, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox176() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 200, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 0, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox177() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 200, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 13.26, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox178() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 200, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 13.4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox179() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 200, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 1, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 24.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox180() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 200, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox181() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 200, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 48.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox182() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 200, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox183() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 200, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 200, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox184() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 200, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 200.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox185() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 200, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 800, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox186() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 200, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 800.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox187() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 200, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 500, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox188() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 200, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 500.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox189() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 200, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 25, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 0, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox190() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 200, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 0.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox191() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 200, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 49, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 0.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox192() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 200, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 200, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox193() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 200, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 6.6, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox194() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 200, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 800, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 6.74, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox195() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 200, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 9.95, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox196() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 200, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 500, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 10.05, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox197() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 200, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 12.37, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox198() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 0, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox199() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox200() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox201() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 1, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 25, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox202() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox203() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox204() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 200, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox205() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 200.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox206() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 800, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox207() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 800.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox208() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 500, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox209() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 500.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox210() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox211() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 25, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 0.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox212() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 0.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox213() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 49, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox214() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 200, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox215() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 6.74, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox216() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 800, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 9.95, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox217() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox218() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 500, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox219() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox220() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 800, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 13.4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox221() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 800, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 24.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox222() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 800, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox223() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 800, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 1, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 48.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox224() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 800, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox225() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 800, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 200, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox226() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 800, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 200.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox227() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 800, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 800, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox228() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 800, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 800.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox229() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 800, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 500, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox230() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 800, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 500.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox231() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 800, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 0, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox232() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 800, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 0.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox233() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 800, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 25, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 0.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox234() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 800, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox235() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 800, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 49, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox236() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 800, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 200, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 6.74, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox237() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 800, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 9.95, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox238() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 800, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 800, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox239() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 800, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 12.37, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox240() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 800, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 500, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox241() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 800, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox242() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 0, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox243() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 25, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox244() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 48.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox245() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 1, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 49, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox246() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox247() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 200.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox248() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 800, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox249() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 800.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox250() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 500, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox251() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 500.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox252() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox253() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 0.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox254() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox255() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 25, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox256() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox257() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 49, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.74, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox258() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 200, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 9.95, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox259() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox260() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 800, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 12.37, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox261() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox262() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 500, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox263() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox264() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox265() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox266() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox267() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox268() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 200.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox269() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 800, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox270() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 800.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox271() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 500, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox272() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 500.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox273() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox274() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 0.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox275() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 0.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox276() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox277() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 25, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox278() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 6.74, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox279() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 49, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 9.95, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox280() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 200, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 10.05, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox281() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 12.37, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox282() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 800, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 12.63, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox283() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 13.26, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox284() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 500, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox285() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 24.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox286() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 0, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 48.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox287() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 49, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox288() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox289() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 200.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox290() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 800, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox291() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 800.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox292() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 500, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox293() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 500.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox294() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox295() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 0.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox296() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 0.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox297() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox298() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 6.6, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox299() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 25, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 6.74, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox300() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 9.95, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox301() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 49, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox302() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 200, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox303() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox304() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 800, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 13.26, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox305() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 13.4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox306() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 500, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox307() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 500.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 25, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox308() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 0, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox309() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 200, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox310() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 200.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox311() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 800, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox312() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 800.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox313() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 500, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox314() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 500.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox315() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox316() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 0.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox317() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 0.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox318() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox319() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 6.6, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox320() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 6.74, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox321() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 25, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 9.95, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox322() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox323() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 49, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox324() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 200, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox325() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox326() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 800, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox327() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox328() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 500, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox329() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox330() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 0, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox331() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 200.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox332() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 800, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox333() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 800.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox334() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 500, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox335() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 500.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox336() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox337() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 0.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox338() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 0.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox339() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox340() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox341() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.74, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox342() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 9.95, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox343() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 25, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox344() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox345() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 49, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox346() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 200, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox347() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox348() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 800, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox349() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox350() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 500, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox351() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 500.01, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox352() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 0, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 200.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox353() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 800, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox354() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 800.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox355() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 500, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox356() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 500.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox357() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox358() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 0.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox359() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 0.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox360() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox361() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 6.6, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox362() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.74, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox363() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 9.95, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox364() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox365() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 25, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox366() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox367() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 49, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 13.26, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox368() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 200, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 13.4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox369() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox370() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 800, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox371() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox372() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 500, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 49, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox373() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 500.01, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 200, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox374() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 0, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 800, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox375() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 800.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox376() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 500, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox377() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 500.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox378() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox379() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 0.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox380() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 0.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox381() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox382() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 6.6, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox383() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 6.74, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox384() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 9.95, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox385() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 10.05, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox386() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox387() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 25, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 12.63, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox388() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox389() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 49, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox390() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 200, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox391() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 25, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox392() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 800, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 48.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox393() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox394() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 500, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox395() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 200.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox396() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 0, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 800.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox397() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 500, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox398() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 500.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox399() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox400() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 0.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox401() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 0.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox402() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox403() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox404() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 6.74, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox405() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 9.95, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox406() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox407() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox408() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 12.63, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox409() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 25, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox410() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 13.4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox411() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 49, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 24.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox412() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 200, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox413() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 48.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox414() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 800, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox415() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox416() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 500, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 200.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox417() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 800, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox418() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 0, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 500, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox419() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 500.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox420() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 0, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox421() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox422() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 0.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox423() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox424() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 6.6, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox425() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.74, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox426() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 9.95, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox427() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 10.05, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox428() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox429() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox430() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox431() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 25, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 13.4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox432() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox433() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 49, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox434() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 200, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox435() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox436() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 800, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 200, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox437() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 200.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox438() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 500, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 800, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox439() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 500.01, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 800.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox440() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 500, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 0, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 500.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox441() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 500, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox442() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 500, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 0.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox443() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 500, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox444() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 500, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox445() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 500, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox446() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 500, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 6.74, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox447() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 500, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 9.95, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox448() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 500, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox449() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 500, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox450() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 500, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 12.63, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox451() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 500, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 13.26, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox452() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 500, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox453() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 500, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 25, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 24.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox454() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 500, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox455() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 500, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 49, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 48.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox456() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 500, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 200, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox457() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 500, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 200, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox458() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 500, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 800, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 200.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox459() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 500, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 800, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox460() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 500, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 500, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 800.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox461() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 500, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 500, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox462() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 0, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox463() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 500.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 0.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox464() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 500.01, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 0.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox465() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox466() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 500.01, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox467() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 500.01, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 6.74, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox468() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 500.01, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 9.95, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox469() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox470() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox471() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox472() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox473() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox474() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 500.01, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox475() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 25, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox476() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 500.01, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 48.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox477() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 500.01, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 49, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox478() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 200, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 200, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox479() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 200.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox480() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 800, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 800, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox481() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 500.01, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 800.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox482() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 500, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 500, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox483() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 500.01, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 500.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBox484() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 500, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }

}