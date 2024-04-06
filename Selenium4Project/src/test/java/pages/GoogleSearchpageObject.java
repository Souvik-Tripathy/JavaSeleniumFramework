package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchpageObject {
	
	WebDriver driver = null;
	By username_search = By.id("user-name");
	By password_search = By.name("password");
	By click_login = By.id("login-button");
	
	public GoogleSearchpageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setTextForUsername(String text) {
		driver.findElement(username_search).sendKeys(text);
		
	}
	
	public void  setTextForPassword(String text) {
		driver.findElement(password_search).sendKeys(text);
	}
	
	public void clickOnLogin() {
		driver.findElement(click_login).sendKeys(Keys.RETURN);
	}

}
