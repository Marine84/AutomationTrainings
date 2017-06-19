package junit_tests;
import static org.junit.Assert.*;
import org.junit.Test;


public class JUDivDoubleTest extends InitializeCalculatorClass{
	
	@Test
	public void testDiv() {
		double div = calculator.div(0, 2);
		assertTrue (div == 0);
		
	}
	
}