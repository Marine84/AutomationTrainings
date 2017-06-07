package MavenTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SumDoubleTest extends InitialCalculatorTest {

	private double a;
	private double b;
	private double expected;

	@Factory(dataProvider = "DataProvider")
	public SumDoubleTest(double a, double b, double expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Test
	public void testSum() {

		double sum = calculator.sum(a, b);
		Assert.assertEquals(sum, expected);
		System.out.println("Test Case two with Thread Id:-> "
				+ Thread.currentThread().getId());
	}

	@DataProvider(name = "DataProvider")
	public static Object[][] DataProvider() {
		return new Object[][] { { 1.2, 1.2, 2.4 }, { 0, 0, 0 } };
	}
	
	@AfterClass
	public void conclusion(){
		System.out.println("SumDoubleTest execution has completed");
	}

}
