package MavenTest_JUnit;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.epam.tat.module4.Calculator;

public class JUDivLongTest {

	Calculator calculator = new Calculator();
	@Test
	public void testLongDiv() {

		long div = calculator.div(10, 2);
		assertTrue (div == 5);	
	}
}
