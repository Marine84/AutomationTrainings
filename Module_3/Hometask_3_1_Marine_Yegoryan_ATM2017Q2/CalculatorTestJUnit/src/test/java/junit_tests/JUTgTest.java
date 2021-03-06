package junit_tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class JUTgTest extends InitializeCalculatorClass{
	
	@Test
	public void testTg30() {
		double tg = calculator.tg(Math.PI / 3);				
		assertTrue (tg == 0.57735);
	}
	
	@Test
	public void testTg0() {
		double tg = calculator.tg(0);
		assertTrue (tg == 0);
	}

	@Test
	public void testTg180() {
		double tg = calculator.tg(Math.PI / 1);
		assertTrue (tg == 0);
	}
	
	@Test
	public void testTg360() {
		double tg = calculator.tg(Math.PI * 2);
		assertTrue (tg == 0);
	}
}
