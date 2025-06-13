package listeners;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test " + result.getName() + " passed");
        //add logic to send request with test results to tms
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test " + result.getName() + " failed");
        //add logic to send request with test results to tms
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        //add logic to send request with test results to tms
    }

    @Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {
    }
}
