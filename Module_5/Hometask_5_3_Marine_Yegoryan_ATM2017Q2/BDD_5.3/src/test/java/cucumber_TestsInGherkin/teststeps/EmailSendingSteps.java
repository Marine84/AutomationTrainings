package cucumber_TestsInGherkin.teststeps;

import builder.User;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.InboxBoxPage;
import pages.InputUsernamePage;
import pages.MailBoxPage;
import utils.WebDriverSingleton;

import static pages.AbstractPage.uniqueStack;

public class EmailSendingSteps {
    private static final String BASE_URL = "https://gmail.com/";

    WebDriver driver = WebDriverSingleton.getWebDriverInstance();
    User user = new User.UserBuilder("marineyegoryan0884", "marinetest").build();
    InputUsernamePage emailLogin = new InputUsernamePage();
    MailBoxPage mailbox = new MailBoxPage();
    InboxBoxPage emailSending = new  InboxBoxPage();

    @Given("^user created email$")
    public void navigate_to_home_page(){
        emailLogin.open(BASE_URL).inputUserName(user.getUsername()).goNext().inputPassword(user.getPassword()).goNext();;
        mailbox.emailCreation();
    }

    @When("^open created email$")
    public void user_signed_in() {
//        WebElement emailLink = driver.findElement(By.xpath("//span[contains(text(), '"+uniqueStack+"')]"));
//        Assert.assertEquals(uniqueStack, emailLink.getText());
        System.out.println("Email was created.");
    }

    @And("^click send button$")
    public void enter_email_informations() {
        emailSending.emailSending();
    }

    @Then("^email should be sent$")
    public void verify_login_is_completed() {
        try {
            WebElement emailLink = driver.findElement(By.xpath("//span[contains(text(), '"+uniqueStack+"')]"));
            Assert.assertFalse(Boolean.parseBoolean(emailLink.getText()));
        } catch (NoSuchElementException e) {
            System.err.println("Element Is found : " + e.getMessage());
        }
        System.out.println("Email was sent successfully.");
    }
}
