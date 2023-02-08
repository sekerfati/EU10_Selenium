package com.cydeo.tests.day5_TestNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        // Do browser driver setUp
        //Open browser
        driver = WebDriverFactory.getDriver("Chrome");


        //Maximize the page
        driver.manage().window().maximize();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test
    public void selenium_test(){


    //Get "https://www.google.com"
       // driver.get("https://www.google.com");
       driver.navigate().to("https://www.google.com");
    driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();


    //Assert: Title is "Google"
    String expectedTitle = "Google";
    String actualTitle = driver.getTitle();
    //Assert.assertEquals(driver.getTitle(), "Google");
    Assert.assertEquals(actualTitle, expectedTitle, "your message go here");


}







}
