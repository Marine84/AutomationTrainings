package MavenTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class CosTest extends InitialCalculatorTest {

	private double a;
	private double expected;

	@Factory(dataProvider = "dataProvider")
	public CosTest(double a, double expected) {
		this.a = a;
		this.expected = expected;
	}

	@Test
	public void testCos() {

		double cos = calculator.cos(a);
		Assert.assertEquals(cos, expected);
		System.out.println("Test Case two with Thread Id:-> "
				+ Thread.currentThread().getId());
	}

	@DataProvider(name = "dataProvider")
	public static Object[][] DataProvider() {
		return new Object[][] { { Math.PI/6, 0.8660254037844386 }, { Math.PI/3, 0.5 }, { 0, 1 }, { Math.PI/2, 0 }, { Math.PI/1, -1 }, { Math.PI*1.5, 0 }, { Math.PI/4, 0.7071067811865475 }, { Math.PI*2, 1 } };
	}
	
	@AfterClass
	public void conclusion(){
		System.out.println("CosTest execution has completed");
	}

}

