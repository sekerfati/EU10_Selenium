package com.cydeo.tests.day11_Actions_JSexecuterPractice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractices {




@Test
public  void task_4_and_5_test() throws InterruptedException {
     //TC #4: Scroll practice
    //1- Open a chrome browser
    //2- Go to: https://practice.cydeo.com/
    Driver.getDriver().get("https://practice.cydeo.com/");




    //3- Scroll down to “Powered by CYDEO”
    // create object of Actions and pass our "driver" instance:
    Actions actions =new Actions(Driver.getDriver());
    // locating cydeoLink to be able to pass in to  actions method:
    WebElement cydeoLinkButton = Driver.getDriver().findElement(By.linkText("CYDEO"));


    //4- Scroll using Actions class “moveTo(element)” method
    actions.moveToElement(cydeoLinkButton).perform();


//-------------------------------------------------------------------------------------
      //TC #5: Scroll practice 2
    //1- Continue from where the Task 4 is left in the same test.
   //2- Scroll back up to “Home” link using PageUP button
   actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();

//   Driver.getDriver().quit();
     Driver.closeDriver();

}

@Test
public void test_closeDriver(){

    Driver.getDriver().get("https://cydeo.com");
    Driver.closeDriver();
}



}
