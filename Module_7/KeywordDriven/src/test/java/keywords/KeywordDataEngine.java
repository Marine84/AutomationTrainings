package keywords;

import custom_exception.NoSuchKeywordFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import singleton.WebDriverSingleton;

import java.io.IOException;

/**
 * Created by Marine_Yegoryan on 9/8/2017.
 */
public class KeywordDataEngine {
    private int keywordCol;
    private int locatorTypeCol;
    private int locatorValueCol;
    private int locatorParamCol;
    private WebDriver driver = driver = WebDriverSingleton.getWebDriverInstance();

    public void waitForElementVisible(WebElement webElement) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(webElement));
    }

    public KeywordDataEngine(int keywordCol, int locatorTypeCol, int locatorValueCol, int locatorParam) throws IOException {
        this.keywordCol = keywordCol;
        this.locatorTypeCol = locatorTypeCol;
        this.locatorValueCol = locatorValueCol;
        this.locatorParamCol = locatorParam;
    }

    FetchDataFromExcel fetchData = new FetchDataFromExcel();

    private By GetElementLocator(String locatorType, String locatorValue) {
//        locatorType = fetchData.GetExactDataFromExcel(locatorTypeCol, locatorTypeCol).toString();
//        locatorValue = fetchData.GetExactDataFromExcel(locatorValueCol, locatorValueCol).toString();
        switch (locatorType) {
            case "id":
                return By.id(locatorValue);
            case "xpath":
                return By.xpath(locatorValue);
            default:
                return By.id(locatorValue);
        }
    }

    private void PerformAction(String keyword, String locatorType, String locatorValue, String locatorParam) throws NoSuchKeywordFoundException {
        switch (keyword) {
            case "click":
                driver.findElement(GetElementLocator(locatorType, locatorValue)).click();
                break;
            case "open":
                driver.get("https://gmail.com/");
            case "clear":
                driver.findElement(GetElementLocator(locatorType, locatorValue)).clear();
                break;
            case "sendKeys":
                driver.findElement(GetElementLocator(locatorType, locatorValue)).sendKeys(locatorParam);
                break;
            case "wait":
                waitForElementVisible(driver.findElement(GetElementLocator(locatorType, locatorValue)));
                break;
            default:
                throw new NoSuchKeywordFoundException("Keyword not found " + keyword);
        }
    }

    public void GetElementLocatorPublic(int i) throws NoSuchKeywordFoundException {
        String str =  fetchData.GetExactDataFromExcel(i, locatorValueCol);
        System.out.println("i = " + i + " keywordCol " + keywordCol + " value = " + str );
                PerformAction(fetchData.GetExactDataFromExcel(i, keywordCol),
                fetchData.GetExactDataFromExcel(i, locatorTypeCol),
                fetchData.GetExactDataFromExcel(i, locatorValueCol),
                fetchData.GetExactDataFromExcel(i, locatorParamCol));
    }
}
