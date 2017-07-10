package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utils.Screenshoter;

public class DraftBoxPage extends AbstractPage {

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

	public DraftBoxPage emailSending() {
		waitForPageLoad("Inbox");
	    //Perform Action with mouse. Move mouse from Inbox menu to Draft link then click it
        Actions builder = new Actions(driver);
        Screenshoter.deleteOldScreenshots();
        Screenshoter.takeScreenshot();
        builder.moveToElement(inboxBoxLink).perform();
        Screenshoter.takeScreenshot();
        builder.moveToElement(draftBoxLink).click().perform();
        Screenshoter.takeScreenshot();
		// open draft box and open new saved email
		waitForPageLoad("Drafts");
        (driver.findElement(By.xpath("//span[contains(text(), '"+uniqueStack+"')]"))).click();
		sendEmailButton.click();
		// open sent box and check that email has been sent
		waitForPageLoad("Drafts");
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", sentMailBoxLink);
		waitForElementVisible(draftBoxLink);
		draftBoxLink.click();
		return this;
	}
}
