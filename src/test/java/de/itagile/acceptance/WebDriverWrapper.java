package de.itagile.acceptance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverWrapper {
	private WebDriver driver;

	public WebDriverWrapper() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
		System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
	}
	
	public WebDriver getDriver() {
		if(driver == null)
			driver = new ChromeDriver();
		// Implicit wait because of elements that might load asynchronously and might take some seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void quit() {
		if(driver != null)
			driver.quit();
		driver = null;
	}
}
