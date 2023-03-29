package com.google.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowsersUtils;
import utils.ConfigReader;

import java.util.List;

public class GoogleMainPage {
    public GoogleMainPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//textarea[@name='q']")
    WebElement searchBox;

    public void validateHappySearch (String text){
        searchBox.sendKeys(text, Keys.ENTER);
    }
    @FindBy (xpath = "//a")
    List<WebElement> searchResultHeaders;

    public boolean validateSearchResults () {
        return (searchResultHeaders.size()>10);
    }
}
