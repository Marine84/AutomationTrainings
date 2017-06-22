package module4.locatortest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputUsername extends AbstractPage {
	
	@FindBy(id = "identifierId")
	WebElement inputUsernameBox;
	
	@FindBy(id = "identifierNext")
	WebElement nextButton;
	
	public InputUsername(WebDriver driver){
		super(driver);
	}

	public InputUsername inputUserName(String text){
		inputUsernameBox.click();
		inputUsernameBox.clear();
		inputUsernameBox.sendKeys(text);
		return this;
	}
	
	public InputPassword goNext(){
		nextButton.click();
		return new InputPassword(driver);
	}
	
	public InputUsername open(String baseUrl) {
		driver.get(baseUrl);
		return this;
	}

}
