package MavenTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeTest extends InitialCalculatorTest {

	@Test(dataProvider = "dataProvider", groups = { "success" })
	public void testmult(long a, boolean expected) {
		boolean negative = calculator.isNegative(a);
		Assert.assertEquals(negative, expected);
	}

	@DataProvider(name = "dataProvider")
	public static Object[][] multDataProvider() {
		return new Object[][] { 
			{ 1, false }, 
			{ -2, true } 
			
		};
	}
}