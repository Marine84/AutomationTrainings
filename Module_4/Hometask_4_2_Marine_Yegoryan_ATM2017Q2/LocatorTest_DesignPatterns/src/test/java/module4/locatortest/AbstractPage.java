package module4.locatortest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {

	public static final int WAIT_FORELEMENT_TIME_SECONDS = 10;
	protected WebDriver driver;
	
	public AbstractPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void waitForElementVisible(WebElement webElement){
		new WebDriverWait(driver,WAIT_FORELEMENT_TIME_SECONDS).until(ExpectedConditions.visibilityOf(webElement));
	}
	
	public void waitForElementClick(WebElement webElement){
		new WebDriverWait(driver,WAIT_FORELEMENT_TIME_SECONDS).until(ExpectedConditions.elementToBeClickable(webElement));
	}
}
