package MavenTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SubLongTest extends InitialCalculatorTest {

	private long a;
	private long b;
	private long expected;

	@Factory(dataProvider = "DataProvider")
	public SubLongTest(long a, long b, long expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Test
	public void testsub() {

		long sub = calculator.sub(a, b);
		Assert.assertEquals(sub, expected);
		System.out.println("Test Case two with Thread Id:-> "
				+ Thread.currentThread().getId());
	}

	@DataProvider(name = "DataProvider")
	public static Object[][] DataProvider() {
		return new Object[][] { { 1, 1, 0 }, { 2, 0, 2 } };
	}
	
	@AfterClass
	public void conclusion(){
		System.out.println("SubLongTest execution has completed");
	}

}
