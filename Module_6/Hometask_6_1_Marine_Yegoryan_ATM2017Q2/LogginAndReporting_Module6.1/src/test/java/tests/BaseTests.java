package tests;

import user.builder.User;
import org.openqa.selenium.WebDriver;
import pages.InputPasswordPage;
import pages.InputUsernamePage;
import org.testng.annotations.*;
import singleton.WebDriverSingleton;

public class BaseTests {
    WebDriver driver = WebDriverSingleton.getWebDriverInstance();
    //   UserName and Pass are used either via user.decorator or build patterns
    //   Get username and Pass via Build pattern
    User user = new User.UserBuilder("marineyegoryan0884", "marinetest").build();

    //  Get username and Pass via Decorator pattern
    //   public UserDecorator user = new UserDecorator("marineyegoryan0884", "marinetest");

    @BeforeTest()
    @Parameters("baseUrl")
    public void loginTest(String baseUrl) {

        InputUsernamePage emailLogin = new InputUsernamePage().open(baseUrl);

        emailLogin.inputUserName(user.getUsername()).goNext().inputPassword(user.getPassword()).goNext();
    }

    @AfterTest()
    public void logoutTest() {
        InputPasswordPage emailLogin = new InputPasswordPage().signOff();
        driver.quit();
    }
}
