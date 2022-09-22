package com.flipkart.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\karthickdurai\\eclipse-workspace\\Cucumber-Task\\src\\test\\resources\\Features\\RedmiPurchase.feature",
					glue = "com.flipkart.stepdefinition",
					monochrome = true,
					plugin = "html:target",
					dryRun = false,
					tags = "@tag1")
public class TestRunner {

}
