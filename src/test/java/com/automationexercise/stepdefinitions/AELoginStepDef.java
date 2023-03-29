package com.automationexercise.stepdefinitions;

import com.automationexercise.pages.AEHomePage;
import com.automationexercise.pages.AELoginSignUpPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class AELoginStepDef {
    WebDriver driver = DriverHelper.getDriver();
    AEHomePage aeHomePage = new AEHomePage(driver);
    AELoginSignUpPage aeLoginSignUpPage = new AELoginSignUpPage(driver);

    @When("user verifies {string} login to your account is visible")
    public void user_verifies_login_to_your_account_is_visible(String expectedHeader) {
        aeLoginSignUpPage.validateLoginHeader(expectedHeader);
    }
    @When("user enters correct {string} and {string} to signin input")
    public void user_enters_and_to_signin_input(String email, String password) {
      aeLoginSignUpPage.enterLoginInfo(email,password);
    }
    @When("user clicks on SignIn Button")
    public void user_clicks_on_sign_in_button() {
        aeLoginSignUpPage.clickLoginButton();
    }
    @When("user enters incorrect {string} and {string} to signin input")
    public void user_enters_incorrect_and_to_signin_input(String email, String password) {
       aeLoginSignUpPage.enterLoginInfo(email, password);
    }

    @Then("user verifies incorrect email and password error {string} is visible")
    public void user_verifies_incorrect_email_and_password_error_is_visible(String expectedText) {
        aeLoginSignUpPage.validateIncorrectLoginInfo(expectedText);
    }

    @Then("user verifies email already exist message {string} is visible")
    public void user_verifies_email_already_exist_message_is_visible(String expectedMessage) {
        aeLoginSignUpPage.validateEmailTakenMessage(expectedMessage);
    }
}
