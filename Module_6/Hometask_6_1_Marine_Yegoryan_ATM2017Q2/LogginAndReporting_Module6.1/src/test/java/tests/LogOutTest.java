package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LogOutTest extends BaseTests {
    @Test (priority = 4)
    public void userLogoutTest() {
        Assert.assertNotEquals(driver.getTitle(), "Gmail");
    }
}
