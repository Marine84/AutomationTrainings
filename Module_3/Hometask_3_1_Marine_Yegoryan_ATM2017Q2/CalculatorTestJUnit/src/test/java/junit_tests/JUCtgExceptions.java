package junit_tests;

import org.junit.Test;

public class JUCtgExceptions extends InitializeCalculatorClass {

	@Test(expected = ArithmeticException.class)
	public void testTgfor0() {
		calculator.tg(0);
	}

	@Test(expected = ArithmeticException.class)
	public void testTgfor180() {
		calculator.tg(Math.PI / 1);
	}

}
