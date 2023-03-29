package com.smartbear.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/smartbear",
        glue = "com/smartbear/stepdef",
        dryRun = false,
        tags = "@scenarioOutline",
        plugin = {"pretty", "html:target/uiReport.html", "rerun:tager/uiFailedTests.txt"}
)

public class SmartBearRunner {
}
