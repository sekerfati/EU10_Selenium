package com.cydeo.tests.day6_Alerts_IFrames_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC4_iFramePractices_day6 {

    WebDriver driver;

    @BeforeMethod
public void setUpMethod(){

    //TC #4: Iframe practice
        //1. Create a new class called: T4_Iframes
        //2. Create new test and make set-ups
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //3. Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");


}


// you can use different methods to skip a test these are: 1-    //@Test    2-  @Ignore  @Test


// @Ignore
    @Test
public void iFrame_task4(){

        //locate p-Tag:
        // this will throw noSuchElementException because p-Tag is the inner frame not parentFrame
        //  driver.findElement(By.xpath("//p"));


        // we need to switch the driver's focus to the innerFrame(iFrame)
        // option-1 switching to iframe using id Attribute value:
       // driver.switchTo().frame("mce_0_ifr");
        // option-2 switching to iframe using index number of iFrame:
       // driver.switchTo().frame(0);
        // option-3 locate as web element and pass in frame() method:
         driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));



       //locate p-Tag:
      WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));
      //4. Assert: “Your content goes here.” Text is displayed.
       Assert.assertTrue(yourContentGoesHereText.isDisplayed(), "“Your content goes here.” Text is NOT displayed.");
      System.out.println("yourContentGoesHereText.getText() = " + yourContentGoesHereText.getText());


    //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
       driver.switchTo().parentFrame();
    WebElement headerTextButton = driver.findElement(By.xpath("//h3"));
    String expectedHeaderText = "An iFrame containing the TinyMCE WYSIWYG Editor";
    String actualHeaderText = headerTextButton.getText();

    // To be able to verify the header we have to switch back to the main HTML/ ParentFrame(outer frame):
    Assert.assertTrue( headerTextButton.isDisplayed());

    // verify expected header text is equal  to actual header text
   // Assert.assertTrue(actualHeaderText.equals(expectedHeaderText), " actual header text is not as expected");
    Assert.assertEquals(actualHeaderText, expectedHeaderText,"actual header text is not as expected" );

}


@AfterMethod
 public void tearDownMethod(){
        driver.close();
}











}
