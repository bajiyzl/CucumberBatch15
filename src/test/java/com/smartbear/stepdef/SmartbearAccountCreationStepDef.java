package com.smartbear.stepdef;

import com.smartbear.pages.LoginPage;
import com.smartbear.pages.MainPage;
import com.smartbear.pages.OrderPage;
import com.smartbear.pages.ViewOrderPage;
import io.cucumber.core.cli.Main;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class SmartbearAccountCreationStepDef {

    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    MainPage mainPage = new MainPage(driver);
    OrderPage orderPage = new OrderPage(driver);
    ViewOrderPage viewOrderPage = new ViewOrderPage(driver);

    @When("user sign in to smartbear website using username {string},  password {string} and click login button")
    public void user_sign_in_to_smartbear_website_using_username_password_and_click_login_button(String username, String password) {
        loginPage.signIn(username, password);
    }
    @When("user click on Order Section")
    public void user_click_on_order_section() {
      mainPage.orderSectionClick();
    }
    @When("user provides product information {string}, {string}")
    public void user_provides_product_information(String product, String quantity) {
        orderPage.productAndQuantitySelect(product, quantity);
    }
    @When("user provides address information {string}, {string}, {string}, {string}, {string}")
    public void user_provides_address_information(String customerName, String street, String city, String state, String zipcode) {
    orderPage.provideAddressInfo(customerName,street,city,state,zipcode);
    }
    @When("user provides payment information {string},{string}, {string}")
    public void user_provides_payment_information(String cardName, String cardNumber, String expireDate) {
        orderPage.providePaymentInfo(cardName, cardNumber, expireDate);
    }
    @When("user validated {string} and clicks on view all orders section")
    public void user_validated_and_clicks_on_view_all_orders_section(String text) {
    orderPage.validateStrongAndViewAll(text);
    }

    @Then("validates {string}, {string},{string}, {string},{string},{string}, {string}, {string}, {string}, {string},{string}, {string}")
    public void validates(String blank,String customerName, String productSelect, String quantity,String date ,String street, String city, String state, String zipcode, String card, String cardNumber, String expireDate) throws InterruptedException {
viewOrderPage.validateAllInfo(blank,customerName,productSelect,quantity,date,street,city,state,zipcode,card,cardNumber,expireDate);
    }
}
