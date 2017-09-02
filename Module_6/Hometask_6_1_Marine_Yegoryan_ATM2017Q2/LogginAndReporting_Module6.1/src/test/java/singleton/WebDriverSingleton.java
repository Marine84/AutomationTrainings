package singleton;

import factorymethod.FireFoxDriverCreator;
import factorymethod.WebDriverCreator;
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
        WebDriverCreator creator = BrowserSelector.selectBrowser("firefox");
        driver = creator.FactoryMethod();
        return driver;
    }
}
