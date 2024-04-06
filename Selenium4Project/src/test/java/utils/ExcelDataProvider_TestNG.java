package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider_TestNG {
	
	WebDriver driver = null;
	@BeforeTest
	public void setUpTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test(dataProvider = "testData")
	public void test1(String username, String password) throws Exception {
		System.out.println(username+" | "+password);
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		
	}
	
	@AfterTest
	public void tearDownTest() {
		
		System.out.println("test completed---------");
		driver.close();
		driver.quit();
		
	}
	
	
	@DataProvider(name = "testData")
	public Object[][] getData() {
		
		String path = System.getProperty("user.dir");
		Object data[][] = testData(path+"/excel/data2.xlsx", "Sheet1");
		return data;
	}
	
	public static Object[][] testData(String excelPath, String sheetName) {
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		Object data[][] = new Object[rowCount-1][colCount];
		
		for(int i=1; i<rowCount; i++) {
			for(int j=0; j<colCount; j++) {
				String cellData = excel.getCellDataString(i, j);
				//System.out.print(cellData+" | ");
				data[i-1][j] = cellData;
			}
			System.out.println();
		}
		return data;
		
	}

}
