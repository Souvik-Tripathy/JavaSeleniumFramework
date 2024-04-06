package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		//JS Alert
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert alert = driver.switchTo().alert();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@onclick='jsAlert()']"))).click();
		System.out.println(alert.getText());
		alert.accept();
		if(driver.getPageSource().contains("You successfully clicked an alert"));{
		System.out.println("You successfully clicked annnn alert");}
		Thread.sleep(2000);
		
		//JS Confirm
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.dismiss();
		if(driver.getPageSource().contains("You clicked: Cancel"));{
		System.out.println("You clickedddd: Cancel");}
		Thread.sleep(2000);
		
		//JS Prompt
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alert2 = driver.switchTo().alert();
		String prompt = alert2.getText();
		System.out.println(prompt);
		alert2.sendKeys("The Boss");
//		alert2.accept();
		alert2.dismiss();
		if(driver.getPageSource().contains("You entered: Null"));{
			System.out.println("You entered: Nothing");}
//		if(driver.getPageSource().contains("You entered: The Boss"));{
//		System.out.println("You entered: The Text");}
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
		

	}

}
