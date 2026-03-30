package gestures;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gestures_DragAndDropBy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement sourceEle=driver.findElement(By.id("draggable"));
		WebElement destEle=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(sourceEle, destEle).perform();
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		if(ele.getText().equals("Dropped!")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		
	}

}
