package com.etsy.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class etsyHook {
    WebDriver driver = DriverHelper.getDriver();

    @Before
    public void setup (){
        driver.get(ConfigReader.readProperty("etsy_url"));
    }

    @After
    public void tearDown (){
        driver.quit();
    }
}
