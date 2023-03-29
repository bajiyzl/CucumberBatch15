package com.smartbear.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

import java.sql.Driver;

public class HookClass {

    WebDriver driver = DriverHelper.getDriver();

    @Before
    public void setup (){
        driver.get(ConfigReader.readProperty("smartbearsoftware_url"));

    }

    @After
    public void tearDown (){
    driver.quit();
    }
}
