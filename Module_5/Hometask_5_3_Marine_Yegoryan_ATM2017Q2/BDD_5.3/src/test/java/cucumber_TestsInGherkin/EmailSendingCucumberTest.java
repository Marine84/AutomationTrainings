package cucumber_TestsInGherkin;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSingleton;

@CucumberOptions( features = "./src/test/resources/features/f3", glue="cucumber_TestsInGherkin.teststeps")
public class EmailSendingCucumberTest extends AbstractTestNGCucumberTests {
}
