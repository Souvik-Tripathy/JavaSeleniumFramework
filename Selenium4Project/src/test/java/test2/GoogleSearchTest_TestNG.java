package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class GoogleSearchTest_TestNG {
	
	WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
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
