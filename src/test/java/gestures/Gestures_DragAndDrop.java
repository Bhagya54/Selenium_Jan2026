package gestures;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gestures_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		WebElement slider = driver.findElement(By.id("slider"));
		Dimension dim = slider.getSize();
		int x=dim.getWidth();
		int y=dim.getHeight();
		WebElement ele=driver.findElement(By.xpath("//div[@id='slider']/span"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(ele,x/2, 0).perform();
		Thread.sleep(2000);
		act.dragAndDropBy(ele,-x/4, 0).perform();
		
	}

}
