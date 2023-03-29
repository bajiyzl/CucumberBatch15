package com.etsy.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyHomePage {
    public EtsyHomePage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//input[@id='global-enhancements-search-query']")
    WebElement searchBox;

    public void searchData1 (String item) throws InterruptedException {
        Thread.sleep(2000);
        this.searchBox.sendKeys(item, Keys.ENTER);
    }
}
