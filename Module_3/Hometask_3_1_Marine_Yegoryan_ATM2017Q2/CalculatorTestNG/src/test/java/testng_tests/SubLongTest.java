package testng_tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubLongTest extends InitialCalculatorTest {

	@Test(dataProvider = "dataProvider", groups = { "success" })
	public void testsub(long a, long b, long expected) {
		long sub = calculator.sub(a, b);
		Assert.assertEquals(sub, expected);
	}

	@DataProvider(name = "dataProvider")
	public static Object[][] DataProvider() {
		return new Object[][] { 
			{ 1, 1, 0 }, 
			{ 2, 0, 2 } 
		};
	}
}
