package MavenTest_JUnit;

import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class JUTgExceptions {

	Calculator calculator = new Calculator();

	@Test(expected = NumberFormatException.class)
	public void testTgfor270() {
		calculator.tg(Math.PI * 1.5);
	}
	
	@Test(expected = NumberFormatException.class)
	public void testTgfor90() {
		calculator.tg(Math.PI / 2);
	}

}
