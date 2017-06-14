package MavenTest_JUnit;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class JUMultLongTest extends InitializeCalculatorClass{

	@Test
	public void testLongMult() {
		long mult = calculator.mult(5, 4);
		assertTrue (mult == 20);	
	}

}
