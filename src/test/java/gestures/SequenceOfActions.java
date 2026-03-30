package gestures;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SequenceOfActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		WebElement email=driver.findElement(By.name("email"));
		
		Actions act = new Actions(driver);
		Action seriesOfAction=act.moveToElement(email)
								.click(email)
								.keyDown(email,Keys.SHIFT)
								.sendKeys(email,"hello")
								.keyUp(email,Keys.SHIFT)
								.doubleClick(email)
								.contextClick(email)
								.build();
		seriesOfAction.perform();
								
		/*press shift
		 * Enter email in email field
		 * release shift
		 * double click on email field
		 * right click on email field
		 * 
		 * Verify the url contains selenium
		 */

	}

}
