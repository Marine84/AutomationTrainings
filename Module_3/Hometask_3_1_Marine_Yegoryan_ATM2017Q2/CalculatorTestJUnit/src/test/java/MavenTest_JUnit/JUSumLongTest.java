package MavenTest_JUnit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class JUSumLongTest extends InitializeCalculatorClass  {

	@Test
	public void testLongSum() {
		long sum = calculator.sum(10, 2);
		assertTrue (sum == 12);	
	}
}
