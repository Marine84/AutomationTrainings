package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.MailBoxPage;
import org.testng.annotations.Test;

import static pages.AbstractPage.uniqueStack;

public class EmailCreationTest extends BaseTests {
    @Test (priority = 2)
    public void emailCreationTest() {
        MailBoxPage mailbox = new MailBoxPage();
        mailbox.clickComposeButton().inputEmailAddress("arguments[0].value='marineyegoryan0884@gmail.com';").inputEmailSubject().inputEmailBody("test").saveAndCloseEmail();
        // verify that email has been saved in draft
        WebElement emailLink = driver.findElement(By.xpath("//span[contains(text(), '" + uniqueStack + "')]"));
        Assert.assertEquals(uniqueStack, emailLink.getText());
    }
}
