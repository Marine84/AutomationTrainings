package MavenTest_JUnit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class JUMultLongTest {

	Calculator calculator = new Calculator();
	@Test
	public void testLongMult() {

		long mult = calculator.mult(5, 4);
		assertTrue (mult == 20);	
	}

}
