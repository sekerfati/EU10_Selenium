package com.cydeo.tests.day6_Alerts_IFrames_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropDownPractice_Day5_TC5_TC6 {

    public  WebDriver driver;

 @BeforeMethod
    public void setUpMethod(){
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to http://practice.cybertekschool.com/dropdown
        // driver.get("http://practice.cybertekschool.com/dropdown");
        driver.navigate().to("http://practice.cybertekschool.com/dropdown");

    }

@Test
    public void dropDown_Task5() throws InterruptedException {

    //TC #5: Selecting state from State dropdown and verifying result




   // we located the dropdown and it is ready to use
    Select stateDropDown= new Select(driver.findElement(By.xpath("//select[@id='state']")));


    //3. Select Illinois
    Thread.sleep(2000);
    stateDropDown.selectByVisibleText("Illinois");


    //4. Select Virginia
    Thread.sleep(2000);
    stateDropDown.selectByValue("VA");



    //5. Select California
    Thread.sleep(2000);
    stateDropDown.selectByIndex(5);




    //6. Verify final selected option is California.
    //Use all Select options. (visible text, value, index)
    String expectedSelectedOptionText = "California";
    String actualSelectedOptionText = stateDropDown.getFirstSelectedOption().getText();
    System.out.println("expectedSelectedOptionText = " + expectedSelectedOptionText);
    System.out.println("actualSelectedOptionText = " + actualSelectedOptionText);
    Assert.assertEquals(actualSelectedOptionText, expectedSelectedOptionText);



}


@Test
public void dropDown_Task6() throws InterruptedException {
//TC #6: Selecting date on dropdown and verifying
//1. Open Chrome browser
//2. Go to https://practice.cydeo.com/dropdown
// it will call the BeforeMethod to use Chrome driver and go to the page





//3. Select “December 1st, 2013” and verify it is selected.
    Select yearDropDown=new Select(driver.findElement(By.xpath("//select[@id='year']")));
    Select monthDropDown=new Select(driver.findElement(By.xpath("//select[@id='month']")));
    Select dayDropDown=new Select(driver.findElement(By.xpath("//select[@id='day']")));



//Select year using : visible text
    Thread.sleep(2000);
    yearDropDown.selectByVisibleText("2013");

//Select month using : value attribute
    Thread.sleep(2000);
    monthDropDown.selectByValue("11");

//Select day using : index number
    Thread.sleep(2000);
    dayDropDown.selectByIndex(0);



// verifying the year:
String expectedYear="2013";
String actualYear=yearDropDown.getFirstSelectedOption().getText();
//Assert.assertEquals(actualYear, expectedYear);
Assert.assertTrue(actualYear.equals(expectedYear));


// verifying the month:
String expectedMonth="December";
String actualMonth=monthDropDown.getFirstSelectedOption().getText();
//Assert.assertEquals(actualMonth, expectedMonth);
Assert.assertTrue(actualMonth.equals(expectedMonth));



// verifying the day:
String expectedDay="1";
String actualDay=dayDropDown.getFirstSelectedOption().getText();
//Assert.assertEquals(actualDay, expectedDay);
Assert.assertTrue(actualDay.equals(expectedDay));





}

@AfterMethod
    public void tearDownMethod(){
        driver.close();
}


}
