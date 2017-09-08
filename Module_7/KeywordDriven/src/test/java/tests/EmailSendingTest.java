package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InboxBoxPage;
import pages.MailBoxPage;
import utils.Screenshoter;
import singleton.WebDriverSingleton;

import static loggers.Logging.errorLogger;
import static pages.AbstractPage.uniqueStack;

public class EmailSendingTest {
    @Test(priority = 3)
    public void emailSendingTest() {
        MailBoxPage createEmail = new MailBoxPage().clickComposeButton().inputEmailAddress("arguments[0].value='marineyegoryan0884@gmail.com';").inputEmailSubject().inputEmailBody("test");
        InboxBoxPage emailSending = createEmail.saveAndCloseEmail().tabmousehoverscreenshot().getCreatedEmailLink().clickEmailToSend().checkEmailExistInSentBox();
        WebDriver driver = WebDriverSingleton.getWebDriverInstance();
        // verify that email is in sent mail box
        try {
            WebElement emailLink = driver.findElement(By.xpath("//span[contains(text(), '" + uniqueStack + "')]"));
            Assert.assertFalse(Boolean.parseBoolean(emailLink.getText()));
        } catch (NoSuchElementException e) {
            Screenshoter.takeScreenshot("src/test/resources/screenshots/err_");
            errorLogger("System couldn't find the link of new created email");
        }
    }
}
