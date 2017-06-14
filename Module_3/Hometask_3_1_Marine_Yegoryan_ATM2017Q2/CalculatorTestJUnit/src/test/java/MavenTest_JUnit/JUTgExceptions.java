package MavenTest_JUnit;

import org.junit.Test;


public class JUTgExceptions extends InitializeCalculatorClass{

	@Test(expected = ArithmeticException.class)
	public void testTgfor270() {
		calculator.tg(Math.PI * 1.5);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testTgfor90() {
		calculator.tg(Math.PI / 2);
	}

}
