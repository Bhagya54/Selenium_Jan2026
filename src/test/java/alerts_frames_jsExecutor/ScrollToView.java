package alerts_frames_jsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToView {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		WebElement submit = driver.findElement(By.partialLinkText("Attribution-ShareAlike License"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", submit);
		submit.click();
	}

}
