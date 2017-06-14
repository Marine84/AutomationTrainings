package MavenTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class DivLongTest extends InitialCalculatorTest {

	@Test(dataProvider = "dataProvider", groups = { "success" })
	public void testDiv(long a, long b, long expected) {
		long div = calculator.div(a, b);
		Assert.assertEquals(div, expected);
	}
	
	@DataProvider(name = "dataProvider")
	public static Object[][] DataProvider() {
		return new Object[][] { 
			{ 1, 1, 1 }, 
			{ 10, 2, 5 } 
		};
	}
}
