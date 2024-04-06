package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		//sendkeys()
//		driver.get("https://google.com");
//		driver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
//		Thread.sleep(3000);
//		driver.quit();
		
//		//draganddrop()
//		driver.get("https://trytestingthis.netlify.app/");
//		WebElement element1= driver.findElement(By.id("drag1"));
//		WebElement element2 = driver.findElement(By.id("div1"));
//		driver.manage().window().fullscreen();
//		Actions actions = new Actions(driver);
//		actions.dragAndDrop(element1, element2).perform();
//		Thread.sleep(4000);
//		driver.quit();
		
		//keydown()
//		driver.get("https://google.com");
//		driver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
//		Actions actions = new Actions(driver);
//		actions.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
//		Thread.sleep(3000);
//		driver.quit();
		
		//keyup()
		driver.get("https://google.com");
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.name("q"));
		actions.keyDown(Keys.SHIFT).sendKeys(element,"selenium").
		keyUp(Keys.SHIFT).sendKeys("selenium",Keys.ENTER).build().perform();
		Thread.sleep(3000);
		driver.quit();

	}

}
