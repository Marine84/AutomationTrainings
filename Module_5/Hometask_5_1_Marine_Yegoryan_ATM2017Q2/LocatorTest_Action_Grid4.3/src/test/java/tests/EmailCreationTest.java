package tests;

import pages.DraftBoxPage;
import pages.MailBoxPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmailCreationTest extends LoginTest {
	@Test
	public void emailCreationTest(String baseUrl) {
		new MailBoxPage().emailCreation();
		// verify that email has been saved in draft
		MailBoxPage mailbox = new MailBoxPage();
		Assert.assertEquals("(Locator test).*", driver.findElement(By.xpath("//span[text()='Locator test']")).getText());
	}
}
