package junit_tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class JUSubLongTest extends InitializeCalculatorClass{

	@Test
	public void testLongSub() {
		long sub = calculator.sub(14, 2);
		assertTrue (sub == 12);	
	}

}
