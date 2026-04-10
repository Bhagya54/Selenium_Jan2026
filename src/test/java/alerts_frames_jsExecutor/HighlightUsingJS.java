package alerts_frames_jsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//CTRL+SHIFT+O

public class HighlightUsingJS {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		WebElement frame0=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame0);
		
		WebElement submit = driver.findElement(By.id("mySubmit"));
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", submit);

	}

}
