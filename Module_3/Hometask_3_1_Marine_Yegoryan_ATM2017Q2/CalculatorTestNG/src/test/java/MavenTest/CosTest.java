package MavenTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosTest extends InitialCalculatorTest {

	@Test(dataProvider = "dataProvider", groups = { "success" })
	public void testCos(double a, double expected) {

		double cos = calculator.cos(a);
		Assert.assertEquals(cos, expected);
	}

	@DataProvider(name = "dataProvider")
	public static Object[][] DataProvider() {
		return new Object[][] {  { Math.PI/4, 0.7071067811865475 } };
	}
}

