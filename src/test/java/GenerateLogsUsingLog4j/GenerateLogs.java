package GenerateLogsUsingLog4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenerateLogs {
	static FileInputStream fis;
	static WebDriver driver=null;
	static Logger log=Logger.getLogger(GenerateLogs.class);
	static Properties config;
	static Properties or;
	
	public static void main(String[] args) throws IOException {
		
		PropertyConfigurator.configure("./src/test/resources/properties/log4j.properties");
		fis = new FileInputStream("./src/test/resources/properties/config.properties");
		config = new Properties();
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
		or = new Properties();
		or.load(fis);
		log.info("or properties file has been loaded");
		
		enterText("email_CSS","java@gmail.com");
		enterText("password_XPATH","bjasdbfdf");
		click("login_XPATH");
		
		
	}
	
	public static void enterText(String keyword,String value) {
		WebElement ele=null;
		try {
		if(keyword.endsWith("_XPATH")) {
			ele=driver.findElement(By.xpath(or.getProperty(keyword)));
		}
		else if(keyword.endsWith("_ID"))
		{
			ele=driver.findElement(By.id(or.getProperty(keyword)));
		}
		else if(keyword.endsWith("_CSS"))
		{
			ele=driver.findElement(By.cssSelector(or.getProperty(keyword)));
		}
		else if(keyword.endsWith("_NAME"))
		{
			ele=driver.findElement(By.name(or.getProperty(keyword)));
		}
		
		}
		catch(Exception e) {
			log.error("Unable to access the element: "+keyword+"---" + e.getMessage());
		}
		
		ele.sendKeys(value);
		log.info("Entered the text into: " +keyword +" field with value as " +value);
	}
	
	
	public static void click(String keyword) {
		WebElement ele=null;
		try {
		if(keyword.endsWith("_XPATH")) {
			ele=driver.findElement(By.xpath(or.getProperty(keyword)));
		}
		else if(keyword.endsWith("_ID"))
		{
			ele=driver.findElement(By.id(or.getProperty(keyword)));
		}
		else if(keyword.endsWith("_CSS"))
		{
			ele=driver.findElement(By.cssSelector(or.getProperty(keyword)));
		}
		else if(keyword.endsWith("_NAME"))
		{
			ele=driver.findElement(By.name(or.getProperty(keyword)));
		}
		
		}
		catch(Exception e) {
			log.error("Unable to access the element: " +keyword+"--"+ e.getMessage());
		}
		
		ele.click();
		log.info("Clicked on keyword: " +keyword + " field" );
	}
	

}
