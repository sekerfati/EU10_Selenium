package com.cydeo.tests.day5_TestNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC2_RadioButton {
    public static void main(String[] args) throws InterruptedException {

//XPATH PRACTICES
//DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
//TC #2: Radiobutton handling
//1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


//2. Go to https://practice.cydeo.com/radio_buttons
       // driver.navigate().to("https://practice.cydeo.com/radio_buttons");
        driver.get("https://practice.cydeo.com/radio_buttons");


//3. Click to “Hockey” radio button
        WebElement hockeyRadioButton = driver.findElement(By.xpath("//input[@id='hockey']"));
       Thread.sleep(2000);
        hockeyRadioButton.click();
        Thread.sleep(2000);
//4. Verify “Hockey” radio button is selected after clicking.
//USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        System.out.println("hockeyRadioButton.isSelected() = " + hockeyRadioButton.isSelected());
       if (hockeyRadioButton.isSelected()){
           System.out.println("“Hockey” radio button is SELECTED, verification PASSED");
       }
       else {
           System.out.println("“Hockey” radio button is NOT SELECTED verification FAILED");
       }

        driver.close();







    }
}
