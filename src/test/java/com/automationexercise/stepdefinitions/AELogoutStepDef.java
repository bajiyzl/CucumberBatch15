package com.automationexercise.stepdefinitions;

import com.automationexercise.pages.AEHomePage;
import com.automationexercise.pages.AELoginSignUpPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class AELogoutStepDef {
    WebDriver driver = DriverHelper.getDriver();
    AEHomePage aeHomePage = new AEHomePage(driver);
    AELoginSignUpPage aeLoginSignUpPage = new AELoginSignUpPage(driver);

    @When("user clicks on Sign Out button")
    public void user_clicks_on_sign_out_button() {
      aeHomePage.logOut();
    }
    @Then("user validates that he navigated to login page and validates login url {string}")
    public void user_validates_that_he_navigated_to_login_page_and_validates_login_url(String loginUrl) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(loginUrl, driver.getCurrentUrl().trim());
    }
}
