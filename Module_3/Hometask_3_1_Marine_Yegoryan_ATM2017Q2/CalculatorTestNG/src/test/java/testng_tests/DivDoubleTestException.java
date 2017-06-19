package testng_tests;

import org.testng.annotations.Test;

public class DivDoubleTestException extends InitialCalculatorTest {

	@Test(expectedExceptions = ArithmeticException.class, groups = { "failed" })
	public void testDivbyZero() {
		calculator.div(2.5, 0);
	}
}
