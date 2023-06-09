package com.weborder.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class WebOrderHook {
    WebDriver driver = DriverHelper.getDriver();

    @Before
    public void setup (){
        driver.get(ConfigReader.readProperty("weborder_url"));
    }

    @After
    public void teadDown (){
        driver.quit();
    }
}
