package MavenTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

public class SumLongTest extends InitialCalculatorTest {

	private long a;
	private long b;
	private long expected;

	@Factory(dataProvider = "DataProvider")
	public SumLongTest(long a, long b, long expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Test
	public void testSum() {

		long sum = calculator.sum(a, b);
		Assert.assertEquals(sum, expected);
		System.out.println("Test Case two with Thread Id:-> "
				+ Thread.currentThread().getId());
	}

	@DataProvider(name = "DataProvider")
	public static Object[][] DataProvider() {
		return new Object[][] { { 1, 1, 2 }, { 0, 0, 0 } };
	}
	
	@AfterClass
	public void conclusion(){
		System.out.println("SumLongTest execution has completed");
	}

}
