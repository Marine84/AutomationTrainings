package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utils.Screenshoter;

public class InboxBoxPage extends AbstractPage {

	@FindBy(xpath = "//a[contains(text(),'Drafts')]")
	WebElement draftBoxLink;

	@FindBy(xpath = "//a[contains(text(),'Inbox')]")
	WebElement inboxBoxLink;

	@FindBy(xpath = "//div[text()='Send']")
	WebElement sendEmailButton;

	@FindBy(xpath = "//a[contains(text(),'Sent Mail')]")
	WebElement sentMailBoxLink;

	@FindBy(xpath = "//td[@class='TC']")
	WebElement draftBoxTable;

	public InboxBoxPage emailSending() {
		waitForPageLoad("Inbox");
	    //Perform Action with mouse. Move mouse from Inbox menu to Draft link then click it
        Actions builder = new Actions(driver);
        Screenshoter.takeScreenshot("src/test/resources/screenshots/emailSendingTabs_");
        builder.moveToElement(inboxBoxLink).perform();
        Screenshoter.takeScreenshot("src/test/resources/screenshots/emailSendingTabs_");
        builder.moveToElement(draftBoxLink).click().perform();
        Screenshoter.takeScreenshot("src/test/resources/screenshots/emailSendingTabs_");
		// open draft box and open new saved email
		waitForPageLoad("Drafts");
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[contains(text(), '"+uniqueStack+"')]")));
//		waitForElementVisible(sendEmailButton);
		sendEmailButton.click();
		// open sent box and check that email has been sent
		waitForPageLoad("Drafts");
		executor.executeScript("arguments[0].click();", sentMailBoxLink);
		waitForElementVisible(draftBoxLink);
		draftBoxLink.click();
		return this;
	}
}
