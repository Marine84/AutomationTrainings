package tests;

import builder.User;
import decorator.UserDecorator;
import org.openqa.selenium.WebDriver;
import pages.InputPasswordPage;
import pages.InputUsernamePage;
import org.testng.annotations.*;
import singleton.WebDriverSingleton;

public class BaseTests {
    WebDriver driver = WebDriverSingleton.getWebDriverInstance();
    //   UserName and Pass are used either via decorator or build patterns
    //   Get username and Pass via Build pattern
    User user = new User.UserBuilder("marineyegoryan0884", "marinetest").build();

    @BeforeTest()
    @Parameters("baseUrl")
    public void loginTest(String baseUrl) {
        InputPasswordPage emailLogin = new InputUsernamePage().open(baseUrl).inputUserName(user.getUsername()).goNext()
                .inputPassword(user.getPassword()).goNext();
    }

    @AfterTest()
    public void logoutTest() {
        InputPasswordPage emailLogin = new InputPasswordPage().signOff();
        driver.quit();
    }
}
