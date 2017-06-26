package testng_tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import com.epam.tat.module4.Calculator;

public class InitialCalculatorTest {

	protected Calculator calculator;
	
	@BeforeTest()
	public void setUp(){
		System.out.println("Test Case two with Thread Id:-> " + Thread.currentThread().getId());
		calculator = new Calculator();
	}
	
	@AfterClass
	public void conclusion(){
		System.out.println("MultiplyDoubleTest execution has completed");
	}
	
}
