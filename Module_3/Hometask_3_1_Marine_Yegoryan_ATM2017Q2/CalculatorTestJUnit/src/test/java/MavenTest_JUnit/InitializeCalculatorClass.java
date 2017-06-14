package MavenTest_JUnit;

import org.junit.BeforeClass;

import com.epam.tat.module4.Calculator;

public class InitializeCalculatorClass {

protected static Calculator calculator;
	
	@BeforeClass()
	public static void setUp(){
		calculator = new Calculator();
	}
	
}
