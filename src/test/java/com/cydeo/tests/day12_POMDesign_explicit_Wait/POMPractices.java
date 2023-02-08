package com.cydeo.tests.day12_POMDesign_explicit_Wait;

import com.cydeo.pages.LibraryLogInPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {
    LibraryLogInPage libraryLogInPage;
    @BeforeMethod
 public void setUpMethod(){
        Driver.getDriver().get("https://library1.cydeo.com");
        libraryLogInPage=new LibraryLogInPage();

    }
    @AfterMethod
    public  void tearDownMethod(){
        Driver.closeDriver();
    }


  @Test

  public void Required_field_error_message_test(){
//TC #1: Required field error message test
//1- Open a Chrome browser
//2- Go to: https://library1.cydeo.com
// Driver.getDriver().get("https://library1.cydeo.com");


//3- Do not enter any information
//4- Click to “Sign in” button
 // libraryLogInPage=new LibraryLogInPage();
  libraryLogInPage.signInButton.click();


//5- Verify expected error is displayed:
//Expected: This field is required.
//NOTE: FOLLOW POM DESIGN PATTERN
 Assert.assertTrue(libraryLogInPage.fieldRequiredMessage.isDisplayed());

// Driver.closeDriver();
  }

@Test
public void Invalid_email_format_error_message_test(){
//TC #2: Invalid email format error message test
//1- Open a Chrome browser
//2- Go to: https://library1.cydeo.com
 //Driver.getDriver().get("https://library1.cydeo.com");

//3- Enter invalid email format
  //  libraryLogInPage=new LibraryLogInPage();
    libraryLogInPage.inputUserName.sendKeys("somethingwrong");
    libraryLogInPage.signInButton.click();


//4- Verify expected error is displayed:
//Expected: Please enter a valid email address.
//NOTE: FOLLOW POM DESIGN PATTERN
Assert.assertTrue(libraryLogInPage.enterValidEMailErrorMessage.isDisplayed());
//Driver.closeDriver();
}



@Test
    public void  Library_negative_login_test(){
//TC #3: Library negative login
//1- Open a Chrome browser
//2- Go to: https://library1.cydeo.com
// Driver.getDriver().navigate().to("https://library1.cydeo.com");




  //  libraryLogInPage=new LibraryLogInPage();
//3- Enter incorrect username or incorrect password
    libraryLogInPage.inputUserName.sendKeys("wrong@username.com");
    libraryLogInPage.inputPassWord.sendKeys("wrongpassword");
libraryLogInPage.signInButton.click();



//4- Verify title expected error is displayed:
//Expected: Sorry, Wrong Email or Password
//NOTE: FOLLOW POM DESIGN PATTERN
Assert.assertTrue(libraryLogInPage.invalidEmailOrPassWordMessage.isDisplayed());

//Driver.closeDriver();

}










}
