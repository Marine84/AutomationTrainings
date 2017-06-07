package MavenTest_JUnit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class JUSubLongTest {

	Calculator calculator = new Calculator();
	@Test
	public void testLongSub() {

		long sub = calculator.sub(14, 2);
		assertTrue (sub == 12);	
	}

}
