package MavenTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SinTest extends InitialCalculatorTest {

	private double a;
	private double expected;

	@Factory(dataProvider = "dataProvider")
	public SinTest(double a, double expected) {
		this.a = a;
		this.expected = expected;
	}

	@Test
	public void testSin() {

		double sin =calculator.sin(a);
		Assert.assertEquals(sin, expected);
		System.out.println("Test Case two with Thread Id:-> "
				+ Thread.currentThread().getId());
	}

	@DataProvider(name = "dataProvider")
	public static Object[][] DataProvider() {
		return new Object[][] { { Math.PI/6, 0.49999999999999994 }, { Math.PI/3, 0.8660254037844386 }, { 0, 0 }, { Math.PI/2, 1 }, { Math.PI/1, 0 }, { Math.PI*1.5, -1 }, { Math.PI/4, 0.7071067811865475 }, { Math.PI*2, 0 } };
	}
	
	@AfterClass
	public void conclusion(){
		System.out.println("SinTest execution has completed");
	}

}


