package cucumber_TestsInGherkin.teststeps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.InputPasswordPage;
import pages.InputUsernamePage;
import utils.WebDriverSingleton;

public class GmailLoginSteps {

    private static final String BASE_URL = "https://gmail.com/";

    WebDriver driver = WebDriverSingleton.getWebDriverInstance();
    InputUsernamePage emailLogin = new InputUsernamePage();
    InputPasswordPage emailPass = new InputPasswordPage();

    @Given("^user navigates to gmail home page$")
    public void navigate_to_home_page(){
        emailLogin.open(BASE_URL);
    }

    @When("^click signIn button$")
    public void click_signIn() {
        // Login via user-defined method
        Assert.assertTrue(driver.getTitle().contains("Gmail"));
    }

    @And("^enter user credentials \"(.*)\" and \"(.*)\" to submit login form$")
    public void enter_user_credentials(String username, String password) {
        emailLogin.inputUserName(username).goNext().inputPassword(password).goNext();
    }

    @Then("^gmail home page is displayed$")
    public void verify_login_is_completed() {
        Assert.assertTrue(driver.getTitle().contains("Inbox"));
        System.out.println("Login was completed correctly.");
        emailPass.signOff();
    }
}
