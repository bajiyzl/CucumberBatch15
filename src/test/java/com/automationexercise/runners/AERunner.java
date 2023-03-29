package com.automationexercise.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/featu" +
                "res/automationexercise",
        glue = "com/automationexercise/stepdefinitions",
        dryRun = false,
        tags = "@regression",
        plugin = {"pretty", "html:target/uiReport.html", "rerun:tager/uiFailedTests.txt"}
)

public class AERunner {

}
