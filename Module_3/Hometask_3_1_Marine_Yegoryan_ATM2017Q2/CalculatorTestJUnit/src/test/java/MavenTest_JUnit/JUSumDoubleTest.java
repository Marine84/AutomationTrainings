package MavenTest_JUnit;
import static org.junit.Assert.*;

import org.junit.Test;


public class JUSumDoubleTest extends InitializeCalculatorClass{

	@Test
	public void testDoubleSum() {
		double sum = calculator.sum(10.2, 2.5);
		assertTrue (sum == 12.7);
	}

}
