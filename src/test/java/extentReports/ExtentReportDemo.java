package extentReports;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReportDemo {
	
	public ExtentSparkReporter htmlReport;//generates a html report
	public ExtentReports extent;//create a testcase, config,system properties
	public ExtentTest test;//status of test - pass,fail,skip
	
	@BeforeTest
	public void extentSetup() {
		htmlReport=new ExtentSparkReporter("./reports/extent.html");
		htmlReport.config().setDocumentTitle("Extent Report for Selenium");
		htmlReport.config().setReportName("Automation Report");
		htmlReport.config().setEncoding("UTF-8");
		htmlReport.config().setTheme(Theme.STANDARD);
		
		
		extent=new ExtentReports();
		extent.attachReporter(htmlReport);
		extent.setSystemInfo("Automation Tester","Bhagya");
		extent.setSystemInfo("Build","1234");
		extent.setSystemInfo("Organization","Testing");
		
	}
	
	@AfterTest
	public void tearDown() {
		extent.flush();
	}
	
	@Test
	public void doLogin() {
		test=extent.createTest("Login Test");
		test.info("Enter username");
		test.info("enter password");
		test.info("Click on Login button");
	}
	
	@AfterMethod
	public void getResult(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		Markup m;
		if(result.getStatus()==ITestResult.SUCCESS) {
			//test.pass("Test case is passed: " + methodName);
			m=MarkupHelper.createLabel("Test case is passed: " + methodName, ExtentColor.GREEN);
			test.pass(m);
		}
		else if(result.getStatus()==ITestResult.FAILURE) {
			//test.fail("Test case is failed: " + methodName);
			m=MarkupHelper.createLabel("Test case is failed: " + methodName, ExtentColor.RED);
			test.fail(m);
		}
		
		else if(result.getStatus()==ITestResult.SKIP) {
			//test.skip("Test case is skipped: " + methodName);
			m=MarkupHelper.createLabel("Test case is skipped: " + methodName, ExtentColor.AMBER);
			test.skip(m);
		}
	}
	
	@Test
	public void doUserReg() {
		test=extent.createTest("User Registration Test");
		test.info("Enter firstname");
		test.info("enter lastname");
		test.info("Click on Register button");
		Assert.fail("Intentinal Fail");
	}
	
	@Test
	public void doSkip() {
		test=extent.createTest("Skip Test");
		test.info("skip test");
		throw new SkipException("Skip the testcase");
		
	}

}
