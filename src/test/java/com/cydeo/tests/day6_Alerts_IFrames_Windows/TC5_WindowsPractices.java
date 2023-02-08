package com.cydeo.tests.day6_Alerts_IFrames_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TC5_WindowsPractices {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        //TC #5: Window Handle practice
       //1. Create a new class called: T5_WindowsPractice
       //2. Create new test and make set ups
      driver = WebDriverFactory.getDriver("Chrome");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      //3. Go to : https://practice.cydeo.com/windows
       driver.get(" https://practice.cydeo.com/windows");


    }

@Test
    public  void windowHandle_multipleWindow_Task5(){
  //Storing the main page's window handle as String is
  // good practice for future re-usable purposes
  String mainHandle= driver.getWindowHandle();
 System.out.println("mainHandle = " + mainHandle);// changeable alphanumeric code


//4. Assert: Title is “Windows”
    String expectedTitle = "Windows";
    String actualTitle = driver.getTitle();
   // Assert.assertTrue(actualTitle.equals(expectedTitle), "Actual title is not the same with the expected title");
    Assert.assertEquals(actualTitle, expectedTitle, "Actual title is not the same with the expected title");
    System.out.println("Actual Title before click: "+ actualTitle);


//5. Click to: “Click Here” link
   // WebElement clickHereLink = driver.findElement(By.xpath("//a[text()='Click Here']"));
    WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));// using linkTex
     clickHereLink.click();
     
// selenium is a good soldier it will not switch to /go to the new opened page until we command.


    
//6. Switch to new Window.
    Set<String> allWindowHandles = driver.getWindowHandles();// storing all the windows
    // window handle 1-      mainWindow// first window
    // window handle 2-      newWindow/ second window

    for ( String each : allWindowHandles  ) { // iterating allWindowHandles
       driver.switchTo().window(each);
        System.out.println("Current title while switching windows: "+ driver.getTitle());
    }




//7. Assert: Title is “New Window”
    String expectedTitleAfterClick =  "New Window";
    actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, expectedTitleAfterClick, "Actual Title is not the same with expected title after click  ");
    System.out.println("Actual Title after click: "+ actualTitle);    
    
// If I want ot go back to the main page, I can use already stored main page/Main handle
//  driver.switchTo().window(mainHandle);



}

@AfterMethod
    public void tearDownMethod() throws InterruptedException {
       // driver.close(); //will close the current tab
        Thread.sleep(2000);
        driver.quit();   // will close all tabs
}



}
