package MavenTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import com.epam.tat.module4.Calculator;

public class InitialCalculatorTest {

	protected Calculator calculator;
	
	@BeforeClass()
	public void setUp(){
		System.out.println("Test Case two with Thread Id:-> " + Thread.currentThread().getId());
		calculator = new Calculator();
	}
	
	@AfterClass
	public void conclusion(){
		System.out.println("MultiplyDoubleTest execution has completed");
	}
	
}
