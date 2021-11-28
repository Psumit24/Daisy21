package cucumber.testrunner.utility;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "src/test/resources",
glue = {"com.cucumberhomepage.setdefination"},
tags ="@Regression",
dryRun = false
)

public class RunnerMavenTest extends 
AbstractTestNGCucumberTests {
}
