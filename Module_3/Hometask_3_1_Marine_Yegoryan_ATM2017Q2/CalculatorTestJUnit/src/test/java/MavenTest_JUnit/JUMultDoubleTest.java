package MavenTest_JUnit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class JUMultDoubleTest {

	Calculator calculator = new Calculator();
	@Test
	public void testDoubleMult() {

		double mult = calculator.mult(14.9, 2.2);
		assertTrue (mult == 32.78);
	}


}
