package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTests {
    @Test(priority=1)
    public void userLoginTest() {
        Assert.assertTrue(driver.getTitle().contains("Gmail"));
    }
}
