package MavenTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import org.testng.Assert;



public class DivLongTest extends InitialCalculatorTest {

	private long expected;
	int i;

	@Factory(dataProvider = "DataProvider")
	public DivLongTest(long a, long b, long expected) {
		this.expected = expected;
	}

	@Test(expectedExceptions = NumberFormatException.class)
	public void testDiv() {
		long div = calculator.div(2, 0);
		Assert.assertEquals(div, expected);
		System.out.println("Test Case two with Thread Id:-> "
				+ Thread.currentThread().getId());
	}
	
	@DataProvider(name = "DataProvider")
	public static Object[][] DataProvider() {
		return new Object[][] { { 1, 1, 1 }, { 10, 2, 5 } };
	}
	
	@AfterClass
	public void conclusion(){
		System.out.println("DivLongTest execution has completed");
	}
	

}
