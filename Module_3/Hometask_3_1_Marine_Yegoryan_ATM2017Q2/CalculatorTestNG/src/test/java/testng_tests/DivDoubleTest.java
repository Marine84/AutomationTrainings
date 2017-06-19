package testng_tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivDoubleTest  extends InitialCalculatorTest {

	@Test(dataProvider = "dataProvider", groups = { "success" })
	public void testDiv(double a, double b, double expected) {

		double div = calculator.div(a, b);
		Assert.assertEquals(div, expected);
	}

	@DataProvider(name = "dataProvider")
	public static Object[][] DataProvider() {
		return new Object[][] { 
			{ 1.2, 1.2, 1 }, 
			{ 2.4, 1.2, 2 } 
		};
	}
}
