package Module4.LocatorTest;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locator_EmailCreation{
	private String baseUrl;
	ExplicitWait waitExplicit = new ExplicitWait();
//	private WebDriver driver = waitExplicit.driver;
	
	public WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://gmail.com/";
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	// Login into the mailbox and assert that login is successful
	@Test
	public void emailLogin() {

		// Input user name and click next
		driver.findElement(By.id("identifierId")).click();
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("marineyegoryan0884");
		driver.findElement(By.id("identifierNext")).click();

		// Input password and click next
		WebDriverWait wait = new WebDriverWait(driver, 10000);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id='password']//input[@type='password']")));
		driver.findElement(By.xpath("//*[@id='password']//input[@type='password']")).clear();
		driver.findElement(By.xpath("//*[@id='password']//input[@type='password']")).sendKeys("marinetest");
		waitExplicit.waitUntilClickable(driver, "//*[@id='passwordNext']", 100000);
		driver.findElement(By.id("passwordNext")).click();

		// Verify, that the login is successful
		WebElement elementGmail = driver.findElement(By.xpath("//div[@aria-label='Navigate to']/span[text()='Gmail']"));
		waitExplicit.clickWhenVisible(driver, elementGmail, 10000);
		Assert.assertEquals("Gmail", elementGmail.getText());
	}

	@Test (dependsOnMethods="emailLogin")
	public void createNewEmail() {		
		//emailLogin();

		// Create new email
		waitExplicit.waitUntilClickable(driver,("//*/div[text()='COMPOSE']"), 10000);
		driver.findElement(By.xpath("//*/div[text()='COMPOSE']")).click();
		waitExplicit.waitUntilClickable(driver,("//textarea[@name='to']"), 10000);
		driver.findElement(By.xpath("//textarea[@name='to']")).click();
		driver.findElement(By.xpath("//textarea[@name='to']")).clear();

		// Fill email address, subject and content
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("marineyegoryan0884@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Locator test");
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).clear();
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("test");

		// Save and close. Verify email has been saved in draft
		waitExplicit.waitUntilClickable(driver,("//img[@aria-label='Save & Close']"), 10000);
		driver.findElement(By.xpath("//img[@aria-label='Save & Close']")).click();
		waitExplicit.waitUntilClickable(driver, ("//a[contains(text(),'Drafts')]"), 10000);
		driver.findElement(By.xpath("//a[contains(text(),'Drafts')]")).click();

		// verify that email has been saved in draft
		WebElement elementSubject = driver.findElement(By.xpath("//span[text()='Locator test']"));
		Assert.assertEquals("Locator test", elementSubject.getText());
	}

	@Test (dependsOnMethods="createNewEmail")
	public void sendEmail() {
		//createNewEmail();

		// Send saved email
		waitExplicit.waitUntilClickable(driver, ("//span[text()='Locator test']"), 10000);
		driver.findElement(By.xpath("//span[text()='Locator test']")).click();

		// verify address and content of email
		WebElement checkElement = driver
				.findElement(By.xpath("//span[@email='marineyegoryan0884@gmail.com' and text()='Marine Yegoryan']"));
		waitExplicit.clickWhenVisible(driver, checkElement, 10000);
		Assert.assertEquals("Marine Yegoryan", checkElement.getText());
		checkElement = driver.findElement(By.xpath("//div[@aria-label='Message Body']"));
		Assert.assertEquals("test", checkElement.getText());

		waitExplicit.waitUntilClickable(driver, ("//a[contains(text(),'Drafts')]"), 5000);
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Drafts')]")).click();

		// verify that email is not in draft box
		checkElement = driver.findElement(By.xpath("//td[@class='TC']"));
		Assert.assertNotEquals("Locator test", checkElement.getText());

		waitExplicit.waitUntilClickable(driver, ("//a[contains(text(),'Sent Mail')]"), 10000);
		driver.findElement(By.xpath("//a[contains(text(),'Sent Mail')]")).click();

		// verify that email is in sent mail box
		checkElement = driver.findElement(By.xpath("//div[@class='xT']//b[text()='Locator test']"));
		Assert.assertNotEquals("Locator test", checkElement.getText());

		driver.findElement(By.xpath("//a[contains(@title, 'Google Account')]")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
	}

	@AfterClass()
	public void closeBrowser() throws Exception {
		 driver.quit();
	}

}
