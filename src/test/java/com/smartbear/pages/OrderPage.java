package com.smartbear.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowsersUtils;

import java.util.List;
import java.util.Locale;

public class OrderPage {
    public OrderPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//select")
    WebElement productSelect;

    @FindBy (xpath = " //input[@name='ctl00$MainContent$fmwOrder$txtQuantity']")
    WebElement quantityElement;

    public void productAndQuantitySelect (String product, String quantity){
        BrowsersUtils.selectBy(productSelect,product, "text");
        quantityElement.sendKeys(quantity);
    }

    @FindBy (css = "#ctl00_MainContent_fmwOrder_txtName")
    WebElement customerNameBox ;

    @FindBy (css = "#ctl00_MainContent_fmwOrder_TextBox2")
    WebElement streetBox;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox3']")
    WebElement cityBox;

    @FindBy (css = "#ctl00_MainContent_fmwOrder_TextBox4")
    WebElement stateBox;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox5")
    WebElement zipCodeBox;

    public void provideAddressInfo (String customerName, String street, String city, String state, String zipcode){
        customerNameBox.clear();
        customerNameBox.sendKeys(customerName);
        streetBox.sendKeys(street);
        cityBox.sendKeys(city);
        stateBox.sendKeys(state);
        zipCodeBox.sendKeys(zipcode);
    }

    @FindBy (xpath = "//table[@id='ctl00_MainContent_fmwOrder_cardList'] //td")
    List<WebElement> actualCardList;

    @FindBy (css = "#ctl00_MainContent_fmwOrder_TextBox6")
    WebElement cardNumberBox;

    @FindBy (css = "#ctl00_MainContent_fmwOrder_TextBox1")
    WebElement expireDateBox;

    @FindBy (xpath = "//a[contains(text(),'Process')]")
    WebElement processButton;

    public void providePaymentInfo (String cardName, String cardNumber, String expireDate ){

        for (int i = 0; i< actualCardList.size(); i++){
            if (BrowsersUtils.getText(actualCardList.get(i)).equals(cardName)){
                actualCardList.get(i).click();
            }
        }

        cardNumberBox.sendKeys(cardNumber);
        expireDateBox.sendKeys(expireDate);
        processButton.click();
    }

    @FindBy (xpath = "//strong")
    WebElement strong;

    @FindBy (xpath = "//a[.='View all orders']")
    WebElement viewAllOrdersButton;

    public void validateStrongAndViewAll (String text){
        Assert.assertEquals(text, BrowsersUtils.getText(strong));
        viewAllOrdersButton.click();
    }

}
