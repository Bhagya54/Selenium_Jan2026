package testngtestcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample1 {
	
@BeforeSuite
public void beforeSuite() {
	System.out.println("Before Suite");
}
@AfterSuite
public void afterSuite() {
	System.out.println("After Suite");
}

@BeforeTest
public void beforeTest() {
	System.out.println("Before Test");
}
@AfterTest
public void afterTest() {
	System.out.println("After Test");
}
@BeforeClass
public void beforeClass() {
	System.out.println("Before Class");
}
@AfterClass
public void afterClass() {
	System.out.println("After Class");
}

@BeforeMethod
public void beforeMethod() {
	System.out.println("Open Browser - Before Method");
}
@AfterMethod
public void afterMethod() {
	System.out.println("Close Browser - After Method");
}
@Test
public void doLogin() {
	System.out.println("Login is successful - Testcase 1");
}
@Test
public void doReg() {
	System.out.println("Registration is successful - Testcase 2");
}
}
