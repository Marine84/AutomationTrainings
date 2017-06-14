package MavenTest_JUnit;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class JUIsPowTest extends InitializeCalculatorClass{

	@Test
	public void testisPow() {
		double pow = calculator.pow(2, 2);
		assertTrue(pow == 4);
	}

}
