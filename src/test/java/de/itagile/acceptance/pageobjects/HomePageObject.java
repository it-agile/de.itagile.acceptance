package de.itagile.acceptance.pageobjects;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import org.openqa.selenium.WebDriver;

import de.itagile.acceptance.WebDriverWrapper;

public class HomePageObject {
	private WebDriver driver;

	public HomePageObject(WebDriverWrapper wrapper) {
		this.driver = wrapper.getDriver();
	}
	
	public HomePageObject navigateTo(String url) {
		driver.get(url);
		return this;
	}
	
	public HomePageObject checkTitleIncludes(String titlePart) {
		assertThat(driver.getTitle(), containsString(titlePart));
		return this;
	}
}
