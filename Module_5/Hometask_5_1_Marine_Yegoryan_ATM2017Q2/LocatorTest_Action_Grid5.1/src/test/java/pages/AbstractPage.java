package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverSingleton;

public abstract class AbstractPage{

	public static final int WAIT_FORELEMENT_TIME_SECONDS = 10;
	protected WebDriver driver;
	private static final Long getTime = System.nanoTime();
	public static final String uniqueStack = "Locator test" + Long.toString(getTime);

	protected AbstractPage() {
		this.driver = WebDriverSingleton.getWebDriverInstance();
		PageFactory.initElements(this.driver, this);
	}

	public void waitForElementVisible(WebElement webElement) {
		new WebDriverWait(driver, WAIT_FORELEMENT_TIME_SECONDS).until(ExpectedConditions.visibilityOf(webElement));
	}

	public void waitForElementClick(WebElement webElement) {
		new WebDriverWait(driver, WAIT_FORELEMENT_TIME_SECONDS)
				.until(ExpectedConditions.elementToBeClickable(webElement));
	}

	public void waitForPageLoad(final String title) {
		ExpectedCondition<Boolean> expectation = new
				ExpectedCondition<Boolean>() {
					public Boolean apply(WebDriver driver) {
						return (driver.getTitle().contains(title));
					}
				};
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(expectation);
	}
}
