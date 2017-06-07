package MavenTest_JUnit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class JUSumLongTest {

	Calculator calculator = new Calculator();
	@Test
	public void testLongSum() {

		long sum = calculator.sum(10, 2);
		assertTrue (sum == 12);	
	}
}
