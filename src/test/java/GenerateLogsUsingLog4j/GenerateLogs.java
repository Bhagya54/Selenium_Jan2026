package GenerateLogsUsingLog4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenerateLogs {
	static FileInputStream fis;
	static WebDriver driver=null;
	static Logger log=Logger.getLogger(GenerateLogs.class);
	
	public static void main(String[] args) throws IOException {
		
		PropertyConfigurator.configure("./src/test/resources/properties/log4j.properties");
		fis = new FileInputStream("./src/test/resources/properties/config.properties");
		Properties config = new Properties();
		config.load(fis);
		log.info("config properties file has been loaded");
		
		
		
		if(config.getProperty("browser").equals("chrome")) {
			driver=new ChromeDriver();
			log.info("Chrome browser has been launched");
		}
		else if(config.getProperty("browser").equals("firefox")) {
			driver=new FirefoxDriver();
			log.info("Firefox browser has been launched");
		}
		
		else if(config.getProperty("browser").equals("edge")) {
			driver=new EdgeDriver();
			log.info("Edge browser has been launched");
		}

		driver.manage().window().maximize();
		driver.get(config.getProperty("siteurl"));
		log.info("url is launched: " + driver.getCurrentUrl());
		
		fis=new FileInputStream("./src/test/resources/properties/or.properties");
		Properties or = new Properties();
		or.load(fis);
		log.info("or properties file has been loaded");
		try {
		driver.findElement(By.cssSelector(or.getProperty("email_CSS"))).sendKeys("testing@gmail.com");
		log.info("Entered the text into email field: " + or.getProperty("email_CSS") + "value as: testing@gmail.com");
		}
		catch(Exception e) {
			log.error("Unable to enter text into email field" + e.getMessage());
			
		}
		
		try {
		driver.findElement(By.xpath(or.getProperty("password_XPATH"))).sendKeys("ghsdghsa");
		log.info("Entered the text into password field: " + or.getProperty("password_XPATH") + "value as: ghsdghsa");
		}
		catch(Exception e) {
			log.error("Unable to enter text into password field" + e.getMessage());
			
		}
		try {
		driver.findElement(By.xpath(or.getProperty("login_XPATH"))).click();
		log.info("Clicked on login: " + or.getProperty("login_XPATH"));
		}
		catch(Exception e) {
			log.error("Unable to click on login button" + e.getMessage());
			
		}
		
		
	
		
	
	}

}
