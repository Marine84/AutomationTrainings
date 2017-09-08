package keywords;

import custom_exception.NoSuchKeywordFoundException;
import org.openqa.selenium.WebDriver;
import singleton.WebDriverSingleton;

import java.io.IOException;

/**
 * Created by Marine_Yegoryan on 9/8/2017.
 */
public class PrintExcelDataTest {
    public static void main(String[] args) throws IOException, NoSuchKeywordFoundException {
        WebDriver driver = driver = WebDriverSingleton.getWebDriverInstance();
        FetchDataFromExcel fetchData = new FetchDataFromExcel();
        KeywordDataEngine keywordAction = new KeywordDataEngine(2, 3, 4, 5);
        driver.get("https://gmail.com/");

        for (int i = 2; i <= fetchData.mySheet.getLastRowNum(); i++) {
            keywordAction.GetElementLocatorPublic(i);
        }
//        String str = fetchData.GetExactDataFromExcel(2,5);
//        System.out.println(str);

    }
}
