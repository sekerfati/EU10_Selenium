package com.cydeo.tests.day5_TestNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC4_SimpleDropDowns {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        //TC#4: Verifying “Simple dropdown” and “State selection” dropdown
        //default values
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //2. Go to https://practice.cydeo.com/dropdown
        // driver.get("https://practice.cydeo.com/dropdown");
        driver.navigate().to("https://practice.cydeo.com/dropdown");
    }
    @Test
    public void simpleDropDownTest(){



        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”
        Select simpleDropDown= new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentlySelectedOption = simpleDropDown.getFirstSelectedOption();
        String expectedSimpleDropDownText = "Please select an option";
        String actualSimpleDropDownText = currentlySelectedOption.getText();
        System.out.println("expectedSimpleDropDownText = " + expectedSimpleDropDownText);
        System.out.println("actualSimpleDropDownText = " + actualSimpleDropDownText);
        Assert.assertEquals(actualSimpleDropDownText, expectedSimpleDropDownText);


        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”
        Select stateDropDown=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //WebElement currentlySelectedStateDropDownOption = stateDropDown.getFirstSelectedOption();
        //String actualStateDropDownText = currentlySelectedStateDropDownOption.getText();
        String  expectedStateDropDownText = "Select a State";
        String actualStateDropDownText = stateDropDown.getFirstSelectedOption().getText();
        System.out.println("expectedStateDropDownText = " + expectedStateDropDownText);
        System.out.println("actualStateDropDownText = " + actualStateDropDownText);
        Assert.assertEquals(actualStateDropDownText, expectedStateDropDownText);




    }








}
