package MavenTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class MultiplyDoubleTest  extends InitialCalculatorTest {

	private double a;
	private double b;
	private double expected;

	@Factory(dataProvider = "DataProvider")
	public MultiplyDoubleTest(double a, double b, double expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Test (groups = { "smoketest" })
	public void testMult() {

		double mult = calculator.mult(a, b);
		Assert.assertEquals(mult, expected);
		System.out.println("Test Case two with Thread Id:-> "
				+ Thread.currentThread().getId());
	}

	@DataProvider(name = "DataProvider")
	public static Object[][] DataProvider() {
		return new Object[][] { { 1.2, 1.2, 1.44 }, { 2.4, 1.2, 2.88 } };
	}
	
	@AfterClass
	public void conclusion(){
		System.out.println("MultiplyDoubleTest execution has completed");
	}

}

