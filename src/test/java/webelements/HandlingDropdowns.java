package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		Select dropDownSelect=new Select(dropdown);
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].scrollIntoView();", dropdown);
		//Thread.sleep(2000);
		
		//dropDownSelect.selectByVisibleText("Shqip");
		
		Thread.sleep(2000);
		
		dropDownSelect.selectByIndex(5);
		
		Thread.sleep(4000);
		
		dropDownSelect.selectByValue("el");
		Thread.sleep(2000);
		
		
		

	}

}
