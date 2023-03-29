package com.automationexercise.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowsersUtils;

public class AEHomePage {
    public AEHomePage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//a[contains(text(),' Signup / Login')]")
    WebElement signupLoginButton;

    public void clickSignupLoginButton (){
        signupLoginButton.click();

    }
    @FindBy (xpath = "//h2[contains(text(),'New User Signup!')]")
    WebElement newUserSignUpHeader;

    public void setNewUserSignUpHeader (String header){
        Assert.assertEquals(BrowsersUtils.getText(newUserSignUpHeader), header);
    }
    @FindBy (xpath = "//a[contains(text(),'Logged in')]")
    WebElement loggedInAsHeader;

    public void validateLoggedInAsHeader (String header){
        Assert.assertTrue(BrowsersUtils.getText(loggedInAsHeader).contains(header));
    }

    @FindBy (xpath = "//a[contains(text(),'Delete')]")
    WebElement deleteAccountSection;

    public void clickDeleteAccount (){
        deleteAccountSection.click();
    }

    @FindBy (xpath = "//h2[.='Account Deleted!']")
    WebElement accountDeletedHeader;

    public void validateAccountDeleted (String header){
        Assert.assertEquals(header,BrowsersUtils.getText(accountDeletedHeader));
    }

    @FindBy (xpath = "//a[contains(text(),'Logout')]")
    WebElement logOutButton;

    public void logOut (){
        logOutButton.click();
    }
}


