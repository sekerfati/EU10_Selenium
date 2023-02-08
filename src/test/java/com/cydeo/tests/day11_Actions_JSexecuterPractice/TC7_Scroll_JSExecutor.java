package com.cydeo.tests.day11_Actions_JSexecuterPractice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC7_Scroll_JSExecutor {



 @Test
 public void   task7_Scroll_test(){
//TC #7: Scroll using JavascriptExecutor
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/large
     Driver.getDriver().navigate().to("https://practice.cydeo.com/large");



     WebElement cydeoLinkButton = Driver.getDriver().findElement(By.linkText("CYDEO"));
     WebElement homeLinkButton = Driver.getDriver().findElement(By.linkText("Home"));

     // we are down-casting our JavascriptExecutor
     JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();


//3- Scroll down to “Cydeo” link
     BrowserUtils.sleep(2);
 js.executeScript("arguments[0].scrollIntoView(true)", cydeoLinkButton);







//4- Scroll up to “Home” link
     BrowserUtils.sleep(2);
   //  js.executeScript("arguments[1].scrollIntoView(true)",cydeoLinkButton, homeLinkButton);
     js.executeScript("arguments[0].scrollIntoView(true)", homeLinkButton);

//5- Use below provided JS method only
//JavaScript method to use : arguments[0].scrollIntoView(true)
//Note: You need to locate the links as web elements and pass them as
//arguments into executeScript() method


Driver.closeDriver();

 }






}
