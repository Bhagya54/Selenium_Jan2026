package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllOption_Dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		Select dropDownSelect=new Select(dropdown);
		
		List<WebElement> allOption=dropDownSelect.getOptions();
		System.out.println("Number of options are: " + allOption.size());
		
		for(int i=0;i<allOption.size();i++) {
			WebElement option=allOption.get(i);
			//System.out.println(option.getText());
			System.out.println(option.getAttribute("value"));
		}

	}

}
