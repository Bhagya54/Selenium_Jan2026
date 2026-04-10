package captureScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {
	static WebDriver driver=null;
	
	
	public static void takeTheScreenshot() throws IOException {
		Date d = new Date();
		String fileName=d.toString().replace(" ","_").replace(":","_")+".png";
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./src/test/resources/screenshots/"+fileName));
	}
	
	public static void takeElementScreenshot(WebElement ele) throws IOException {
		Date d = new Date();
		String fileName="ele_"+d.toString().replace(" ","_").replace(":","_")+".png";
		File src=ele.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./src/test/resources/screenshots/"+fileName));
	}

	public static void main(String[] args) throws IOException {
		driver = new ChromeDriver();
		driver.get("https://google.com");
		takeTheScreenshot();
		WebElement searchEle = driver.findElement(By.name("q"));
		takeElementScreenshot(searchEle);
	
		
		driver.get("https://facebook.com");
		takeTheScreenshot();
		
	
	
	}

}
