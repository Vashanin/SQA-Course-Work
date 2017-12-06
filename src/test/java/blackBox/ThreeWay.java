package blackBox;

import deposit.FixedTotalDeposit;
import deposit.TotalDeposit;
import order.Order;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertTrue;


public class ThreeWay {

	@Test
    public void test() throws Exception {
        ParseFile csvFile = new ParseFile("TotalDeposit3.csv");

        LinkedList<Order> testOrders = csvFile.getOrdersFromCSV();

        for (int i = 0; i < testOrders.size(); i++) {
            TotalDeposit deposit = new TotalDeposit(testOrders.get(i));
            FixedTotalDeposit fixedDeposit = new FixedTotalDeposit(testOrders.get(i));

            double actualValue = deposit.getTotalDeposit();
            double expectedValue = fixedDeposit.getTotalDeposit();

            assertTrue(Math.abs(actualValue - expectedValue) < 1e-10);
        }
    }
}
