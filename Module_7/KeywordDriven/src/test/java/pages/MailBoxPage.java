package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MailBoxPage extends AbstractPage {

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

    @FindBy(xpath = "//a[contains(text(),'Inbox')]")
    WebElement inboxBoxLink;

    @FindBy(xpath = "//span[text()='Locator test']")
    WebElement draftSavedEmailLink;

    @FindBy(xpath = "//div[text()='New Message']")
    WebElement newMessageTxt;

    public MailBoxPage clickComposeButton() {
        waitForPageLoad("Inbox");
        createEmail.click();
        return this;
    }

    public MailBoxPage inputEmailAddress(String emailAddress) {
        waitForElementVisible(newMessageTxt);
        textInputTo.click();
        textInputTo.clear();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript(emailAddress, textInputTo);
        //"arguments[0].value='marineyegoryan0884@gmail.com';"
        return this;
    }

    public MailBoxPage inputEmailSubject() {
        textInputSubject.click();
        textInputSubject.clear();
        textInputSubject.sendKeys(uniqueStack);
        return this;
    }

    public MailBoxPage inputEmailBody(String bodyText) {
        // Perform Action with keyboeard. type body from keyboard
        Actions keyPress = new Actions(driver);
        keyPress.moveToElement(textInputBody)
                .click()
                .keyDown(textInputBody, Keys.SHIFT)
                .sendKeys(textInputBody, bodyText).perform();
        return this;
    }

    public InboxBoxPage saveAndCloseEmail() {
        // Save and close. Verify email has been saved in draft
        saveAndCloseButton.click();
        waitForPageLoad("Inbox");
        return new InboxBoxPage();
    }
}
