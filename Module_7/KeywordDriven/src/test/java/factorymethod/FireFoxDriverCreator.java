package factorymethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverCreator extends WebDriverCreator{

    @Override
    public WebDriver FactoryMethod(){
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
