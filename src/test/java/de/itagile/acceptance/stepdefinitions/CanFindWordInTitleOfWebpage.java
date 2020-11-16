package de.itagile.acceptance.stepdefinitions;

import de.itagile.acceptance.pageobjects.HomePageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CanFindWordInTitleOfWebpage {
	
	private HomePageObject homePage;

	public CanFindWordInTitleOfWebpage(HomePageObject homePage) {
		this.homePage = homePage;
	}
	
	@Given("I am surfing on {string}")
	public void i_am_surfing_on(String url) {
		homePage.navigateTo(url);
	}

	@When("^I look at the title$")
	public void look_at_the_title() {
		// in this example, there is no need to hold the title in this stepdef as a field to use it in @Then, because it is better 
		// to just provide and use a whole assert method from the page object (in this case "checkTitleIncludes").
	}

	@Then("I can see {string} in the title")
	public void i_can_see_in_the_title(String titlePart) {
		homePage.checkTitleIncludes(titlePart);
	}

}
