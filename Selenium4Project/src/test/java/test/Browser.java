package test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
//		String originalwindow = driver.getWindowHandle();
//		driver.navigate().to("https://automationstepbystep.com/");
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.switchTo().window(originalwindow);
//		driver.manage().window().getSize().getHeight();
//		driver.manage().window().getSize().getWidth();
//		Dimension size = driver.manage().window().getSize();
//		System.out.println(size.getHeight());
//		System.out.println(size.getWidth());
//		driver.manage().window().setSize(new Dimension(600,800));
//		System.out.println(driver.manage().window().getPosition().getX());
//		System.out.println(driver.manage().window().getPosition().getY());
//		Point position = driver.manage().window().getPosition();
//		System.out.println(position.getX());
//		System.out.println(position.getY());
//		System.out.println(position.getClass());
//		driver.manage().window().setPosition(new Point (2,3));
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.manage().window().minimize();
//		Thread.sleep(2000);
//		driver.manage().window().fullscreen();
//		File srcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(srcFile, new File("./image1.png"));
		
//		WebElement element = driver.findElement(By.cssSelector(".lnXdpd"));
//		File srcFile1 =element.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(srcFile1, new File("./image2.png"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement button = driver.findElement(By.name("btnI"));
		js.executeScript("arguments[0].click()", button);
		js.executeScript("console.log('hello world')");
		
		Thread.sleep(2000);
		System.out.println("completed");
		driver.close();
		driver.quit();

	}

}
