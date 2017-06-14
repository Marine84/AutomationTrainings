package MavenTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CtgTest extends InitialCalculatorTest {

	@Test(dataProvider = "dataProvider", groups = { "failed" })
	public void testCTg(double a, double expected) {

		double ctg =calculator.ctg(a);
		Assert.assertEquals(ctg, expected);
	}
	
	@DataProvider(name = "dataProvider")
	public static Object[][] DataProvider() {
		return new Object[][] { { Math.PI/6, 1.7320 }, { Math.PI/3, 0.5773 }, { Math.PI/2, 0 },  { Math.PI/4, 1 } };
	}
}
