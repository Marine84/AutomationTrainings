package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DraftBoxPage;
import pages.MailBoxPage;

public class EmailSendingTest extends LoginTest {
    @Test
    public void emailSendingTest() {
        new MailBoxPage().emailCreation();
        new DraftBoxPage().emailSending();
        // verify that email is in sent mail box
        Assert.assertNotEquals("(Locator test).*", driver.findElement(By.xpath("//*")).getText());
    }
}
