package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;import freemarker.core.ReturnInstruction.Return;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyExtentReports {

	private static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("Google Search Test", "To validate Google Search");
        test.log(Status.INFO, "start of a testcase");
        
        WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://google.com");
		test.pass("navigated to google.com");
		
		WebElement element= driver.findElement(By.name("q"));
		element.sendKeys("souvik"+ Keys.RETURN);
		test.pass("entered text and clicked enter");
		
		driver.close();
		driver.quit();
		test.pass("closed browser");
		
		test.info("test completed");
		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test", "To validate Google Search");
        test1.log(Status.INFO, "start of a testcase");
        
        WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://google.com");
		test1.pass("navigated to google.com");
		
		WebElement element1= driver.findElement(By.name("q"));
		element1.sendKeys("souvik"+ Keys.RETURN);
		test1.fail("wrongly entered text and clicked enter");
		
		driver.close();
		driver.quit();
		test1.pass("closed browser");
		
		test1.info("test completed");
		extent.flush();
        

	}

}
