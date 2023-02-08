package com.cydeo.tests.day13_Review_And_Practices;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitPractices {

    DynamicControlsPage dynamicControlsPage;

 @BeforeMethod
 public void setupMethod(){
//TC #2: Explicit wait practice
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/dynamic_controls
     Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
     dynamicControlsPage=new DynamicControlsPage();
 }

 @Test
    public void remove_button_TC2_test(){

//3- Click to “Remove” button
     dynamicControlsPage.removeButton.click();




//4- Wait until “loading bar disappears”
   //  Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    // WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
    // wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));

     BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);


//5- Verify:
//a. Checkbox is not displayed
     try {
         // Assert.false method will pass the test if the boolean value returned is:false
         //  Assert.assertFalse(dynamicControlsPage.checkBoxElement.isDisplayed());
         Assert.assertTrue(!dynamicControlsPage.checkBoxElement.isDisplayed());
     } catch (NoSuchElementException e) {
         Assert.assertTrue(true);
       //  e.printStackTrace();
     }


//b. “It’s gone!” message is displayed.
//NOTE: FOLLOW POM
    Assert.assertTrue(dynamicControlsPage.itIsGoneMessage.isDisplayed());
    Assert.assertTrue(dynamicControlsPage.itIsGoneMessage.getText().equals("It's gone!"));



 }



 @Test
    public void enable_button_TC3_test(){
//TC #3: Explicit wait practice
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/dynamic_controls
     // done in the before method




//3- Click to “Enable” button
    // System.out.println("dynamicControlsPage.inputBox.isEnabled() = " + dynamicControlsPage.inputBox.isEnabled());
      dynamicControlsPage.enableButton.click();


     System.out.println("dynamicControlsPage.inputBox.isEnabled() = " + dynamicControlsPage.inputBox.isEnabled());
//4- Wait until “loading bar disappears”
 // calling our     explicitWait utility method to wait loadingBar to disappear
    BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);
  System.out.println("dynamicControlsPage.inputBox.isEnabled() = " + dynamicControlsPage.inputBox.isEnabled());



//5- Verify:
//a. Input box is enabled.
     Assert.assertTrue(dynamicControlsPage.inputBox.isEnabled());



//b. “It’s enabled!” message is displayed.
//NOTE: FOLLOW POM
   Assert.assertTrue(dynamicControlsPage.enabledMessage.isDisplayed());

// check the string value is matching as expected:It's enabled!
     Assert.assertTrue(dynamicControlsPage.enabledMessage.getText().equals("It's enabled!"));


    }





}
