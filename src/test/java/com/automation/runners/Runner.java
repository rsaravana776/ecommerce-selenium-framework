package com.automation.runners;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import com.automation.listeners.listener;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

			features="src/test/resources/features",

			glue="com.automation.stepdefinitions",

plugin={ "pretty","html:target/cucumber-report.html",
                  "json:target/cucumber.json",
                   "rerun:target/failed.txt"},

monochrome=true, publish=false, tags="@smoke")

@Listeners(listener.class)

public class Runner extends AbstractTestNGCucumberTests{
	
	@DataProvider(parallel=true)
	
	@Override
	
	public Object[][] scenarios(){
		return super.scenarios(); //Use Cucumber scenarios//
	}

}