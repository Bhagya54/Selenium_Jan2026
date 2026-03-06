package seleniumTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://redbus.com");
		driver.navigate().to("https://google.com");
		System.out.println(driver.getTitle());//google
		//Navigation nav = driver.navigate();
		//nav.back();
		driver.navigate().back();//method chaining
		System.out.println(driver.getTitle());//redbus
		driver.navigate().forward();
		System.out.println(driver.getTitle());//google
		driver.navigate().refresh();//refreshes google 
		driver.quit();
	}
}
