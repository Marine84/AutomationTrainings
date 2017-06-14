package MavenTest_JUnit;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class JUDivLongTest extends InitializeCalculatorClass{

	@Test
	public void testLongDiv() {
		long div = calculator.div(10, 2);
		assertTrue (div == 5);	
	}
}
