package test2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyExtentReports_TestNG {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver;

	@BeforeSuite
	public void setUp() {

		// start reporters
		htmlReporter = new ExtentHtmlReporter("extent.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	
	@BeforeTest
	public void setUpTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	@Test
	public void test1() throws Exception {
		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");

	}
	
	@Test
	public void test2() throws Exception {
		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MySecondTest", "Sample description");
        
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
        
	}
	
	@Test
	public void googleSearch() {
		
		ExtentTest test = extent.createTest("MyGoogleSearchTest", "Sample description");
		//go to google.com
		driver.get("https://google.com");
		test.log(Status.INFO, "start of a testcase");
		test.pass("navigated to google.com");
		//enter text in searchbox
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("selenium");
		//click on search
		element.sendKeys(Keys.RETURN);
		test.pass("entered text and clicked enter");
	}
	
	
	@AfterTest
	public void tearDownTest() {
		
		ExtentTest test = extent.createTest("MyClosingBrowserTest", "Sample description");
		
		System.out.println("test completed---------");
		driver.close();
		driver.quit();
		test.pass("browser closed");
		test.info("test completed");
		
	}

	@AfterSuite
	public void tearDown() {
		
		extent.flush();


	}


}


