package MavenTest_JUnit;
import static org.junit.Assert.*;

import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class JUSumDoubleTest {


	Calculator calculator = new Calculator();
	@Test
	public void testDoubleSum() {

		double sum = calculator.sum(10.2, 2.5);
		assertTrue (sum == 12.7);
	}

}
