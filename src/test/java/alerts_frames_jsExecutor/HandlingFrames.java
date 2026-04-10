package alerts_frames_jsExecutor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		// driver.switchTo().frame("iframeResult");
		/*
		 * List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		 * System.out.println(allFrames.size()); driver.switchTo().frame(0);
		 */

		WebElement frame0=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame0);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		String outputText = driver.findElement(By.id("demo")).getText();
		if (outputText.equals("Submit the form")) {
			System.out.println("success");
		} else {
			System.out.println("Failure");
		}

	}
}
