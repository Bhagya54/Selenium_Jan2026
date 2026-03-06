package seleniumTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodChaining_MaximizeWindow {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		//Options opt = driver.manage();
		//Window win = opt.window();
		//win.maximize();
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		System.out.println("Title: "+driver.getTitle());
		System.out.println("url: " + driver.getCurrentUrl());
		
	}

}
