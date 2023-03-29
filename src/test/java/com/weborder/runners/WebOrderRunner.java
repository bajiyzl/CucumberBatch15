package com.weborder.runners;
/*
These are interview Questions:

--> Runner class is a way to run your all feature files from here. Regression, smoke.. etc

1) @RunWith --> Annotation comes from Junit and it executes the feature file steps

2) @CucumberOptions --> It is a special annotation that have some keyword inside:

    **features --> this is the location of feature files (this one should be "Content Root")
    **glue --> This is the location of step definitions file (this one should be "Source Root")
    **dryRun --> This is a way to get snips without executing the whole steps from beginning
    **tags --> it is a way to specialize your scenario for the specific tag (regression,smoke) (filtration)
    ** plugin --> It is a way to integrate specific condition for the keyword. It is mostly used for report card

 */

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "src/test/resources/features/weborder", // Feature files
        glue = "com/weborder/stepdefinitions", //Step Definitions
        dryRun = false,
        tags = "@regression" ,//and refers to one scenario, or refers to multiple scenarios
        plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTests.txt"}
)

public class WebOrderRunner {
}
