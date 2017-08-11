package cucumber_TestsInGherkin.steps;

import businessobjects_Builder.User;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.InputUsernamePage;
import pages.MailBoxPage;
import utils.WebDriverSingleton;

public class EmailCreationSteps {

    private static final String BASE_URL = "https://gmail.com/";

    WebDriver driver = WebDriverSingleton.getWebDriverInstance();
    User user = new User.UserBuilder("marineyegoryan0884", "marinetest").build();
    InputUsernamePage emailLogin = new InputUsernamePage();
    MailBoxPage mailbox = new MailBoxPage();

    @Given("^user is in gmail home page$")
    public void navigate_to_home_page(){
        emailLogin.open(BASE_URL).inputUserName(user.getUsername()).goNext().inputPassword(user.getPassword()).goNext();;
    }

    @When("^user signed in to the home page$")
    public void user_signed_in() {
        // Login via user-defined method
        Assert.assertTrue(driver.getTitle().contains("Inbox"));
    }

    @And("^enters email address, subject and content to submit email form$")
    public void enter_email_informations() {
        mailbox.emailCreation();
    }

    @Then("^email will be created$")
    public void verify_login_is_completed() {
        Assert.assertTrue(driver.getTitle().contains("Inbox"));
        System.out.println("Email was created correctly.");
    }
}
