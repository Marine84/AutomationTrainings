package MavenTest_JUnit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class JUIsNegativeTest {

	Calculator calculator = new Calculator();
	@Test
	public void testIsNegative1() {

		boolean neg = calculator.isNegative(-5);
		assertTrue (neg == true);
	}
	@Test
	public void testIsNegative2() {

		boolean neg = calculator.isNegative(5);
		assertTrue (neg == false);
	}

}
