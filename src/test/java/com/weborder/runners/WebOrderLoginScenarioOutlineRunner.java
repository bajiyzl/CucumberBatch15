package com.weborder.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/weborder",
        glue = "com/weborder/stepdefinitions",
        dryRun = false,
        tags = "@negativeTesting and  @smoke1",
        plugin = {"pretty", "html:target/uiReport.html", "rerun:tager/uiFailedTests.txt"}

)
public class WebOrderLoginScenarioOutlineRunner {
}
