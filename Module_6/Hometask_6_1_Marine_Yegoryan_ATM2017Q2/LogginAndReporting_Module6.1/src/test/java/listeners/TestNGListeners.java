package listeners;

import loggers.Logging;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.Screenshoter;

import static loggers.Logging.errorLogger;

public class TestNGListeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
       // result.()
        Logging.infoLogger();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Screenshoter.takeScreenshot("src/test/resources/screenshots/err_");
        errorLogger();
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {
        Logging.infoLogger();
    }
}
