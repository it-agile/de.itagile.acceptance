package de.itagile.acceptance;

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
		return driver;
	}
	
	public void quit() {
		if(driver != null)
			driver.quit();
		driver = null;
	}
}
