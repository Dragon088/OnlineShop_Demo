package com.onlineshop.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//src//test//resources//Feature_Files", glue = { "com.onlineshop.stepDefinition" },

		plugin = { "pretty", "html: cucumber-html-reports", "json: cucumber-html-reports/cucumber.json" },

		tags = { "@Demo" }, monochrome = true, strict = true, dryRun = false)

public class Test_Runner {
	// extends AbstractTestNGCucumberTests
	

}
