package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import singleton.WebDriverSingleton;

import java.io.File;
import java.io.IOException;

public class Screenshoter {
    private static String SCREENSHOTS_NAME_TPL;
    private static final String SCREENSHOTS_DIR_TO_DELETE = "src\\test\\resources\\screenshots";

    public static void deleteOldScreenshots() {
        try {
            FileUtils.deleteDirectory(new File(SCREENSHOTS_DIR_TO_DELETE));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void takeScreenshot(String SCREENSHOTS_NAME_TPL) {
        WebDriver driver = WebDriverSingleton.getWebDriverInstance();
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            String screenshotName = SCREENSHOTS_NAME_TPL + System.nanoTime();
            File copy = new File(screenshotName + ".png");
            FileUtils.copyFile(screenshot, copy);

        } catch (IOException e) {
           System.out.println("Failed to make screenshot");
        }
    }
}
