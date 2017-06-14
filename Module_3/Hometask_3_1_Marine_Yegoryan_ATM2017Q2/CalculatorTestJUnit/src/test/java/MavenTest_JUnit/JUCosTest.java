package MavenTest_JUnit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class JUCosTest extends InitializeCalculatorClass {
	
	@Test
	public void testCos30() {
		double cos = calculator.cos(Math.PI / 3);				
		assertTrue (cos == 0.5);
	}
	@Test
	public void testCos0() {
		double cos = calculator.cos(0);
		assertTrue (cos == 1);
	}	
	@Test
	public void testCos90() {

		double cos = calculator.cos(Math.PI / 2);
		assertTrue (cos == 0);
	}	
	@Test
	public void testCos180() {

		double cos = calculator.cos(Math.PI / 1);
		assertTrue (cos == -1);
	}
	@Test
	public void testCos270() {

		double cos = calculator.cos(Math.PI * 1.5);
		assertTrue (cos == 0);
	}	
	@Test
	public void testCos360() {
		double cos = calculator.cos(Math.PI * 2);
		assertTrue (cos == 1);
	}
}
