package testngtestcases;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListener implements ITestListener{

	public void onTestStart(ITestResult result) {
	    Reporter.log(result.getMethod().getMethodName() + " is started");
	  }
	
	public void onTestSuccess(ITestResult result) {
		 Reporter.log(result.getMethod().getMethodName() + " is passed");
	  }
	
	public void onTestFailure(ITestResult result) {
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		 Reporter.log(result.getMethod().getMethodName() + " is failed");
		 Reporter.log("<a href=\"C:\\Users\\91733\\OneDrive\\Desktop\\sample.jfif\">screenshot link</a>");
	  }
	
	public void onTestSkipped(ITestResult result) {
		 Reporter.log(result.getMethod().getMethodName() + " is skipped");
	  }
}
