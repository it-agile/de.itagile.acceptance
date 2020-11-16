package de.itagile.acceptance;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "not @ignore",
		plugin = "html:build/reports/cucumber/cucumber-html-report.html"
)
public class RunAllFeatures {
}
