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

public class Statement {
    Calendar calendar = Calendar.getInstance();

    @Test
    public void whiteBoxStatement0() {
        calendar.set(2017, Calendar.OCTOBER, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 250, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement1() {
        calendar.set(2017, Calendar.OCTOBER, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 20, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement2() {
        calendar.set(2017, Calendar.OCTOBER, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 20, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement3() {
        calendar.set(2017, Calendar.OCTOBER, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 50, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement4() {
        calendar.set(2017, Calendar.OCTOBER, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 50, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement5() {
        calendar.set(2017, Calendar.OCTOBER, 10);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 50, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement6() {
        calendar.set(2018, Calendar.JANUARY, 05);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 50, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement7() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 260, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement8() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 30, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement9() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 30, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement10() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 50, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement11() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 50, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement12() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 150, 5, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement13() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 400, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement14() {
        calendar.set(2018, Calendar.FEBRUARY, 23);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 400, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement15() {
        calendar.set(2018, Calendar.MAY, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 400, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement16() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 5, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement17() {
        calendar.set(2018, Calendar.JANUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 20, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement18() {
        calendar.set(2018, Calendar.JUNE, 23);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 15, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement19() {
        calendar.set(2018, Calendar.JUNE, 23);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 20, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement20() {
        calendar.set(2018, Calendar.JULY, 25);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 40, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement21() {
        calendar.set(2018, Calendar.JULY, 25);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 20, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement22() {
        calendar.set(2018, Calendar.JULY, 25);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 23, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement23() {
        calendar.set(2018, Calendar.FEBRUARY, 25);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 30, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement24() {
        calendar.set(2018, Calendar.MARCH, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement25() {
        calendar.set(2018, Calendar.MARCH, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 200, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement26() {
        calendar.set(2018, Calendar.MARCH, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 200, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement27() {
        calendar.set(2018, Calendar.MARCH, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 20, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement28() {
        calendar.set(2018, Calendar.MARCH, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 850, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement29() {
        calendar.set(2018, Calendar.MARCH, 01);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.9, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement30() {
        calendar.set(2018, Calendar.MAY, 02);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 200, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement31() {
        calendar.set(2018, Calendar.OCTOBER, 11);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 20, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void whiteBoxStatement32() {
        calendar.set(2018, Calendar.NOVEMBER, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.9, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }

    @Test
    public void whiteBoxStatement33() {
        calendar.set(2018, Calendar.NOVEMBER, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 0.9, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }

    @Test
    public void whiteBoxStatement34() {
        calendar.set(2018, Calendar.NOVEMBER, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 0.9, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }

    @Test
    public void whiteBoxStatement35() {
        calendar.set(2018, Calendar.NOVEMBER, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 0.9, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }

    @Test
    public void whiteBoxStatement36() {
        calendar.set(2018, Calendar.NOVEMBER, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 0.9, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }

    @Test
    public void whiteBoxStatement37() {
        calendar.set(2018, Calendar.NOVEMBER, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0.9, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0.9, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }

    @Test
    public void whiteBoxStatement38() {
        calendar.set(2018, Calendar.NOVEMBER, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0.9, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0.9, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }
    @Test
    public void whiteBoxStatement39() {
        calendar.set(2018, Calendar.NOVEMBER, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0.9, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }
    @Test
    public void whiteBoxStatement40() {
        calendar.set(2018, Calendar.NOVEMBER, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0.9, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 0.9, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0.9, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }
    @Test
    public void whiteBoxStatement41() {
        calendar.set(2018, Calendar.FEBRUARY, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 542, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }

    @Test
    public void whiteBoxStatement42() {
        calendar.set(2018, 01, 20);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 542, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 789, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 0.5, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }

}