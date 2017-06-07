package MavenTest_JUnit;

import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class JUCtgExceptions {

	Calculator calculator = new Calculator();

	@Test(expected = NumberFormatException.class)
	public void testTgfor0() {
		calculator.tg(0);
	}

	@Test(expected = NumberFormatException.class)
	public void testTgfor180() {
		calculator.tg(Math.PI / 1);
	}

}
