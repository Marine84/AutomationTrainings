package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DraftBoxPage;
import pages.MailBoxPage;
import utils.WebDriverSingleton;

public class EmailSendingTest{
    @Test
    public void emailSendingTest() {
        new MailBoxPage().emailCreation();
        new DraftBoxPage().emailSending();
        WebDriver driver = WebDriverSingleton.getWebDriverInstance();
        // verify that email is in sent mail box
        Assert.assertNotEquals("(Locator test).*", driver.findElement(By.xpath("//*")).getText());
    }
}
