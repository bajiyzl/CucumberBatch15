package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class BrowsersUtils {

    //SelectBy Method
    public static void selectBy (WebElement location, String value, String methodName){

        Select select = new Select(location);
        switch (methodName) {
            case "text":
                select.selectByVisibleText(value);
                break;

            case "value":
                select.selectByValue(value);
                break;

            case "index" :
                select.selectByIndex(Integer.parseInt(value));
                break;
            default:
                System.out.println("Method name is not available , use text, value or index");

        }
    }

    //getText Method

    public static String getText(WebElement element){
        return element.getText().trim();
    }

    //getValue Method

    public static String getAttributeValue (WebElement element){
        return element.getAttribute("value");
    }

    //getName Method

    public static String getAttributeName (WebElement element){
        return element.getAttribute("name");
    }

    //getID Method
    public static String getAttributeId (WebElement element){
        return element.getAttribute("id");
    }

    //getLink Method

    public static String getAttributeLink (WebElement element){
        return element.getAttribute("href");
    }

    //getClass Method
    public static String getAttributeClass (WebElement element){
        return element.getAttribute("class");
    }

    //getType Method
    public static String getAttributeType (WebElement element){
        return element.getAttribute("type");
    }


/*
Scroll Down for JS Methods
*
*
*
*
*
*
 */

    // getTitle by Javascript

    public static String getTitleWithJS (WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript("return document.title").toString().trim();
    }

    // click Button by Javascript
    public static void clickWithJS (WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",element);

    }

    // scroll by Javascript
    public static void scrollWithJs (WebDriver driver,  WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)",element);
    }

    /*
    *
    *
    *
    *
    * Window handle Methods
    *
    *
    *
    *
     */

    // Two window handle
    public static void switchById (WebDriver driver) {
        String mainPageId = driver.getWindowHandle();
        Set<String> allPagesId = driver.getWindowHandles();
        for (String id : allPagesId){
            driver.switchTo().window(id);
        }
    }

    // Multiple window handle
    public static void switchByTitle (WebDriver driver, String title){
        Set<String> allPagesId = driver.getWindowHandles();
        for (String id:allPagesId){
            driver.switchTo().window(id);
               if (driver.getTitle().contains(title)){
                break;
                }
            }

        }

    public static void getScreenShot (WebDriver driver, String packageName ) {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String location = System.getProperty("src/test/java/" + packageName + "/");
        try{
            FileUtils.copyFile(file, new File(location + System.currentTimeMillis()));
        }catch (IOException e){
            throw new RuntimeException();
        }
    }
}


