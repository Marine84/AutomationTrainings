package MavenTest_JUnit;
import static org.junit.Assert.*;
import org.junit.Test;
import com.epam.tat.module4.Calculator;


public class JUDivDoubleTest {

	Calculator calculator = new Calculator();
	
	@Test
	public void testDiv() {
		double div = calculator.div(0, 2);
		assertTrue (div == 0);
		
	}
	
}