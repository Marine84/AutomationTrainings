package junit_tests;

import org.junit.Test;


public class JUDivDoubleException extends InitializeCalculatorClass{
	
	@Test(expected = ArithmeticException.class)
	public void testDivbyZero() {
		calculator.div(2.5, 0);
		
	}	
	
}
