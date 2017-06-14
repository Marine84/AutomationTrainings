package MavenTest_JUnit;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class JUIsPositiveTest extends InitializeCalculatorClass {
	
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
