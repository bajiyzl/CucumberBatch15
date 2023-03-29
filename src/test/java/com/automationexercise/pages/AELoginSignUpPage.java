package com.automationexercise.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowsersUtils;

public class AELoginSignUpPage {
    public AELoginSignUpPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//h2[contains(text(),'New User Signup!')]")
    WebElement signUpHeader;

    public void validateSignUpHeader (String header){
        Assert.assertEquals(header, BrowsersUtils.getText(signUpHeader));
    }

    @FindBy (xpath = "//input[@name='name']")
    WebElement nameInput;

    @FindBy (xpath = "//form[@action='/signup'] //input[@name='email']")
    WebElement emailInput;

    public void enterNameAndPassword (String name, String email){
        nameInput.sendKeys(name);
        emailInput.sendKeys(email);
    }
    @FindBy (xpath = "//button[contains(text(),'Signup')]")
    WebElement signUpButton;

    public void clickSignUpButton (){
        signUpButton.click();
    }

    @FindBy (xpath = "//h2 //b[contains(text(),'Enter')]")
    WebElement enterAccountInfoHeader;

    public void validateEnterAccountinfoHeader (String header) throws InterruptedException {
        Assert.assertEquals(header, BrowsersUtils.getText(enterAccountInfoHeader));
        Thread.sleep(2000);
    }
    @FindBy (css = "#id_gender1")
    WebElement genderBox;
    @FindBy (css = "#name")
    WebElement nameBox;

    @FindBy (css = "#email")
    WebElement emailBox;

    @FindBy (css = "#password")
    WebElement passwordBox;

    @FindBy (xpath = "//select[@id='days']")
    WebElement daySelect;

    @FindBy (xpath = "//select[@id='months']")
    WebElement monthSelect;

    @FindBy (xpath = "//select[@id='years']")
    WebElement yearSelect;

    public void fillAccountInfo (String name,  String password, String day, String month, String year){
        genderBox.click();
        this.nameBox.clear();
    this.nameBox.sendKeys(name);
    this. passwordBox.sendKeys(password);
    BrowsersUtils.selectBy(daySelect, day, "text");
    BrowsersUtils.selectBy(monthSelect,month, "text");
    BrowsersUtils.selectBy(yearSelect, year, "text");
    }

    @FindBy (css = "#newsletter")
    WebElement newsLetterBox;

    public void clickNewsletterBox (){
        newsLetterBox.click();
    }

    @FindBy (xpath = "//input[@name='optin']")
    WebElement partnersBox;

    public void clickPartnersBox (){
        partnersBox.click();
    }

    @FindBy (css = "#first_name")
    WebElement firstNameInput;

    @FindBy (xpath = "//input[@name='last_name']")
    WebElement lastNameInput;

    @FindBy (xpath = "//input[@name='company']")
    WebElement companyInput;

    @FindBy (css = "#address1")
    WebElement addressOneInput;

    @FindBy (css= "#address2")
    WebElement addressTwoInput;

    @FindBy (xpath = "//select[@id='country']")
    WebElement countrySelect;

    @FindBy (css = "#state")
    WebElement stateInput;

    @FindBy (css = "#city")
    WebElement cityInput;

    @FindBy (xpath = "//input[@name='zipcode']")
    WebElement zipcodeInput;

    @FindBy (xpath = "//input[@id='mobile_number']")
    WebElement mobileNumberInput;

    public void fillAddressInfo (String firstName, String lastName, String company, String addressOne, String addressTwo, String country, String state, String city, String zipcode, String mobileNumber){
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        companyInput.sendKeys(company);
        addressOneInput.sendKeys(addressOne);
        addressTwoInput.sendKeys(addressTwo);
        BrowsersUtils.selectBy(countrySelect, country, "text");
        stateInput.sendKeys(state);
        cityInput.sendKeys(city);
        zipcodeInput.sendKeys(zipcode);
        mobileNumberInput.sendKeys(mobileNumber);
    }

    @FindBy (xpath = "//button[.='Create Account']")
    WebElement createAccountButton;

    public void clickCreateAccountButton (){
        createAccountButton.click();
    }

    @FindBy (xpath = "//h2[.='Account Created!']")
    WebElement accountCreatedHeader;

    public void validateAccountCreatedHeader (String header){
        Assert.assertEquals(header, BrowsersUtils.getText(accountCreatedHeader));
    }

    @FindBy (xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButton;

    public void clickContinueButton (){
        continueButton.click();
    }

    @FindBy (tagName = "h2")
    WebElement loginHeader;

    @FindBy (xpath = "//form[@action='/login']//input[@name='email']")
    WebElement loginEmailInput;

    @FindBy (xpath = "//input[@name='password']")
    WebElement loginPasswordInput;

    public void validateLoginHeader (String expectedHeader){
        Assert.assertEquals(expectedHeader, BrowsersUtils.getText(loginHeader));
    }

    public void enterLoginInfo (String email, String password){
        loginEmailInput.clear();
        loginEmailInput.sendKeys(email);
        loginPasswordInput.clear();
        loginPasswordInput.sendKeys(password);
    }

    @FindBy (xpath = "//button[.='Login']")
    WebElement loginButton;

    public void clickLoginButton (){
        loginButton.click();
    }

    @FindBy (xpath = "//p[contains(text(),'Your email or password is incorrect!')]")
    WebElement incorrectLoginInfo;

    public  void validateIncorrectLoginInfo (String expectedText){
        Assert.assertTrue(BrowsersUtils.getText(incorrectLoginInfo).contains(expectedText));
    }

    @FindBy (xpath = "//p[contains(text(),'Email Address already exist!')]")
    WebElement emailAlreadyTaken;

    public void validateEmailTakenMessage (String expectedMessage){
        Assert.assertEquals(expectedMessage, BrowsersUtils.getText(emailAlreadyTaken));
    }


}
