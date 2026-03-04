package seleniumTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCompatibilityTest {

	public static void main(String[] args) {
		String browser = "chrome";

		WebDriver driver = null;

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}

		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println("Title of the page: " + title);
		if (title.equals("Google")) {
			System.out.println("Title is matching");
		} else {
			System.out.println("Title is not matching");
		}

		driver.quit();//close all the windows present in that session
		//driver.close();//close current browser/window
	}

}
