package MavenTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TgTest extends InitialCalculatorTest {

	private double a;
	private double expected;

	@Factory(dataProvider = "dataProvider")
	public TgTest(double a, double expected) {
		this.a = a;
		this.expected = expected;
	}

	@Test
	public void testTg() {

		double tg =calculator.tg(a);
		Assert.assertEquals(tg, expected);
		System.out.println("Test Case two with Thread Id:-> "
				+ Thread.currentThread().getId());
	}

	@DataProvider(name = "dataProvider")
	public static Object[][] DataProvider() {
		return new Object[][] { { Math.PI/6, 0.577 }, { Math.PI/3, 1.7320 }, { 0, 0 }, { Math.PI/1, 0 }, { Math.PI/4, 1 }, { Math.PI*2, 0 } };
	}
	
	@AfterClass
	public void conclusion(){
		System.out.println("TgTest execution has completed");
	}

}