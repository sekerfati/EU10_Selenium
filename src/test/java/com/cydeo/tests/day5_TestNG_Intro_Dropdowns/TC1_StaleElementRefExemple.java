package com.cydeo.tests.day5_TestNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC1_StaleElementRefExemple {
    public static void main(String[] args) throws InterruptedException {

//XPATH PRACTICES
//DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
//TC #1: StaleElementReferenceException handling
//1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


//2. Go to https://practice.cydeo.com/add_remove_elements/
      //  driver.get("https://practice.cydeo.com/add_remove_elements/");
         driver.navigate().to("https://practice.cydeo.com/add_remove_elements/");


//3. Click to “Add Element” button
        WebElement addElementButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        Thread.sleep(2000);
        addElementButton.click();


//4. Verify “Delete” button is displayed after clicking.
        WebElement deleteElementButton = driver.findElement(By.xpath("//button[text()='Delete']"));
        System.out.println(deleteElementButton.isDisplayed());

        if (deleteElementButton.isDisplayed()){
            System.out.println("“Delete” button display verification PASSED");
        }
        else {System.out.println("“Delete” button display verification FAILED");}


//5. Click to “Delete” button.
            deleteElementButton.click();


//6. Verify “Delete” button is NOT displayed after clicking.
//USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        try {
            System.out.println("deleteElementButton.isDisplayed() = " + deleteElementButton.isDisplayed());
        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException is thrown");
            System.out.println("this means that the web element is completely deleted from the web page ");
            System.out.println("deleteElementButton.isDisplayed() = false");
          //  e.printStackTrace();
        }


  driver.close();






    }
}
