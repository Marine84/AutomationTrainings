package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputPasswordPage extends AbstractPage {

	@FindBy(xpath = "//*[@id='password']//input[@type='password']")
	WebElement inputPassBox;

	@FindBy(id = "passwordNext")
	WebElement passNextButton;

	@FindBy(xpath = "//a[contains(@title, 'Google Account')]")
	WebElement googleAccountIcon;
	
	@FindBy(xpath = "//a[text()='Sign out']")
	WebElement signOutIcon;

	// implementation of password filling
	public InputPasswordPage inputPassword(String pass) {
		waitForElementVisible(inputPassBox);
		inputPassBox.clear();
		inputPassBox.sendKeys(pass);
		return this;
	}

	public InputPasswordPage goNext() {
		waitForElementClick(passNextButton);
		passNextButton.click();
		waitForPageLoad("Inbox");
		return this;
	}

	public InputPasswordPage signOff() {
		// sign out
		googleAccountIcon.click();
		signOutIcon.click();
		return this;
	}
}
