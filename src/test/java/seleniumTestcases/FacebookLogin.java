package seleniumTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicitwait - presence condition only
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Facebook")) {
			System.out.println("Successfully on facebook website");
		}
		else {
			System.out.println("Facebook website didn't open");
		}
		WebElement emailid = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("pass"));
		WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div/div[1]/div/span/span"));

		emailid.sendKeys("testing@gmail.com");
		password.sendKeys("selenium123");
		loginBtn.click();
		
		//Thread.sleep(3000);//java
		/*
		 * implicitwait - 
		 * explicitwait
		 * 
		 */
		
		WebElement errorMsg=driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[1]/div/div/div/div/div[2]/div/span"));
		String errorMsgString=errorMsg.getText();
		
		
		if(errorMsgString.contains("The login information you entered is incorrect")) {
			System.out.println("Test case is pass");
		}
		else {
			System.out.println("Testcase is failed");
		}
	}

}
