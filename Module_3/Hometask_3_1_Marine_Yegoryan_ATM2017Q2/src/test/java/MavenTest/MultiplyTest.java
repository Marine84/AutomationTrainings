package MavenTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class MultiplyTest extends InitialCalculatorTest {

	private long a;
	private long b;
	private long expected;

	@Factory(dataProvider = "DataProvider")
	public MultiplyTest(long a, long b, long expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Test 
	public void testmult() {

		long mult = calculator.mult(a, b);
		Assert.assertEquals(mult, expected);
		System.out.println("Test Case two with Thread Id:-> "
				+ Thread.currentThread().getId());
	}

	@DataProvider(name = "DataProvider")
	public static Object[][] DataProvider() {
		return new Object[][] { { 1, 1, 1 }, { 0, 0, 0 } };
	}
	
	@AfterClass
	public void conclusion(){
		System.out.println("MultiplyTest execution has completed");
	}

}
