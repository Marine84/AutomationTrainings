package MavenTest;

import org.testng.annotations.Test;

public class DivLongTestException extends InitialCalculatorTest {

	@Test(expectedExceptions = NumberFormatException.class)
	public void testDivbyZero() {
		calculator.div(2, 0);
		System.out.println("Test Case two with Thread Id:-> "
				+ Thread.currentThread().getId());
	}
}
