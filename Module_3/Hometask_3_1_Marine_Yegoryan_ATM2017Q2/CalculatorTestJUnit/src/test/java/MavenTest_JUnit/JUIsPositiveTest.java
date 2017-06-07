package MavenTest_JUnit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class JUIsPositiveTest {

	Calculator calculator = new Calculator();

	@Test
	public void testisPositive1() {

		boolean pos = calculator.isPositive(5);
		assertTrue(pos == true);
	}
	@Test
	public void testisPositive2() {

		boolean pos = calculator.isPositive(-5);
		assertTrue(pos == false);
	}

}
