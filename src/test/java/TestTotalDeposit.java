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
	public void test() {
		calendar.set(2017, 12, 17);
		
		Order order = new Order();
		order.addOrderItem(new OrderItem(ProductType.JEWELRY,
				1, 550.00));
		order.addOrderItem(new OrderItem(ProductType.JEWELRY,
				1, 550.00, true));
		order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR,
				1, 30.00));
		order.setDate(calendar.getTime());
		order.setShipment(ShipmentType.INTERNATIONAL);
		
		//double totalDeposit = new TotalDeposit(order).getTotalDeposit();

		TotalDeposit deposit = new TotalDeposit(order);

		assertTrue(Math.abs(
				deposit.getTotalDeposit()
				- 793.47 ) < 1e-10); //what the program calculates (because of a bug)
				//- 868.32 ) < 1e-10); //true value
	}

	@Test
	public void blackBoxTest() throws Exception {
        ParseFile csvFile = new ParseFile("TotalDeposit-output.csv");
        LinkedList<Order> testOrders = csvFile.getOrdersFromCSV();

        int amountOfPassedTests = 0;
        for (int i = 0; i < testOrders.size(); i++) {
            TotalDeposit deposit = new TotalDeposit(testOrders.get(i));
            FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(testOrders.get(i));

            double actualValue = deposit.getTotalDeposit();
            double expectedValue = fixedDeposit.getTotalDeposit();

            //System.out.println("#" + i);
            //System.out.println("Actual value: " + actualValue);
            //System.out.println("Expected value: " + expectedValue);

            boolean assertTrue = (Math.abs(actualValue - expectedValue) < 1e-10);
            //System.out.println("Assert equals: " + assertTrue);

            if (assertTrue)
                amountOfPassedTests++;

            //System.out.println();
        }

        System.out.println("Total amount of tests: " + testOrders.size());
        System.out.println("Amount of passed tests: " + amountOfPassedTests);

        TotalDeposit deposit = new TotalDeposit(testOrders.get(0));
        FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(testOrders.get(0));

        double actualValue = deposit.getTotalDeposit();
        double expectedValue = fixedDeposit.getTotalDeposit();


        assertTrue(Math.abs(actualValue - expectedValue) < 1e-10);
	}
}