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


public class TestTotalDeposit {
	private static final Calendar calendar = Calendar.getInstance();


    @Test
    public void whiteBox0() {
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
    public void whiteBox1() {
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
    public void whiteBox2() {
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
    public void whiteBox3() {
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
    public void whiteBox4() {
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
    public void whiteBox5() {
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
    public void whiteBox6() {
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
    public void whiteBox7() {
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
    public void whiteBox8() {
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
    public void whiteBox9() {
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
    public void whiteBox10() {
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
    public void whiteBox11() {
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
    public void whiteBox12() {
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
    public void whiteBox13() {
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
    public void whiteBox14() {
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
    public void whiteBox15() {
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
    public void whiteBox16() {
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
    public void whiteBox17() {
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
    public void whiteBox18() {
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
    public void whiteBox19() {
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
    public void whiteBox20() {
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
    public void whiteBox21() {
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
    public void whiteBox22() {
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
    public void whiteBox23() {
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
    public void whiteBox24() {
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
    public void whiteBox25() {
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
    public void whiteBox26() {
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
    public void whiteBox27() {
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
    public void whiteBox28() {
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
    public void whiteBox29() {
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
    public void whiteBox30() {
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
    public void whiteBox31() {
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
    public void whiteBox32() {
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
    public void whiteBox33() {
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
    public void whiteBox34() {
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
    public void blackBoxTestBy3() throws Exception {
        ParseFile csvFile = new ParseFile("TotalDeposit-output.csv");
        LinkedList<Order> testOrders = csvFile.getOrdersFromCSV();

        int amountOfPassedTests = 0;
        for (int i = 0; i < testOrders.size(); i++) {
            TotalDeposit deposit = new TotalDeposit(testOrders.get(i));
            FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(testOrders.get(i));

            double actualValue = deposit.getTotalDeposit();
            double expectedValue = fixedDeposit.getTotalDeposit();

            boolean assertTrue = (Math.abs(actualValue - expectedValue) < 1e-10);

            if (assertTrue)
                amountOfPassedTests++;

            assertTrue(Math.abs(actualValue - expectedValue) < 1e-10);
        }

        //System.out.println("\nThree way Black Box tests:");
        //System.out.println("\tTotal amount of tests: " + testOrders.size());
        //System.out.println("\tAmount of passed tests: " + amountOfPassedTests);

        //TotalDeposit deposit = new TotalDeposit(testOrders.get(0));
        //FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(testOrders.get(0));

        //double actualValue = deposit.getTotalDeposit();
        //double expectedValue = fixedDeposit.getTotalDeposit();
    }


    @Test
    public void blackBoxTestByOne1() {
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
    public void blackBoxTestByOne2() {
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
    public void blackBoxTestByOne3() {
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
    public void blackBoxTestByOne4() {
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
    public void blackBoxTestByOne5() {
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
    public void blackBoxTestByOne6() {
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
    public void blackBoxTestByOne7() {
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
    public void blackBoxTestByOne8() {
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
    public void blackBoxTestByOne9() {
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
    public void blackBoxTestByOne10() {
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
    public void blackBoxTestByOne11() {
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
    public void blackBoxTestByOne12() {
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
    public void blackBoxTestByOne13() {
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
    public void blackBoxTestByOne14() {
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
    public void blackBoxTestByOne15() {
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
    public void blackBoxTestByOne16() {
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
    public void blackBoxTestByOne17() {
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
    public void blackBoxTestByOne18() {
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
    public void blackBoxTestByOne19() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 0, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo0() {
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
    public void blackBoxTestByTwo1() {
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
    public void blackBoxTestByTwo2() {
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
    public void blackBoxTestByTwo3() {
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
    public void blackBoxTestByTwo4() {
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
    public void blackBoxTestByTwo5() {
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
    public void blackBoxTestByTwo6() {
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
    public void blackBoxTestByTwo7() {
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
    public void blackBoxTestByTwo8() {
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
    public void blackBoxTestByTwo9() {
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
    public void blackBoxTestByTwo10() {
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
    public void blackBoxTestByTwo11() {
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
    public void blackBoxTestByTwo12() {
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
    public void blackBoxTestByTwo13() {
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
    public void blackBoxTestByTwo14() {
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
    public void blackBoxTestByTwo15() {
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
    public void blackBoxTestByTwo16() {
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
    public void blackBoxTestByTwo17() {
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
    public void blackBoxTestByTwo18() {
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
    public void blackBoxTestByTwo19() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 0, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo20() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 0, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 0.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo21() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo22() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo23() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 1, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 6.74, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo24() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 9.95, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo25() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 10.05, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo26() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 12.37, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo27() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 12.63, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo28() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo29() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo30() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo31() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 25, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo32() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 48.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo33() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 25, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 49, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo34() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 200, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo35() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 49, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 200.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo36() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 200, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 800, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo37() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 800.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo38() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 800, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 0, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo39() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 0.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo40() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 0, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo41() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 0.01, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo42() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 6.74, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo43() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 1, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 9.95, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo44() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo45() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo46() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo47() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 13.26, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo48() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 13.4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo49() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 24.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo50() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo51() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo52() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 49, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo53() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 25, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo54() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 200.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo55() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 49, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 800, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo56() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 200, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 800.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo57() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 0, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo58() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 800, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 0.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo59() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 0.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo60() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 1, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 0, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo61() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 1, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 6.74, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo62() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 1, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 9.95, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo63() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 1, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 1, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo64() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 1, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 12.37, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo65() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 1, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 12.63, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo66() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 1, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo67() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 1, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 13.4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo68() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 1, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo69() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 1, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo70() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 1, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo71() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 1, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo72() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 1, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo73() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 1, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 25, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 200.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo74() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 1, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 800, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo75() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 1, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 49, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 800.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo76() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 1, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 200, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 0, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo77() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 1, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 0.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo78() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 1, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 800, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo79() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 1, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo80() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 0, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 6.74, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo81() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 9.95, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo82() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 10.05, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo83() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 12.37, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo84() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo85() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo86() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 13.4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo87() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 24.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo88() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 25, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo89() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 48.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo90() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo91() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo92() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 200.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo93() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 25, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 800, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo94() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 800.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo95() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 49, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 0, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo96() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 200, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo97() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 0.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo98() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 800, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo99() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo100() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 25, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 0, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 9.95, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo101() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 25, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 10.05, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo102() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 25, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo103() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 25, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 1, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 12.63, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo104() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 25, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 13.26, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo105() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 25, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo106() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 25, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo107() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 25, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo108() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 25, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 48.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo109() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 25, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 49, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo110() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 25, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 200, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo111() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 25, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 200.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo112() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 25, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 800, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo113() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 25, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 25, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 800.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo114() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 25, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo115() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 25, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 49, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 0.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo116() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 25, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 200, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo117() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 25, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo118() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 25, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 800, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 6.6, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo119() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 25, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 6.74, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo120() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo121() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 12.37, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo122() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo123() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 1, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo124() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 13.4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo125() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo126() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo127() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo128() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo129() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo130() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 200.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo131() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 800, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo132() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 800.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo133() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 25, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo134() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 0.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo135() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 49, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 0.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo136() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 200, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo137() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo138() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 800, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 6.74, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo139() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 9.95, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo140() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 49, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 0, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo141() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 49, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 12.63, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo142() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 49, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 13.26, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo143() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 49, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 1, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo144() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 49, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo145() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 49, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 25, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo146() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 49, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo147() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 49, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 49, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo148() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 49, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo149() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 49, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 200.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo150() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 49, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 800, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo151() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 49, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 800.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo152() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 49, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 0, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo153() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 49, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 25, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 0.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo154() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 49, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 0.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo155() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 49, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 49, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo156() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 49, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 200, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo157() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 49, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 6.74, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo158() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 49, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 800, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 9.95, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo159() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 49, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo160() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 200, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo161() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 200, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 13.26, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo162() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 200, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo163() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 200, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 1, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 24.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo164() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 200, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 25, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo165() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 200, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo166() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 200, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo167() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 200, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo168() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 200, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 200.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo169() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 200, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 800, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo170() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 200, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 800.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo171() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 200, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo172() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 200, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 0.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo173() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 200, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 25, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 0.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo174() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 200, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo175() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 200, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 49, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 6.6, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo176() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 200, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 200, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 6.74, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo177() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 200, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 9.95, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo178() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 200, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 800, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo179() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 200, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo180() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 0, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo181() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo182() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo183() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 1, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 25, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo184() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo185() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 49, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo186() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo187() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 200.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo188() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 800, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo189() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 800.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo190() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 0, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo191() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 0.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo192() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 0.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo193() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 25, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo194() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 6.6, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo195() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 49, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 6.74, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo196() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 200, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 9.95, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo197() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 10.05, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo198() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 800, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo199() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo200() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 800, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 0, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 13.4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo201() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 800, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 24.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo202() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 800, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 25, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo203() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 800, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 1, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo204() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 800, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo205() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 800, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo206() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 800, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 200.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo207() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 800, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 800, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo208() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 800, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 800.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo209() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 800, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo210() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 800, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 0.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo211() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 800, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 0.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo212() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 800, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo213() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 800, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 25, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 6.6, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo214() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 800, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 6.74, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo215() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 800, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 49, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 9.95, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo216() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 800, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 200, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo217() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 800, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 12.37, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo218() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 800, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 800, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 12.63, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo219() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 800, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo220() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo221() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 25, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo222() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 48.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo223() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 1, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo224() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo225() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 200.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo226() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 800, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo227() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 800.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo228() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 0, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo229() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 0.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo230() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 0.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo231() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo232() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 6.6, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo233() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 25, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 6.74, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo234() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 9.95, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo235() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 49, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo236() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 200, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo237() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 12.63, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo238() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 800, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo239() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo240() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo241() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo242() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 49, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo243() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 1, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 200, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo244() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 200.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo245() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 800, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo246() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 800.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo247() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo248() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 0.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo249() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 0.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo250() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo251() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo252() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 6.74, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo253() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 25, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 9.95, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo254() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 10.05, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo255() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 49, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 12.37, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo256() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 200, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 12.63, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo257() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 13.26, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo258() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 800, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 13.4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo259() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo260() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 48.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo261() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 49, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo262() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 200, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo263() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 1, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 200.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo264() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 800, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo265() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 800.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo266() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo267() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 0.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo268() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 0.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo269() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo270() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 6.6, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo271() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 6.74, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo272() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 9.95, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo273() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 25, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 10.05, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo274() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 12.37, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo275() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 49, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo276() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 200, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo277() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo278() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 800, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo279() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 25, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo280() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo281() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 200, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo282() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 200.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo283() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 1, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 800, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo284() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 800.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo285() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 0, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo286() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 0.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo287() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 0.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo288() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo289() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 6.6, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo290() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 6.74, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo291() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 9.95, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo292() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 10.05, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo293() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 25, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo294() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 12.63, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo295() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 49, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo296() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 200, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 13.4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo297() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 24.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo298() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 800, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 25, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo299() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo300() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 200, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo301() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 200.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo302() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 800, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo303() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 1, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 800.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo304() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo305() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 0.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo306() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 0.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo307() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo308() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo309() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 6.74, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo310() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 9.95, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo311() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo312() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo313() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 25, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo314() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 48.99, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 13.26, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo315() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 49, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 13.4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo316() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 200, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 24.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo317() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 25, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo318() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 800, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo319() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 9.95, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo320() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 200.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo321() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 800, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo322() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 800.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo323() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 1, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo324() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 0.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo325() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 0.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo326() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo327() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo328() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 6.74, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo329() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 9.95, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo330() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 10.05, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo331() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo332() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo333() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 25, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 13.26, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo334() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo335() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 49, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 24.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo336() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 200, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo337() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 48.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo338() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 800, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo339() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 800.01, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 200, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo340() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 800, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo341() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 800.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo342() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo343() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 1, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo344() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 0.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo345() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo346() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 6.6, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo347() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 6.74, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo348() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 9.95, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo349() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 10.05, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo350() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 12.37, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo351() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo352() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 13.26, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo353() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 25, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo354() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 24.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo355() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 49, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 25, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo356() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 200, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 48.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo357() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo358() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 6.74, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 800, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 200, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo359() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 200.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo360() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 800.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo361() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 0, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo362() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 0.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo363() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 1, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo364() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 6.6, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo365() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 6.6, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo366() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 6.74, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo367() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 9.95, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo368() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 12.37, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo369() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo370() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 3, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 13.26, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo371() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 0, 13.4, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 13.26, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo372() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 24.99, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 13.4, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo373() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 25, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 24.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo374() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 25, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo375() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 12.63, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 49, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 2, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo376() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 200, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo377() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 200, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo378() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 800, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 200.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo379() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 800, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo380() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 0, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 0, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo381() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 0.01, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 0.01, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo382() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 2, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 0.99, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 0.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo383() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 0, 1, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 1, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo384() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 0, 6.6, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 6.6, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo385() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 0, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 6.74, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.74, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo386() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 9.95, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 9.95, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo387() {
        calendar.set(2018, Calendar.JANUARY, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 10.05, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo388() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.BOOKS, 3, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 12.37, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 12.37, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo389() {
        calendar.set(2018, Calendar.JANUARY, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 12.63, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 12.63, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo390() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 13.26, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 13.26, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo391() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.WATCHES, 3, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 13.4, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 13.4, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo392() {
        calendar.set(2017, Calendar.DECEMBER, 16);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 3, 24.99, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 24.99, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo393() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 2, 25, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 25, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo394() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 3, 48.99, true));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 48.99, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo395() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 49, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 0, 49, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo396() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 0, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 200, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 2, 200, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo397() {
        calendar.set(2018, Calendar.SEPTEMBER, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 3, 10.05, false));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 200.01, false));
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 200.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo398() {
        calendar.set(2017, Calendar.DECEMBER, 15);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.MUSIC, 3, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 800, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 2, 800, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo399() {
        calendar.set(2018, Calendar.MARCH, 30);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 3, 10.05, true));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 2, 800.01, false));
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 0, 800.01, false));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }


    @Test
    public void blackBoxTestByTwo400() {
        calendar.set(2018, Calendar.MARCH, 31);

        Order order = new Order();

        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 200.01, true));
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 2, 0.99, true));
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 2, 1, true));

        order.setDate(calendar.getTime());
        order.setShipment(ShipmentType.INTERNATIONAL);

        TotalDeposit deposit = new TotalDeposit(order);
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(order);

        assertTrue(Math.abs(deposit.getTotalDeposit() - fixedDeposit.getTotalDeposit()) < 1e-10);
    }
}
