package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement e1 = driver.findElement(By.xpath("//li[@name='D']"));
		WebElement e2 = driver.findElement(By.xpath("//li[@name='G']"));
		WebElement e3 = driver.findElement(By.xpath("//li[@name='I']"));
		Actions actions =new Actions(driver);
		actions.moveToElement(e1).clickAndHold().moveToElement(e2).release().build().perform();
		//rightclick()
		actions.contextClick(e3);
		actions.doubleClick(e3);
		Thread.sleep(3000);
		driver.quit();
		
//		//draganddrop()
//		driver.get("https://trytestingthis.netlify.app/");
//		WebElement element1= driver.findElement(By.id("drag1"));
//		WebElement element2 = driver.findElement(By.id("div1"));
//		driver.manage().window().fullscreen();
//		Actions actions = new Actions(driver);
//		actions.dragAndDrop(element1, element2).perform();
//		Thread.sleep(4000);
//		driver.quit();
		



	}

}
