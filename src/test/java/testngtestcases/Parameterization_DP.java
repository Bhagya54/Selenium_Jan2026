package testngtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelReader;

public class Parameterization_DP {

	public WebDriver driver=null;
	
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
	}
	
	@Test(dataProvider = "dp")
	public void doLogin(String username,String password) {
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	@DataProvider(name="dp")
	public Object[][] getData(){
		ExcelReader excel = new ExcelReader("./src/test/resources/data/testData.xlsx");
		String sheetName="Login";
		int rowCount=excel.getRowCount(sheetName);//4
		int colCount=excel.getColumnCount(sheetName);
		System.out.println(rowCount + "  " + colCount );//4 2
		Object[][] data = new Object[rowCount-1][colCount];
		
		for(int row=2;row<=rowCount;row++) {//row=4
			for(int col=0;col<colCount;col++) {//col=1<2
				data[row-2][col]=excel.getCellData(sheetName,col,row);
			}
		}
		/*
		 * data[0][0]=excel.getCellData(sheetName,0,2);//username1
		 * data[0][1]=excel.getCellData(sheetName,1,2);//password1
		 * 
		 * data[1][0]=excel.getCellData(sheetName,0,3);
		 * data[1][1]=excel.getCellData(sheetName,1,3);
		 * 
		 * data[2][0]=excel.getCellData(sheetName,0,4);
		 * data[2][1]=excel.getCellData(sheetName,1,4);
		 */
		
		
		
		
		return data;
	}
}
