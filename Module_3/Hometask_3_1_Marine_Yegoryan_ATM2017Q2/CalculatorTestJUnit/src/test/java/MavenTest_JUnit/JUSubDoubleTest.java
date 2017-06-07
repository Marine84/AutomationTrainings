package MavenTest_JUnit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class JUSubDoubleTest {

	Calculator calculator = new Calculator();
	@Test
	public void testDoubleSub() {

		double sub = calculator.sub(14.9, 2.2);
		assertTrue (sub == 12.7);
	}

}
