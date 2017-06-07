package MavenTest;

import org.testng.annotations.BeforeClass;


import com.epam.tat.module4.Calculator;

public class InitialCalculatorTest {

	protected Calculator calculator;
	
	@BeforeClass()
	public void setUp(){
	//	System.out.println("Prepare to execute the test");
		calculator = new Calculator();
	}
	
}
