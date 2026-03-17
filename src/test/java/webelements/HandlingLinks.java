package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		
		WebElement block=driver.findElement(By.cssSelector("nav.other-projects"));
		
		List<WebElement> allLinks=block.findElements(By.tagName("a"));
		System.out.println("Number of links: " + allLinks.size());
		
		
		for(WebElement ele:allLinks) {
			System.out.println(ele.getText() +  "----" + ele.getAttribute("href"));
		}
				
				
				
				
	}

}
