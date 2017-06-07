package MavenTest_JUnit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class JUCtgTest {

	Calculator calculator = new Calculator();
	@Test
	public void testCTg30() {

		double ctg = calculator.ctg(Math.PI / 3);
				
		assertTrue (ctg == 0.57735);
	}
		
	@Test
	public void testCTg90() {

		double ctg = calculator.ctg(Math.PI / 2); 
		assertTrue (ctg == 0);
	}
	
		
	@Test
	public void testCTg270() {

		double ctg = calculator.ctg(Math.PI * 1.5); 
		assertTrue (ctg == 0);
	}
	
	@Test
	public void testCTg360() {

		double ctg = calculator.ctg(Math.PI * 2);
		assertTrue (ctg == 0);
	}

}
