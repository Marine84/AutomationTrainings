package junit_tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class JUIsNegativeTest extends InitializeCalculatorClass{

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
