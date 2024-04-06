package test;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
//		WebElement element= driver.findElement(By.name("q"));
//		element.sendKeys("Automation",Keys.ENTER);
//		element.sendKeys(Keys.RETURN);
//		driver.get("https://trytestingthis.netlify.app/");
//		List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
//		for(WebElement element : options) {
//			System.out.println(element.getText());
//		}
//		driver.findElement(By.cssSelector("#fname")).sendKeys("Souvik");
//		driver.findElement(By.cssSelector("#lname")).sendKeys("Tripathy");
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		WebElement element = driver.findElement(By.name("password"));
		element.sendKeys("secret_sauce");
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(element)).click();
		Thread.sleep(4000);
		driver.close();
		driver.quit();

	}

}
