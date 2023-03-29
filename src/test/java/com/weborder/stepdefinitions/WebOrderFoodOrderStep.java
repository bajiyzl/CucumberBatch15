package com.weborder.stepdefinitions;

import com.weborder.pages.WebOrderFoodOrder;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class WebOrderFoodOrderStep {

    WebDriver driver = DriverHelper.getDriver();
    WebOrderFoodOrder webOrderFoodOrder = new WebOrderFoodOrder(driver);

    @Given("User provides {string} and {string} for WebOrder")
    public void user_provides_and_for_web_order(String email, String password) {
       webOrderFoodOrder.webOrderLogin(email, password);
    }
    @When("User validates the {string} from homepage")
    public void user_validates_the_from_homepage(String title) {
        Assert.assertEquals(title, driver.getTitle().trim());
    }
    @When("User clicks Group Order Box and Next Button")
    public void user_clicks_group_order_box_and_next_button() throws InterruptedException {
        webOrderFoodOrder.groupOrderCheckAndNextButtonClick();
    }

    @When("User sends the word {string} for note to the invitees section")
    public void user_sends_the_word_for_note_to_the_invitees_section(String text) {
    webOrderFoodOrder.inviteeNoteTextInput(text);
    }
    @When("User sends e-mail address which are {string} {string} and {string} to the Invite List")
    public void user_sends_e_mail_address_which_are_and_to_the_invite_list(String email1, String comma,  String email2) {
       webOrderFoodOrder.setInviteListBox(email1,comma,email2);
    }
    @When("User chooses the delivery address {string} and validates the address {string}")
    public void user_chooses_the_delivery_address_and_validates_the_address(String option, String address) {
        webOrderFoodOrder.validationOfAdress(option,address);
    }
    @When("User clicks the create Group Order Button")
    public void user_clicks_the_create_group_order_button() throws InterruptedException {
        webOrderFoodOrder.setGroupOrderClickButton();
    }
    @Then("User validates the header of page {string}")
    public void user_validates_the_header_of_page(String header) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(driver.getTitle().trim().contains(header));
    }

    @Then("User validates the word {string} from description")
    public void user_validates_the_word_from_description(String description) {
        webOrderFoodOrder.validateDescription(description);
    }
}
