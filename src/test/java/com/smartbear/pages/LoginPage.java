package com.smartbear.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy (css = "#ctl00_MainContent_username")
    WebElement usernameInput;

    @FindBy (xpath = "//input[@type='password']")
    WebElement passwordInput;

    @FindBy (css = ".button")
    WebElement signinButton;

    public void signIn (String username, String password){
        usernameInput.clear();
        usernameInput.sendKeys(username);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        signinButton.click();
    }
}
