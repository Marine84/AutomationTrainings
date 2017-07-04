package module4.locatortest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MailBoxTest extends InputOutputInitialization {

//	private String baseUrl;
	
//	@Test
//	@Parameters("baseUrl")
//	public void emailCreationTest(String baseUrl) {
//		baseUrl = "https://gmail.com/";
//		new InputUsername(driver).open(baseUrl).inputUserName("marineyegoryan0884").goNext().inputPassword("marinetest").goNext();
//		new MailBox(driver).emailCreation();
//		// verify that email has been saved in draft
//		MailBox mailbox = new MailBox(driver);
//		Assert.assertEquals("Locator test", mailbox.draftSavedEmailLink.getText());
//	}
	
	@Test
	@Parameters("baseUrl")
	public void emailSendingTest(String baseUrl) {
		baseUrl = "https://gmail.com/";
		new InputUsername(driver).open(baseUrl).inputUserName("marineyegoryan0884").goNext().inputPassword("marinetest").goNext();
		new MailBox(driver).emailCreation().emailSending();
		
		// verify that email is in sent mail box
		
		Assert.assertNotEquals("Locator test", driver.findElement(By.xpath("//*")).getText());
	}
	

}
