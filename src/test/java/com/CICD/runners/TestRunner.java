package com.CICD.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json"
        },
     features = "src/test/resources/features",
     glue =     "com/CICD/stepDefinition",
     dryRun = false
)
public class TestRunner {
}
