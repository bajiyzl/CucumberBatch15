package com.weborder.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowsersUtils;

public class WebOrderFoodOrder {
    public  WebOrderFoodOrder (WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy (css = "#Email")
    WebElement emailBox;

    @FindBy (id = "Password")
    WebElement passwordBox;

    @FindBy (xpath = "//button[@type='submit']")
    WebElement signinButton;

    public void webOrderLogin (String username, String password){
        emailBox.clear();
        emailBox.sendKeys(username);
        passwordBox.clear();
        passwordBox.sendKeys(password);
        signinButton.click();
    }

    @FindBy (xpath = "//label[@for='GroupOrder']")
    WebElement groupOrderBox;

    @FindBy (xpath = "//button[.='Next']")
    WebElement nextButton;

    public void groupOrderCheckAndNextButtonClick () throws InterruptedException {
        Thread.sleep(2000);
        groupOrderBox.click();
        nextButton.click();
    }

    @FindBy (css = "#InviteNote")
    WebElement inviteNoteBox;

    public void inviteeNoteTextInput(String text){
        inviteNoteBox.sendKeys(text);
    }

    @FindBy (name = "InviteList")
    WebElement inviteListBox;

    public void setInviteListBox (String email1, String comma ,String email2){
        inviteListBox.sendKeys(email1,comma,email2);
    }

    @FindBy (css = "#ConfirmAddressID")
    WebElement addressSelect;

    @FindBy (xpath = "//div[@id='addressPreview']")
    WebElement addressInfo;

    public void validationOfAdress (String option, String address){
        BrowsersUtils.selectBy(addressSelect, option.trim(), "text");
        Assert.assertTrue(BrowsersUtils.getText(addressInfo).contains(address));
    }

    @FindBy (xpath = "//button[contains(text(),'Group Order')]")
    WebElement groupOrderClickButton;

    public void setGroupOrderClickButton () throws InterruptedException {
        Thread.sleep(2000);
        groupOrderClickButton.click();
    }
    @FindBy (xpath = "//p[contains(text(),'Your group order is now pending')]")
    WebElement descriptionElement;

    public void validateDescription (String description){
        Assert.assertTrue(BrowsersUtils.getText(descriptionElement).contains(description));
    }

}
