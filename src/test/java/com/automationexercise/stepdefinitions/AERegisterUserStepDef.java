package com.automationexercise.stepdefinitions;

import com.automationexercise.pages.AEHomePage;
import com.automationexercise.pages.AELoginSignUpPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import utils.DriverHelper;

import java.sql.Driver;

public class AERegisterUserStepDef {

    WebDriver driver = DriverHelper.getDriver();
    AEHomePage aeHomePage = new AEHomePage(driver);
    AELoginSignUpPage aeLoginSignUpPage = new AELoginSignUpPage(driver);

    @When("Verify the homepage is {string}")
    public void verify_the_homepage_is(String url) {
        Assert.assertEquals(driver.getCurrentUrl().trim(), url);
    }

    @When("user clicks on SignupLogin button")
    public void user_clicks_on_signup_login_button() {
       aeHomePage.clickSignupLoginButton();
    }
    @When("user verifies {string} new user sign up is visible")
    public void user_verifies_new_user_sign_up_is_visible(String header) {
        aeHomePage.setNewUserSignUpHeader(header);
    }
    @When("user enters {string} and {string} to signup input")
    public void user_enters_and(String name, String email) {
        aeLoginSignUpPage.enterNameAndPassword(name, email);
    }
    @When("user clicks Signup Button")
    public void user_clicks_signup_button() {
        aeLoginSignUpPage.clickSignUpButton();
    }

    @When("user verifies that {string} enter account information is visible")
    public void user_verifies_that_enter_account_information_is_visible(String header) throws InterruptedException {
        aeLoginSignUpPage.validateEnterAccountinfoHeader(header);
    }
    @When("user fills the details: title, {string}, email, {string}, {string}, {string} and {string}")
    public void user_fills_the_details_title_month_and_year(String name, String password, String day, String month, String year) {
        aeLoginSignUpPage.fillAccountInfo(name, password, day, month, year);
    }
    @When("user selects checkbox Sign up for our newsletter!")
    public void user_selects_checkbox() {
        aeLoginSignUpPage.clickNewsletterBox();
    }

    @When("user selects checkbox Receive special offers from our partners!")
    public void user_selects_checkbox_Receive_special_offers_from_our_partners(){
        aeLoginSignUpPage.clickPartnersBox();
    }
    @When("user fills details: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_fills_details(String firstName, String lastName, String company, String address, String address2, String country, String state, String city, String zipcode, String mobileNumber) {
    aeLoginSignUpPage.fillAddressInfo(firstName,lastName,company,address,address2, country, state, city, zipcode, mobileNumber);
    }

    @When("user clicks Create Account button")
    public void user_clicks_create_account_button() {
    aeLoginSignUpPage.clickCreateAccountButton();
    }
    @When("user verifies that {string} account created is visible")
    public void user_verifies_that_account_created_is_visible(String header) {
        aeLoginSignUpPage.validateAccountCreatedHeader(header);
    }

    @When("user clicks Continue button")
    public void user_clicks_continue_button() {
        aeLoginSignUpPage.clickContinueButton();
    }
    @When("user verifies that {string} logged in as username is visible")
    public void user_verifies_that_logged_in_as_username_is_visible(String header) {
        aeHomePage.validateLoggedInAsHeader(header);
    }
    @When("user clicks Delete Account button")
    public void user_clicks_delete_account_button() {
       aeHomePage.clickDeleteAccount();
    }
    @Then("user verifies that {string} is visible and click Continue button")
    public void user_verifies_that_is_visible_and_click_continue_button(String header) {
        aeHomePage.validateAccountDeleted(header);
    }

}
