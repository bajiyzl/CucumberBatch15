package com.etsy.stepdefinitions;

import com.etsy.pages.EtsyHomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class EtsySearchStepDef {
    WebDriver driver = DriverHelper.getDriver();
    EtsyHomePage etsyHomePage = new EtsyHomePage(driver);
    @When("user searches for {string} on Etsy Page")
    public void user_searches_for_on_etsy_page(String item) throws InterruptedException {
        etsyHomePage.searchData1(item);
    }
    @Then("user validates the title {string}")
    public void user_validates_the_title(String title) {
        Assert.assertEquals(driver.getTitle().trim(),title);
    }
}
