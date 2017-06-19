package testng_tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDoubleTest extends InitialCalculatorTest {

	@Test(dataProvider = "dataProvider", groups = { "success" })
	public void testSum(double a, double b, double expected) {
		double sum = calculator.sum(a, b);
		Assert.assertEquals(sum, expected);
	}

	@DataProvider(name = "dataProvider")
	public static Object[][] DataProvider() {
		return new Object[][] { 
			{ 1.2, 1.2, 2.4 }, 
			{ 0, 0, 0 } 
		};
	}
}
