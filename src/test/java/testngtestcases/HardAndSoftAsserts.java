package testngtestcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAsserts {

	String str="google";
	@Test
	public void hardAssertDemo() {
		Assert.assertEquals(1,1);
		Assert.assertEquals('c','b');
		System.out.println("I am asserting a string equals condition");
		Assert.assertTrue(str.equals("google"));
	}
	
	@Test
	public void softAssertDemo() {
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(1,1);
		soft.assertEquals('c','b');
		System.out.println("I am asserting a string equals condition");
		soft.assertTrue(str.equals("gmail"));
		soft.assertAll();
	}
	
	
	@Test
	public void intentionallyFail() {
		Assert.fail("Intentionally Failing the testcase");
	}
	
	@Test
	public void skipIntentionally() {
		throw new SkipException("skip the testcase");
	}
	
}
