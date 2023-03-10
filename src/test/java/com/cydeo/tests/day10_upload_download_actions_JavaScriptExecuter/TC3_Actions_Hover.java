package com.cydeo.tests.day10_upload_download_actions_JavaScriptExecuter;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC3_Actions_Hover {


 @Test
 public  void hovering_test(){
//TC #3: Hover Test
//1. Go to https://practice.cydeo.com/hovers
     Driver.getDriver().get("https://practice.cydeo.com/hovers");


// Locate all images/elements under here:
     WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
     WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
     WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));


//     Locate all "user " texts under here:
     WebElement userText1 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
     WebElement userText2 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
     WebElement userText3 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));



  Actions actions= new Actions(Driver.getDriver());


//2. Hover over to first image
actions.moveToElement(img1).perform();


//3. Assert:
//a. “name: user1” is displayed
Assert.assertTrue(userText1.isDisplayed());


//4. Hover over to second image
     actions.moveToElement(img2).perform();


//5. Assert:
//a. “name: user2” is displayed
Assert.assertTrue(userText2.isDisplayed());


//6. Hover over to third image
     actions.moveToElement(img3).perform();


//7. Confirm:
//a. “name: user3” is displayed
     Assert.assertTrue(userText3.isDisplayed());





 }







}
