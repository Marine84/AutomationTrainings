package MavenTest_JUnit;

import org.junit.Test;

import com.epam.tat.module4.Calculator;

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
