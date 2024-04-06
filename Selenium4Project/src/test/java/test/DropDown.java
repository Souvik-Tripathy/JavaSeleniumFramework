package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//		driver.get("https://trytestingthis.netlify.app/");
//		WebElement element = driver.findElement(By.id("option"));
//		Select selectobject = new Select(element);
//		selectobject.selectByIndex(1);
//		Thread.sleep(2000);
//		selectobject.selectByValue("option 2");
//		Thread.sleep(2000);
//		selectobject.selectByVisibleText("Option 3");
//		List<WebElement> elementt =selectobject.getOptions();
//		for(WebElement ele: elementt) {
//			System.out.println(ele.getText());
//			if(ele.getText().equalsIgnoreCase("Option 2")) {
//				ele.click();
//			}
//				
//		}
//		Thread.sleep(2000);
//		driver.quit();
		
		
		driver.get("https://trytestingthis.netlify.app/");
		WebElement element = driver.findElement(By.id("owc"));
		Select selectobject = new Select(element);
		selectobject.selectByIndex(1);
		Thread.sleep(2000);
		selectobject.selectByValue("option 2");
		Thread.sleep(2000);
		selectobject.selectByVisibleText("Option 3");
		selectobject.deselectByIndex(2);
		Thread.sleep(2000);
		driver.quit();

	}

}
