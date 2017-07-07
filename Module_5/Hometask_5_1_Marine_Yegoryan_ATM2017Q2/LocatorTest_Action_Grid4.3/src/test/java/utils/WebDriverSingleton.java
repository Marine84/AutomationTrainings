package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WebDriverSingleton {
    private static WebDriver driver;

    public static WebDriver getWebDriverInstance() {
        if (driver != null) {
            return driver;
        }
        return driver = setUp();
    }

    public static WebDriver setUp() {
        WebDriver driver = new FirefoxDriver();
        // initiate and execute driver via grid
//        WebDriver driver = null;
//        try {
//            driver = new RemoteWebDriver(new URL("https://127.0.0.1:4444/wd/hub"), DesiredCapabilities.chrome());
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        return driver;
    }
}
