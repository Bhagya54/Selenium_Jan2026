package gestures;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gestures_ContextClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		WebElement ele = driver.findElement(By.xpath("//img[contains(@src,'popup_pic.gif')]"));
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
		
	}

}
