package MavenTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class PowTest extends InitialCalculatorTest {

	private double a;
	private double b;
	private double expected;

	@Factory(dataProvider = "DataProvider")
	public PowTest(double a, double b, double expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Test
	public void testPow() {

		double pow = calculator.pow(a, b);
		Assert.assertEquals(pow, expected);
		System.out.println("Test Case two with Thread Id:-> "
				+ Thread.currentThread().getId());
	}

	@DataProvider(name = "DataProvider")
	public static Object[][] DataProvider() {
		return new Object[][] { { 1, 1, 1 }, { 2, 2, 4 }, { 2, 2.5, 5.6568 },{ 2, 0, 1 }, };
	}
	
	@AfterClass
	public void conclusion(){
		System.out.println("SumLongTest execution has completed");
	}

}