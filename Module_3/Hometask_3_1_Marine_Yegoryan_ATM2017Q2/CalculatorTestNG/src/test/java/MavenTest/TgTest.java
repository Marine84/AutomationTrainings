package MavenTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgTest extends InitialCalculatorTest {

	@Test(dataProvider = "dataProvider", groups = { "failed" })
	public void testTg(double a, double expected) {
		double tg =calculator.tg(a);
		Assert.assertEquals(tg, expected);
	}

	@DataProvider(name = "dataProvider")
	public static Object[][] DataProvider() {
		return new Object[][] { 
			{ Math.PI/6, 0.577 }, 
			{ Math.PI/3, 1.7320 }, 
			{ 0, 0 }, 
			{ Math.PI/1, 0 }, 
			{ Math.PI/4, 1 }, 
			{ Math.PI*2, 0 } 
		};
	}
}