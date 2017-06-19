package testng_tests;

import org.testng.annotations.Test;

public class TgTestException extends InitialCalculatorTest {

	@Test(expectedExceptions = ArithmeticException.class, groups = { "failed" })
	public void testTg90() {
		calculator.tg(Math.PI/2);
	}
	
	@Test(expectedExceptions = ArithmeticException.class, groups = { "failed" })
	public void testTg270() {
		calculator.tg(Math.PI*1.5);
	}
}