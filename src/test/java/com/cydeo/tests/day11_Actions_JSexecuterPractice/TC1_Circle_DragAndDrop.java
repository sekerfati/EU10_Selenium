package com.cydeo.tests.day11_Actions_JSexecuterPractice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_Circle_DragAndDrop {

 @Test
 public void task1_DragAndDrop_test() throws InterruptedException {

    //TC #: Drag and drop
     //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
     Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

// locate accept-cookies and click accept button:
     WebElement acceptPopUpBox = Driver.getDriver().findElement(By.xpath("//button[text()='Accept and Close']"));
     acceptPopUpBox.click();

// locate small and big circles to be able to drag them around:
     WebElement smallCircleButton = Driver.getDriver().findElement(By.id("draggable"));
     WebElement bigCircleButton = Driver.getDriver().findElement(By.id("droptarget"));


     //2. Drag and drop the small circle to bigger circle.
     Actions actions= new Actions(Driver.getDriver());
    // actions.dragAndDrop(smallCircleButton, bigCircleButton).perform();
actions.clickAndHold(smallCircleButton)  // ctrl + Enter to push the code to the next line
        .pause(2000)
        .moveToElement(bigCircleButton)
        .pause(2000)
        .release()
        .perform();





     //3. Assert:
     //-Text in big circle changed to: “You did great!”
     WebElement afterClickText = Driver.getDriver().findElement(By.xpath("//div[text()='You did great!']"));
     String actualText = afterClickText.getText();
     String expectedText = "You did great!";
     Assert.assertTrue(actualText.equals(expectedText));


Driver.closeDriver();


 /*


     WebElement allowAllBox = Driver.getDriver().findElement(By.xpath("//button[text()='Allow All']"));
     allowAllBox.click();
  */



 }



}
