package extentReports;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import extentlisteners.ExtentListeners;

public class FBTest {

	
	@Test
	public void doLogin() {
		
		ExtentListeners.test.info("Enter username");
		ExtentListeners.test.info("enter password");
		ExtentListeners.test.info("Click on Login button");
	}
	
	@Test
	public void doUserReg() {
		
		ExtentListeners.test.info("Enter firstname");
		ExtentListeners.test.info("enter lastname");
		ExtentListeners.test.info("Click on Register button");
		Assert.fail("Intentinal Fail");
	}
	
	@Test
	public void doSkip() {
		
		ExtentListeners.test.info("skip test");
		throw new SkipException("Skip the testcase");
		
	}
}
