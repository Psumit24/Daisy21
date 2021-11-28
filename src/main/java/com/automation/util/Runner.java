package com.automation.util;
/*This Runner class used for tags Scenario to run through testng using 
 * public class Runner extends AbstractTestNGCucumberTests
 * */
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//path of feature file and path of step definition file
@CucumberOptions(features = "src/test/resources",
glue = {"com.cucumberhomepage.setdefination"},
tags="@Regression",
dryRun=false
)

/*
 * dryRun=true used to check check set definations are created or implemented.
 */
public class Runner extends AbstractTestNGCucumberTests {

}
