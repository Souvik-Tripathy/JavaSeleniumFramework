package test;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoading {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
// waits for entire page to be loaded
// by default normal is set to browser if none provided
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//waits until initial HTML doc has been completely loaded
//discards loading stylesheets,images,subframes(waits until DOMContentLoaded event fire is loaded)
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
//waits until until the initial page to get loaded		
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.close();
		driver.quit();

	}

}
