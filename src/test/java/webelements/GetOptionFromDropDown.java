package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetOptionFromDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		
		List<WebElement> optionDropDown=driver.findElements(By.tagName("option"));
		for(WebElement ele:optionDropDown) {
			System.out.println(ele.getText());
		}

	}

}
