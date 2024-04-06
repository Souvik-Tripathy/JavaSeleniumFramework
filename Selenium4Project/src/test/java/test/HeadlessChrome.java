package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class HeadlessChrome {

	public static void main(String[] args) {
		test();
	

	}
	
	public static void test() {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("selenium"+Keys.RETURN);
		System.out.println("test completed---------");
		driver.quit();
		driver.close();
	}

}
