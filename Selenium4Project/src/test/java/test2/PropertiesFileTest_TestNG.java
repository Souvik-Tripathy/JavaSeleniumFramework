package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class PropertiesFileTest_TestNG {
	
	WebDriver driver = null;
	public static String browsername = null;
	

	@BeforeTest
	public void setUpTest() {
		
		PropertiesFile.getProperties();
		
		String projectPath = System.getProperty("user.dir");
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		
		
	}
	
	@Test
	public void googleSearch() {
		
		//go to google.com
		driver.get("https://google.com");
		//enter text in searchbox
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("selenium");
		//click on search
		element.sendKeys(Keys.RETURN);
	}
	
	@AfterTest
	public void tearDownTest() {
		
		System.out.println("test completed---------");
		driver.close();
		driver.quit();
		
	}

}
