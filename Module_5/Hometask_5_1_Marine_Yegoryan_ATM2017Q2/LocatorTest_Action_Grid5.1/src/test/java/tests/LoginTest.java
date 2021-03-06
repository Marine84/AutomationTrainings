package tests;

import business_objects.User;
import pages.AbstractPage;
import pages.InputPasswordPage;
import pages.InputUsernamePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest extends AbstractPage {

    User user = new User("marineyegoryan0884","marinetest");

    @BeforeTest()
    @Parameters("baseUrl")
    public void loginTest(String baseUrl) {
        InputPasswordPage emailLogin = new InputUsernamePage().open(baseUrl).inputUserName(user.getUsername()).goNext()
                .inputPassword(user.getPassword()).goNext();
        // Verify, that the login is successful
        Assert.assertEquals("Gmail", driver.findElement(By.xpath("//div[@aria-label='Navigate to']/span[text()='Gmail']")).getText());
    }
    @AfterTest()
    @Parameters("baseUrl")
    public void logoutTest(String baseUrl) {
        InputPasswordPage emailLogin = new InputPasswordPage().signOff();
        Assert.assertEquals("Gmail", driver.getTitle());
        driver.quit();
    }
}
