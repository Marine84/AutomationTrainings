package module4.locatortest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class InputOutputInitialization {

	public WebDriver driver;

	@BeforeClass()
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
	//@AfterClass()
	// public void closeBrowser() throws Exception {
	// driver.quit();
	// }
}
