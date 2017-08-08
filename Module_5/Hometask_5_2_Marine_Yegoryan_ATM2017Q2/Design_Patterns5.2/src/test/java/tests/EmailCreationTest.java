package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.MailBoxPage;
import org.testng.annotations.Test;

import static pages.AbstractPage.uniqueStack;

public class EmailCreationTest extends BaseTests {
	@Test
	public void emailCreationTest() {
		MailBoxPage mailbox = new MailBoxPage();
		mailbox.emailCreation();
		// verify that email has been saved in draft
		WebElement emailLink = driver.findElement(By.xpath("//span[contains(text(), '"+uniqueStack+"')]"));
		Assert.assertEquals(uniqueStack, emailLink.getText());
	}
}
