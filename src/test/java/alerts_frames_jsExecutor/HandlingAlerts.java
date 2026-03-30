package alerts_frames_jsExecutor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//button[contains(text(),'demonstrate the prompt box')]")).click();
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.sendKeys("selenium");
		al.accept();
	}

}
