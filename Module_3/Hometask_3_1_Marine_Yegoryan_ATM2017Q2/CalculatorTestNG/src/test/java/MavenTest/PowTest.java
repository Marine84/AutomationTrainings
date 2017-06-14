package MavenTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowTest extends InitialCalculatorTest {

	@Test(dataProvider = "dataProvider", groups = { "failed" })
	public void testPow(double a, double b, double expected) {
		double pow = calculator.pow(a, b);
		Assert.assertEquals(pow, expected);
	}

	@DataProvider(name = "dataProvider")
	public static Object[][] DataProvider() {
		return new Object[][] { 
			{ 1, 1, 1 },
			{ 2, 2, 4 }, 
			{ 2, 2.5, 5.6568 },
			{ 2, 0, 1 }, };
	}
}