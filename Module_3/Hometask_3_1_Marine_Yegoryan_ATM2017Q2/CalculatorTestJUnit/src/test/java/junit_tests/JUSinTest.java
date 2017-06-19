package junit_tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class JUSinTest extends InitializeCalculatorClass{

	@Test
	public void testSin30() {
		double sin = calculator.sin(Math.PI / 6);
		assertTrue (sin == 0.5);
	}
	@Test
	public void testSin0() {
		double sin = calculator.sin(0);
		assertTrue (sin == 0);
	}
	
	@Test
	public void testSin90() {
		double sin = calculator.sin(Math.PI / 2);
		assertTrue (sin == 1);
	}
	
	@Test
	public void testSin180() {
		double sin = calculator.sin(Math.PI / 1);
		assertTrue (sin == 0);
	}
	
	@Test
	public void testSin270() {
		double sin = calculator.sin(Math.PI * 1.5);
		assertTrue (sin == -1);
	}
	
	@Test
	public void testSin360() {
		double sin = calculator.sin(Math.PI * 2);
		assertTrue (sin == 0);
	}

}
