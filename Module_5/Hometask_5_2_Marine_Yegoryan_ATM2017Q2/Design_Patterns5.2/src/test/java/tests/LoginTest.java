package tests;

import businessobjects_Builder.User;
import org.openqa.selenium.WebDriver;
import pages.InputPasswordPage;
import pages.InputUsernamePage;
import org.testng.annotations.*;
import utils.WebDriverSingleton;

public class LoginTest {
    protected WebDriver driver;
    //   UserName and Pass are used either via decorator or build patterns
    //   Get username and Pass via Build pattern
    User user = new User.UserBuilder("marineyegoryan0884", "marinetest").build();

    //  Get username and Pass via Decorator pattern
    //   public UserDecorator user = new UserDecorator("marineyegoryan0884", "marinetest");

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
    public void logoutTest() {
        InputPasswordPage emailLogin = new InputPasswordPage().signOff();
//        Assert.assertEquals("Gmail", driver.getTitle());
        driver.quit();
    }
}
