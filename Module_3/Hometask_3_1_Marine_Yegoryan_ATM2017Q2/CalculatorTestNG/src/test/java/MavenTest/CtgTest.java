package MavenTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class CtgTest extends InitialCalculatorTest {

	private double a;
	private double expected;

	@Factory(dataProvider = "dataProvider")
	public CtgTest(double a, double expected) {
		this.a = a;
		this.expected = expected;
	}

	@Test
	public void testCTg() {

		double ctg =calculator.ctg(a);
		Assert.assertEquals(ctg, expected);
		System.out.println("Test Case two with Thread Id:-> "
				+ Thread.currentThread().getId());
	}

	@DataProvider(name = "dataProvider")
	public static Object[][] DataProvider() {
		return new Object[][] { { Math.PI/6, 1.7320 }, { Math.PI/3, 0.5773 }, { Math.PI/2, 0 },  { Math.PI/4, 1 } };
	}
	
	@AfterClass
	public void conclusion(){
		System.out.println("CtgTest execution has completed");
	}

}
