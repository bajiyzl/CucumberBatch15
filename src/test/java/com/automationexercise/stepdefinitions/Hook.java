package com.automationexercise.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class Hook {

    WebDriver driver = DriverHelper.getDriver();

    @Before
    public void setup (){
        driver.get(ConfigReader.readProperty("automationExercise_url"));
    }
    @After
    public void tearDown (){

        driver.quit();
    }
}
