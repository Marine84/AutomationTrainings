package testng_tests;

import org.testng.annotations.Test;

public class CtgTestException extends InitialCalculatorTest {

	@Test(expectedExceptions = ArithmeticException.class, groups = { "failed" })
	public void testCTg180() {
		calculator.tg(Math.PI/1);
	}
	
	@Test(expectedExceptions = ArithmeticException.class, groups = { "failed" })
	public void testCTg360() {
		calculator.tg(Math.PI*2);
	}
}