package MavenTest;

import org.testng.annotations.Test;

public class TgTestException extends InitialCalculatorTest {

	@Test(expectedExceptions = NumberFormatException.class)
	public void testTg90() {
		calculator.tg(Math.PI/2);
		System.out.println("Test Case two with Thread Id:-> "
				+ Thread.currentThread().getId());
	}
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void testTg270() {
		calculator.tg(Math.PI*1.5);
		System.out.println("Test Case two with Thread Id:-> "
				+ Thread.currentThread().getId());
	}
}