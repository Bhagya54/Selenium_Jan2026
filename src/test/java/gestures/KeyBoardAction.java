package gestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		//Actions - class 
		//Action - interface
		Actions act = new Actions(driver);
		Action act_sq=act.sendKeys(Keys.ARROW_DOWN)
			.pause(Duration.ofSeconds(2))
			.sendKeys(Keys.ARROW_DOWN)
			.pause(Duration.ofSeconds(2))
			.sendKeys(Keys.ARROW_DOWN)
			.pause(Duration.ofSeconds(2))
			.sendKeys(Keys.ENTER)
			.build();
		act_sq.perform();
		
		if(driver.getCurrentUrl().contains("selenium")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		
		/*
		 * Enter selenium
		 * arrow down
		 * pause 2 seconds
		 * arrow down
		 * pause 2 seconds
		 * arrow down
		 * pause 2 seconds
		 * Press Enter key
		 * Verify the url contains selenium
		 */

	}

}
