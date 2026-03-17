package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckboxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		
		
		WebElement block = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
		
		List<WebElement> allCheckboxes=block.findElements(By.tagName("input"));
		System.out.println(allCheckboxes.size());
		
		for(WebElement checkbox : allCheckboxes) {
			/*
			 * if(checkbox.getAttribute("value").equals("basketball")) { checkbox.click();
			 * System.out.println("Basketball is being checked"); }
			 */
			
			if(!checkbox.isSelected()) {
				checkbox.click();
			}
			
		}

	}

}
