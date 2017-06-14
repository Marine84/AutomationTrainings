package MavenTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplyTest extends InitialCalculatorTest {

	@Test (dataProvider = "dataProvider", groups = { "success" })
	public void testmult(long a, long b, long expected) {
		long mult = calculator.mult(a, b);
		Assert.assertEquals(mult, expected);
	}

	@DataProvider(name = "dataProvider")
	public static Object[][] DataProvider() {
		return new Object[][] { 
			{ 1, 1, 1 }, 
			{ 0, 0, 0 } 
		};
	}
}
