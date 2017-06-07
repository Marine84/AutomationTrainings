package MavenTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class IsNegativeTest extends InitialCalculatorTest {

	private long a;
	private boolean expected;

	@Factory(dataProvider = "DataProvider")
	public IsNegativeTest(long a, boolean expected) {
		this.a = a;
		this.expected = expected;
	}

	@Test
	public void testmult() {

		boolean negative = calculator.isNegative(a);
		Assert.assertEquals(negative, expected);
		System.out.println("Test Case two with Thread Id:-> " + Thread.currentThread().getId());
	}

	@DataProvider(name = "DataProvider")
	public static Object[][] multDataProvider() {
		return new Object[][] { { 1, false }, { -2, true } };
	}

	@AfterClass
	public void conclusion() {
		System.out.println("MultiplyTest execution has completed");
	}

}