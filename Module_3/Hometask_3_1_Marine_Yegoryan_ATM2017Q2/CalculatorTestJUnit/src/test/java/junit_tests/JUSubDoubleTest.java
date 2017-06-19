package junit_tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class JUSubDoubleTest extends InitializeCalculatorClass{

	@Test
	public void testDoubleSub() {
		double sub = calculator.sub(14.9, 2.2);
		assertTrue (sub == 12.7);
	}

}
