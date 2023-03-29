package com.smartbear.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowsersUtils;

import java.util.Arrays;
import java.util.List;

public class ViewOrderPage {
    public ViewOrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//tr[2] //td")
    List<WebElement> actualAllInfo;

    public void validateAllInfo (String blank, String customerName, String productSelect, String quantity, String date, String street, String city, String state, String zipcode, String card, String cardNumber, String expireDate) throws InterruptedException {
        List <String> expectedAllInfo = Arrays.asList(blank,customerName,productSelect,quantity,date,street,city,state,zipcode,card,cardNumber, expireDate);
        Thread.sleep(2000);
        for (int i = 1; i < actualAllInfo.size()-1; i++){
            Assert.assertEquals(expectedAllInfo.get(i), BrowsersUtils.getText(actualAllInfo.get(i)));
        }
    }
}
