package test;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// polling frequency is 500 ms by default for implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://google.com");
		driver.get("https://automationstepbystep.com/");
//		driver.findElement(By.name("q")).sendKeys("automation step by step", Keys.ENTER);
		
		// polling frequency is 500 ms by default for explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Selenium Quiz"))).click();
		System.out.println("hellooooo...");
		
		// we can set polling frequency in fluent alert
		//polling frequency is 250 ms by default for fluent wait
		Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
		fluentwait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		
		Wait<WebDriver> fluentwait1 = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(5))
			       .ignoring(NoSuchElementException.class);

			   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.id("foo"));
			     }
			   });
		Thread.sleep(2000);
		driver.close();
		driver.quit();

	}

}
