package com.weborder.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowsersUtils;

public class LoginPage {
    public LoginPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy (css = "#Email")
    WebElement emailBar;

    @FindBy (name = "Password")
    WebElement passwordBar;

    public void provideUsernameAndPassword (String username, String password){
        emailBar.clear();
        emailBar.sendKeys(username);
        passwordBar.clear();
        passwordBar.sendKeys(password);
    }

    @FindBy (xpath = "//button[contains(text(),'Sign')]")
    WebElement signInButton;

    public void clickSignInButton (){
        signInButton.click();
    }

    @FindBy (xpath = "//div[contains(text(),'Sign in Failed')]")
    WebElement headerElement;

    public void validateHeader (String header){
        Assert.assertEquals(BrowsersUtils.getText(headerElement), header);
    }
}
