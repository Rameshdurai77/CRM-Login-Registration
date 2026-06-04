package com.crm.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features =  ".\\src\\test\\resources\\Feature",
		glue = {"com.crm.stepdefinition", "com.crm.hooks"},
		dryRun =  false,
		monochrome =  true,
		tags = "@CRM_Registration",
		plugin = {"html:target/index.html", "json:target/report.json"}
		)
public class TestRunner {

}
