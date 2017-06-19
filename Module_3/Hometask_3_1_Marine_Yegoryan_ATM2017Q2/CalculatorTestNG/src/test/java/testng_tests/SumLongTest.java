package testng_tests;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class SumLongTest extends InitialCalculatorTest {

	@Test(dataProvider = "dataProvider", groups = { "success" })
	public void testSum(long a, long b, long expected) {
		long sum = calculator.sum(a, b);
		Assert.assertEquals(sum, expected);
	}

	@DataProvider(name = "dataProvider")
	public static Object[][] DataProvider() {
		return new Object[][] { 
			{ 1, 1, 2 }, 
			{ 0, 0, 0 } 
		};
	}
}
