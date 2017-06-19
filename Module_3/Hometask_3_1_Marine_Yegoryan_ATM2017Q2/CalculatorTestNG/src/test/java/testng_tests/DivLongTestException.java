package testng_tests;

import org.testng.annotations.Test;

public class DivLongTestException extends InitialCalculatorTest {

	@Test(expectedExceptions = ArithmeticException.class, groups = { "success" })
	public void testDivbyZero() {
		calculator.div(2, 0);
	}
}
