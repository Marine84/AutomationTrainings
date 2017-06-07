package MavenTest_JUnit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class JUIsPowTest {

	Calculator calculator = new Calculator();

	@Test
	public void testisPow() {

		double pow = calculator.pow(2, 2);
		assertTrue(pow == 4);
	}

}
