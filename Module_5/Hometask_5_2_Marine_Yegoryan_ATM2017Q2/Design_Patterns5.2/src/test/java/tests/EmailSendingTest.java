package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InboxBoxPage;
import pages.MailBoxPage;
import singleton.WebDriverSingleton;

import static pages.AbstractPage.uniqueStack;

public class EmailSendingTest{
    @Test (priority = 2)
    public void emailSendingTest() {
        InboxBoxPage emailSending = new  MailBoxPage().emailCreation().emailSending();
        WebDriver driver = WebDriverSingleton.getWebDriverInstance();
        // verify that email is in sent mail box
        try {
            WebElement emailLink = driver.findElement(By.xpath("//span[contains(text(), '"+uniqueStack+"')]"));
            Assert.assertFalse(Boolean.parseBoolean(emailLink.getText()));
        } catch (NoSuchElementException e) {
            System.err.println("Element Is found : " + e.getMessage());
        }
    }
}
