package test;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://google.com");
//		WebElement searchBox = driver.findElement(By.name("q"));
//		searchBox.sendKeys("selenium", Keys.ENTER);
//		
//		driver.get("https://trytestingthis.netlify.app/");
//		List<WebElement> elements =driver.findElements(By.tagName("select"));
//		for(WebElement element: elements) {
//			System.out.println(element.getText());
//		}
		// find element within elements
//		driver.get("https://trytestingthis.netlify.app/");
//		WebElement elements1 =driver.findElement(By.name("Optionwithcheck[]")).
//				findElement(By.xpath("//option[@value='option 2']"));
//		elements1.click();
//		Thread.sleep(4000);
//        System.out.println(driver.findElement(By.id("owc")).getText());
		
//		// get active element
//		driver.get("https://google.com/");
//		driver.findElement(By.name("q")).sendKeys("ADCD");
//        System.out.println(driver.switchTo().activeElement().getAttribute("title"));
		
		//get tagname, text, css
//		driver.get("https://google.com");
//		WebElement searchBox = driver.findElement(By.name("q"));
//		searchBox.sendKeys("Bossy");
//		System.out.println("---"+searchBox.getTagName());
//		System.out.println("----"+searchBox.getText());
//		System.out.println("-----"+searchBox.getCssValue("color"));
		
		// check element is enebled, selected
		
		driver.get("https://trytestingthis.netlify.app/");
		WebElement element = driver.findElement(By.id("moption")).findElement(By.xpath("//input[@name='option2']"));
        System.out.println(element.isSelected());
        System.out.println(element.isEnabled());
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement element1= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        System.out.println(element1.isEnabled());		
        System.out.println(element1.isSelected());			
		Thread.sleep(4000);
		driver.quit();

	}

}
