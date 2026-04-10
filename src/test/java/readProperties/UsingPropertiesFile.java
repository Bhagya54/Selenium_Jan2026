package readProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingPropertiesFile {
	static FileInputStream fis;
	static WebDriver driver=null;
	public static void main(String[] args) throws IOException {
		fis = new FileInputStream("./src/test/resources/properties/config.properties");
		Properties config = new Properties();
		config.load(fis);
		
		
		
		if(config.getProperty("browser").equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(config.getProperty("browser").equals("firefox")) {
			driver=new FirefoxDriver();
		}
		
		else if(config.getProperty("browser").equals("edge")) {
			driver=new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.get(config.getProperty("siteurl"));
		
		fis=new FileInputStream("./src/test/resources/properties/or.properties");
		Properties or = new Properties();
		or.load(fis);
		
		driver.findElement(By.cssSelector(or.getProperty("email_CSS"))).sendKeys("testing@gmail.com");
		driver.findElement(By.xpath(or.getProperty("password_XPATH"))).sendKeys("ghsdghsa");
		driver.findElement(By.xpath(or.getProperty("login_XPATH"))).click();
		
		
		
	
		
	
	}

}
