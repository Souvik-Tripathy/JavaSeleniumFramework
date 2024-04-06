package test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchpageObject;

public class GoogleSearchPageTest {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		
		GoogleSearchTest2();
		
	}
	
	public static void GoogleSearchTest2() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		GoogleSearchpageObject searchPageObj = new GoogleSearchpageObject(driver);
		
		driver.get("https://www.saucedemo.com/");
		searchPageObj.setTextForUsername("locked_out_user");
		searchPageObj.setTextForPassword("secret_sauce");
		searchPageObj.clickOnLogin();
		System.out.println("all well-----");
		driver.quit();
		driver.close();
		
	}
	
	

}
