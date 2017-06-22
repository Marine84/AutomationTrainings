package module4.locatortest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MailBox extends AbstractPage {

	@FindBy(xpath = "//*/div[text()='COMPOSE']")
	WebElement createEmail;

	@FindBy(xpath = "//textarea[@name='to']")
	WebElement textInputTo;

	@FindBy(xpath = "//input[@placeholder='Subject']")
	WebElement textInputSubject;

	@FindBy(xpath = "//div[@aria-label='Message Body']")
	WebElement textInputBody;

	@FindBy(xpath = "//img[@aria-label='Save & Close']")
	WebElement saveAndCloseButton;

	@FindBy(xpath = "//a[contains(text(),'Drafts')]")
	WebElement draftBoxLink;

	@FindBy(xpath = "//span[text()='Locator test']")
	WebElement draftSavedEmailLink;
	
	@FindBy(xpath = "//div[text()='Send']")
	WebElement sendEmailButton;

	@FindBy(xpath = "//a[contains(text(),'Sent Mail')]")
	WebElement sentMailBoxLink;
	
	@FindBy(xpath = "//td[@class='TC']")
	WebElement draftBoxTable;
		
	
	public MailBox(WebDriver driver) {
		super(driver);
	}

	public MailBox emailCreation() {	
		createEmail.click();
		// Fill email address, subject and content
		textInputTo.click();
		textInputTo.clear();
		textInputTo.sendKeys("marineyegoryan0884@gmail.com");
		textInputSubject.click();
		textInputSubject.clear();
		textInputSubject.sendKeys("Locator test");
		textInputBody.click();
		textInputBody.clear();
		textInputBody.sendKeys("test");
		// Save and close. Verify email has been saved in draft
		saveAndCloseButton.click();		
		return this;		
	}
	public MailBox emailSending() {		
		//open draft box and open new saved email
		draftBoxLink.click();
		draftSavedEmailLink.click();
		//send draft saved email
		sendEmailButton.click();
		//open sent box and check that email has been sent
		sentMailBoxLink.click();	
		waitForElementVisible(draftBoxLink);
		draftBoxLink.click();
		return this;		
	}
}
