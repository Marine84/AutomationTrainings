package cucumber_TestsInGherkin;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSingleton;

@CucumberOptions( /*tags="@smokeTest",*/ features = "./src/test/resources/features/f1")
public class GmailLoginCucumberTest extends AbstractTestNGCucumberTests {
    WebDriver driver = WebDriverSingleton.getWebDriverInstance();
}

