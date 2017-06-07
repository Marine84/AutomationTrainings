package MavenTest;

import org.testng.annotations.Test;

public class CtgTestException extends InitialCalculatorTest {

	@Test(expectedExceptions = NumberFormatException.class)
	public void testCTg180() {
		calculator.tg(Math.PI/1);
		System.out.println("Test Case two with Thread Id:-> "
				+ Thread.currentThread().getId());
	}
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void testCTg360() {
		calculator.tg(Math.PI*2);
		System.out.println("Test Case two with Thread Id:-> "
				+ Thread.currentThread().getId());
	}
}