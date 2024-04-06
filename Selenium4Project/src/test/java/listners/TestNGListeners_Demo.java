package listners;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

//@Listeners(listners.TestNGListeners.class)
public class TestNGListeners_Demo {
	
	@Test
	public void test1() {
		System.out.println("in test1");
	}
	@Test
	public void test2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Geography");
		driver.findElement(By.xpath("//input[@name='abc']")).sendKeys("Geography");
		driver.close();
		driver.quit();
	}
	@Test
	public void test3() {
		System.out.println("in test3");
		throw new SkipException("skipping the test");
	}

}
