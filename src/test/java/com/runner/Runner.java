package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
	
 @RunWith(Cucumber.class)
 @CucumberOptions(tags= "@sanity",
	plugin= {"json:target/cucumber-json-reports/","pretty",
		"html:target/cucumber-html-report"},features="src/test/resources/features", monochrome=false, glue="com.actions")
 	public class Runner {
}