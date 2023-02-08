package com.cydeo.utilities;

/*
In this class only general utility methods that are not related to some specific page.
 */


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {
    /*
    this method will accept int(in seconds) and execute Thread.sleep for given duration.
     */
public static void sleep(int second){

    second *=1000;
    try {
        Thread.sleep(second);
    } catch (InterruptedException e) {

    }


}

/*
This method accepts 3 arguments:
arg #1: webdriver;
arg #2: expectedInUrl: for verifying if the url contains the given String
        - if conditions matches, it will break the loop
arg #3: expectedInTitle: to compare  expectedInTitle against the actualTitle

 */

public static void switchWindowAndVerify(WebDriver driver,  String expectedInUrl, String expectedInTitle){


    Set<String> allWindowHandles =   driver.getWindowHandles();
    for (String eachWindowHandle : allWindowHandles) {
        driver.switchTo().window(eachWindowHandle);
        System.out.println("Current URL :"+ driver.getCurrentUrl());
        if (driver.getCurrentUrl().contains(expectedInUrl)){
            break;
        }

    }




//Assert: Title contains “expectedInTitle”
    String actualInTitle= driver.getTitle();
    Assert.assertTrue(actualInTitle.contains(expectedInTitle));



}



//This method accepts a String "expectedTitle" and asserts if iti is true:
 public  static void verifyTitle(WebDriver driver,String expectedTitle ){

     Assert.assertEquals(driver.getTitle(), expectedTitle);

 }




 // creating a utility method for explicitWait, so we do not have to repeat the lines:
 public static  void waitForInvisibilityOf(WebElement webElement){
    // Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
     WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
     wait.until(ExpectedConditions.invisibilityOf(webElement));


 }




}
