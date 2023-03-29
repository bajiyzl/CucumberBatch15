package com.google.stepdefinitions;

import com.google.pages.GoogleMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.ConfigReader;
import utils.DriverHelper;

import java.sql.DriverManager;

public class SearchStepDef {

    WebDriver driver = DriverHelper.getDriver();
    GoogleMainPage googleMainPage = new GoogleMainPage(driver);

    @Given("User navigate to the Google")
    public void user_navigate_to_the_google() {
        driver.get(ConfigReader.readProperty("google_url"));
    }

    @When("User searches for Codefish")
    public void user_searches_for_Codefish (){
        googleMainPage.validateHappySearch(ConfigReader.readProperty("google_searchData"));
    }

    @Then("User gets more than ten links on the first page")
    public void user_gets_more_than_ten_links_on_the_first_page() {
        Assert.assertTrue(googleMainPage.validateSearchResults());
    }
}
