package junit_tests;

import org.junit.Test;


public class JUDivLongException extends InitializeCalculatorClass{
	
	@Test(expected = ArithmeticException.class)
	public void testDivbyZero() {
		calculator.div(5, 0);
	}	
}
