package com.cydeo.tests.day6_Alerts_IFrames_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC1_Alert_Practices_day6 {
    WebDriver driver;
@BeforeMethod
public void setUpMethod(){
    //TC #1: Information alert practice
    //1. Open browser
    driver = WebDriverFactory.getDriver("Chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    //2. Go to website: http://practice.cydeo.com/javascript_alerts
       //driver.get("http://practice.cydeo.com/javascript_alerts");
        driver.navigate().to("http://practice.cydeo.com/javascript_alerts");


}

@Test
public void alert_task1() throws InterruptedException {
    // //3. Click to “Click for JS Alert” button
    WebElement JSAlertButton = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
    Thread.sleep(2000);
    JSAlertButton.click();

    // to be able to click Alert OK button we need to switch driver's focus to Alert itself:
    Alert alert=driver.switchTo().alert();

   //4. Click to OK button from the alert
    Thread.sleep(2000);
    alert.accept();


    //    //5. Verify “You successfully clicked an alert” text is displayed.
    WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));


    // failure message  will be displayed only if assertion fails: "result text is not displayed".
    Assert.assertTrue(resultText.isDisplayed(), "Result text is not displayed");


    String expectedResultText = "You successfully clicked an alert";
    String actualResultText = resultText.getText();
    System.out.println("expectedResultText = " + expectedResultText);
    System.out.println("actualResultText = " + actualResultText);
    // failure message  will be displayed only if assertion fails: "Actual result text is not as expected".
    Assert.assertEquals(actualResultText,expectedResultText, "Actual result text is not as expected");





}

@AfterMethod
public void tearDownMethod(){
        driver.close();
}


}
