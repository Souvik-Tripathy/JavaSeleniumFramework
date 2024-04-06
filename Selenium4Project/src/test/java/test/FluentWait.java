package test;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		test();

	}
	
	public static void test() throws Exception {
//		String path = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver",path+ "\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("abcd"+ Keys.RETURN);
		//driver.findElement(By.linkText("What is ABCD?")).click();
		
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		Wait<WebDriver> fluentwait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30))
		       .pollingEvery(Duration.ofSeconds(2))
		       .ignoring(NoSuchElementException.class);

		   WebElement foo = fluentwait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		    	 
		    	 WebElement element1 = driver.findElement(By.linkText("EY International Tax and Transfer Pricing Survey — know the new A B C D of \r\n"
		    	 		+ "transfer pricing"));
		    	 
		    	 if(element1.isEnabled()) {
		    		 System.out.println("element found");
		    	 }
		    	 return element1;
		     }
		   });
		   foo.click();
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
