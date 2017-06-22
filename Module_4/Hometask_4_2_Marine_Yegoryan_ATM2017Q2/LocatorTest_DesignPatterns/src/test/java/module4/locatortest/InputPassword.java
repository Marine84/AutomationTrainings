package module4.locatortest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputPassword extends AbstractPage {

	public InputPassword(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id='password']//input[@type='password']")
	WebElement inputPassBox;

	@FindBy(id = "passwordNext")
	WebElement passNextButton;

	@FindBy(xpath = "//div[@aria-label='Navigate to']/span[text()='Gmail']")
	WebElement gmailIcon;
	
	@FindBy(xpath = "//a[contains(@title, 'Google Account')]")
	WebElement googleAccountIcon;
	
	@FindBy(xpath = "//a[text()='Sign out']")
	WebElement signOutIcon;

	// implementation of password filling
	public InputPassword inputPassword(String text) {
		waitForElementVisible(inputPassBox);
		inputPassBox.clear();
		inputPassBox.sendKeys(text);
		return this;
	}

	public InputPassword goNext() {
		waitForElementClick(passNextButton);
		passNextButton.click();
		return this;
	}

	public InputPassword signOff() {
		// sign out
		googleAccountIcon.click();
		signOutIcon.click();
		return this;
	}
}
