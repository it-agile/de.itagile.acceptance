package de.itagile.acceptance;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	private WebDriverWrapper driver;

	public Hooks(WebDriverWrapper driverWrapper) {
		this.driver = driverWrapper;
	}
	
	@Before
	public void beforeScenario(Scenario scenario) {
		Logger.getAnonymousLogger().log(Level.INFO, "Starting first step of scenario '"+scenario.getName()+"'...");
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
		    embedScreenshotIntoReport(scenario);
		}
		driver.quit();
		Logger.getAnonymousLogger().log(Level.INFO, "Last step of scenario '"+scenario.getName()+"' finished");
	}

	private void embedScreenshotIntoReport(Scenario scenario) {
		byte[] screenshot = ((TakesScreenshot) driver.getDriver()).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName() + "(" + scenario.getUri()+")");
	}
}
