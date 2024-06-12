package common;
import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utilities.testUtils;

public class Listeners extends testUtils implements ITestListener {
	
	public void onTeststart(ITestResult result) {
		System.out.println("Test case is starting");
	}
	
    public void onTestSuccess(ITestResult result) {
	System.out.println("Test Passed"+result.getTestName());
	}

	
	public void onTestFailure(ITestResult result) {
		try { 
			getScreenshot();
		System.out.println("Test Failed"+result.getTestName());
		} catch (IOException c)
		{
			c.printStackTrace();
		}
	}

	
	public void onTestSkipped(ITestResult result) {
	
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	
	public void onFinish(ITestContext context) {
		
	}
}


