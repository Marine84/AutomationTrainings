package factorymethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDriverCreator extends WebDriverCreator{

    @Override
    public WebDriver FactoryMethod(){
        WebDriver driver = new ChromeDriver();
        return driver;
    }
}
