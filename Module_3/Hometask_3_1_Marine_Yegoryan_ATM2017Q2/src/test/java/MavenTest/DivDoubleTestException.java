package MavenTest;

import org.testng.annotations.Test;

public class DivDoubleTestException extends InitialCalculatorTest {

	@Test(expectedExceptions = NumberFormatException.class)
	public void testDivbyZero() {
		calculator.div(2.5, 0);
		System.out.println("Test Case two with Thread Id:-> "
				+ Thread.currentThread().getId());
	}
}
