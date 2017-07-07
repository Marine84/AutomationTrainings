package pages;

import business_objects.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputUsernamePage extends AbstractPage {
	
	@FindBy(id = "identifierId")
	WebElement inputUsernameBox;
	
	@FindBy(id = "identifierNext")
	WebElement nextButton;

	public InputUsernamePage open(String baseUrl) {
		driver.get(baseUrl);
		return this;
	}

	public InputUsernamePage inputUserName(User user){
		inputUsernameBox.click();
		inputUsernameBox.clear();
		inputUsernameBox.sendKeys(user.getUsername());
		return this;
	}
	
	public InputPasswordPage goNext(){
		nextButton.click();
		return new InputPasswordPage();
	}
	


}
