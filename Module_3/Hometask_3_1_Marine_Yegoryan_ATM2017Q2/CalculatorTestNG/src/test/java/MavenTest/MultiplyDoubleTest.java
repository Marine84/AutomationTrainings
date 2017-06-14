package MavenTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplyDoubleTest  extends InitialCalculatorTest {

	@Test (dataProvider = "dataProvider", groups = { "failed" })
	public void testMult(double a, double b, double expected) {
		double mult = calculator.mult(a, b);
		Assert.assertEquals(mult, expected);
	}

	@DataProvider(name = "dataProvider")
	public static Object[][] DataProvider() {
		return new Object[][] { 
			{ 2, 2, 4 }, 
			{ 2.4, 1.2, 2.88 } 
			
		};
	}
}

