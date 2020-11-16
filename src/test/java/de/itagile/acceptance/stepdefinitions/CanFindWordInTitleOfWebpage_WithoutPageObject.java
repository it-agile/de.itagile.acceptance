package de.itagile.acceptance.stepdefinitions;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import org.openqa.selenium.WebDriver;

import de.itagile.acceptance.WebDriverWrapper;

/*
 * This is how you would implement a stepdef without using the PageObject pattern
 * 
 * This is NOT recommended!
 * 
 * Use the PageObject pattern instead. With this pattern your stepdefs do not import hamcrest or selenium stuff. So they are independent.
 * And also, you can reuse methods from the page object in other stepdefs and use the fluent api of the page objects. 
 * Your tests will become more readable and maintainable.
 */
public class CanFindWordInTitleOfWebpage_WithoutPageObject {
	
	private WebDriver driver;
	private String siteTitle;

	public CanFindWordInTitleOfWebpage_WithoutPageObject(WebDriverWrapper wrapper) {
		this.driver = wrapper.getDriver();
	}
	
	//@Given("I am surfing on {string}")
	public void i_am_surfing_on(String url) {
		driver.get(url);
	}

	//@When("^I look at the title$")
	public void look_at_the_title() {
		siteTitle = driver.getTitle();
	}

	//@Then("I can see {string} in the title")
	public void i_can_see_in_the_title(String titlePart) {
		assertThat(siteTitle, containsString(titlePart));
	}

}
