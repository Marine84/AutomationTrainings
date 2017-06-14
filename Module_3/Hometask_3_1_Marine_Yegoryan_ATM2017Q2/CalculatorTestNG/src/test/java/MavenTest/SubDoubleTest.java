package MavenTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubDoubleTest extends InitialCalculatorTest {

	@Test (dataProvider = "dataProvider", groups = { "success" })
	public void testSub(double a, double b, double expected) {
		double sub = calculator.sub(a, b);
		Assert.assertEquals(sub, expected);
	}

	@DataProvider(name = "dataProvider")
	public static Object[][] DataProvider() {
		return new Object[][] { 
			{ 1.2, 1.2, 0 }, 
			{ 2.4, 1.2, 1.2 } 
		};
	}
}
