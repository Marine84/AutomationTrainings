package tests;

import Decorator.UserDecorator;
import business_objects.User;
import org.openqa.selenium.WebDriver;
import pages.AbstractPage;
import pages.InputPasswordPage;
import pages.InputUsernamePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.WebDriverSingleton;

public class LoginTest {

    protected WebDriver driver;

    public UserDecorator user = new UserDecorator("marineyegoryan0884", "marinetest");

    @BeforeTest()
    @Parameters("baseUrl")
    public void loginTest(String baseUrl) {
        InputPasswordPage emailLogin = new InputUsernamePage().open(baseUrl).inputUserName(user.getUsername()).goNext()
                .inputPassword(user.getPassword()).goNext();
        driver = WebDriverSingleton.getWebDriverInstance();
        // Verify, that the login is successful
//        Assert.assertEquals("Gmail", driver.findElement(By.xpath("//div[@aria-label='Navigate to']/span[text()='Gmail']")));
    }
    @AfterTest()
//    @Parameters("baseUrl")
    public void logoutTest() {
        InputPasswordPage emailLogin = new InputPasswordPage().signOff();
//        Assert.assertEquals("Gmail", driver.getTitle());
        driver.quit();
    }
}
