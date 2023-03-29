package com.weborder.stepdefinitions;

import com.weborder.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class LoginScenarioOutlineStepDef {

    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @When("User provides {string} and {string} for WebOrder Login Page")
    public void user_provides_and_for_web_order_login_page(String username, String password) {
    loginPage.provideUsernameAndPassword(username, password);
    }

    @When("User clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
    loginPage.clickSignInButton();
    }
    @Then("user validates the header {string}")
    public void user_validates_the_header(String header) {
    loginPage.validateHeader(header);
    }
}
