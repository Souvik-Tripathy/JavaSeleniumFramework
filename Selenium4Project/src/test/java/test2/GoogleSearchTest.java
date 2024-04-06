package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		
		googleSearchTest();
		

	}
	
	public static void googleSearchTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//go to google.com
		driver.get("https://google.com");
		//enter text in searchbox
		//WebElement element = driver.findElement(By.name("q"));
		//element.sendKeys("selenium");
		GoogleSearchPage.textbox_search(driver).sendKeys("learning selenium");
		//click on search
		//element.sendKeys(Keys.RETURN);
		GoogleSearchPage.button_search(driver);
		//close browser 
		System.out.println("test completed---------");
		driver.quit();
		driver.close();
	}

}
