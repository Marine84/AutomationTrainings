package MavenTest_JUnit;

import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class JUDivLongException {

Calculator calculator = new Calculator();
	
	@Test(expected = NumberFormatException.class)
	public void testDivbyZero() {
		calculator.div(5, 0);
		
	}	
}
