package testngtestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
/*
 * Hard Assert  - failure at 5th line - 1-10 - 6-10th will not execute
 * Soft Assert - though there is a failure, your lines of code 
 * does not get terminated
 * 
 */
public class AssertDemo {
	
WebDriver driver = null;

@BeforeClass
public void setUp() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://facebook.com");
}

@AfterClass
public void tearDown() {
	driver.quit();
}


@Test
public void verifyTitle() {
	
	//Assert.assertEquals(driver.getTitle(), "Facebook");
	Assert.assertTrue(driver.getTitle().equals("Facebook"), "Your title is not matching .. please check once");
	//Assert.assertFalse(driver.getTitle().equals("Google"),"Your title are matching .. please check once");
	
}
}
