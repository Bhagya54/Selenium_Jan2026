package testngtestcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Priority {

	@Test(priority=0)
	public void login() {
		System.out.println("Login is successful - Testcase 1");
		
		
	}
	@Test(priority = -111)
	public void doReg() {
		System.out.println("Registration is successful - Testcase 2");
		
	}
	
	@Test
	public void NoPri() {
		System.out.println("No Priority");
		
	}
}
