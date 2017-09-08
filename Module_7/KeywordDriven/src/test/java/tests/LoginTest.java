package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Screenshoter;


public class LoginTest extends BaseTests {

    @Test(priority=1)
    public void userLoginTest() {
        Assert.assertTrue(driver.getTitle().contains("Gmail"));
    }
}
