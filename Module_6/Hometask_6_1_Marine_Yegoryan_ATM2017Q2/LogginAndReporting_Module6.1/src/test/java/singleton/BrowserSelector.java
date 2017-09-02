package singleton;

import factorymethod.ChromeDriverCreator;
import factorymethod.FireFoxDriverCreator;
import factorymethod.WebDriverCreator;
import org.openqa.selenium.WebDriver;


public class BrowserSelector {
    public static WebDriverCreator selectBrowser (String driverType) {
        if (driverType. equals ("chrome")){
            return new ChromeDriverCreator();
        }else if(driverType. equals ("firefox")){
            return new FireFoxDriverCreator();
        }
        throw new IllegalArgumentException("No such driver");
    }
}
