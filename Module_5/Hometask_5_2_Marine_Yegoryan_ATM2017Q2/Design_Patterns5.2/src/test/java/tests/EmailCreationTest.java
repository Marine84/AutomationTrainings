package tests;

import org.openqa.selenium.WebDriver;
import pages.DraftBoxPage;
import pages.MailBoxPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.WebDriverSingleton;

public class EmailCreationTest extends LoginTest{
	@Test
	public void emailCreationTest() {
		new MailBoxPage().emailCreation();
		// verify that email has been saved in draft
		MailBoxPage mailbox = new MailBoxPage();
		//WebDriver driver = WebDriverSingleton.getWebDriverInstance();
//		Assert.assertEquals("(Locator test).*", driver.findElement(By.xpath("//span[text()='Locator test']")).getText());
	}
}
