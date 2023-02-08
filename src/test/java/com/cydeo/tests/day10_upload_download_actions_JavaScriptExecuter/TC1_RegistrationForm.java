package com.cydeo.tests.day10_upload_download_actions_JavaScriptExecuter;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_RegistrationForm {

 @Test
 public  void registration_form_test(){
     //Note: Use JavaFaker OR read from configuration.properties file when possible.
//1. Open browser
//2. Go to website: https://practice.cydeo.com/registration_form
     //  Driver.getDriver()------> driver.get(URL)
     Driver.getDriver().get(ConfigurationReader.getPropertyMethod("registration.form.url"));


 // Create JavaFaker object:
     Faker faker= new Faker();


//3. Enter first name
     WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
     inputFirstName.sendKeys(faker.name().firstName());



//4. Enter last name
     WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
     inputLastName.sendKeys(faker.name().lastName());




//5. Enter username
     WebElement inputUserName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
    // inputUserName.sendKeys(faker.name().username().replaceAll(".", ""));

     String user=faker.bothify("helpdesk###");
     inputUserName.sendKeys(user);


//6. Enter email address
     WebElement inputEMail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
     inputEMail.sendKeys(user+"@email.com");




//7. Enter password
     WebElement inputPassWord = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
     inputPassWord.sendKeys(faker.bothify("???#####"));
    // inputPassWord.sendKeys(faker.numerify("#####"));
    // inputPassWord.sendKeys(faker.letterify("?????????"));
    // inputPassWord.sendKeys(faker.internet().password());



//8. Enter phone number
     WebElement inputPhoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
    inputPhoneNumber.sendKeys(faker.numerify("###-###-####"));




//9. Select a gender from radio buttons
     WebElement femaleGenderButton = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
     femaleGenderButton.click();




//10.Enter date of birth
     WebElement inputDateOfBirth = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
     inputDateOfBirth.sendKeys("03/08/2000");



//11.Select Department/Office
     WebElement departmentDropDown = Driver.getDriver().findElement(By.xpath("//select[@name='department']"));
     Select   departmentDropDownSelect= new Select(departmentDropDown);
     departmentDropDownSelect.selectByIndex(faker.number().numberBetween(1,9));




//12.Select Job Title
     WebElement jobTitleDropDown = Driver.getDriver().findElement(By.xpath("//select[@name='job_title']"));
     Select jobTitleDropDownSelect= new Select(jobTitleDropDown);
     jobTitleDropDownSelect.selectByIndex(faker.number().numberBetween(1,8));



//13.Select programming language from checkboxes
     WebElement programingLanguageButton = Driver.getDriver().findElement(By.xpath("//input[@value='java']"));
     programingLanguageButton.click();



//14.Click to sign up button
     WebElement signUpButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
  signUpButton.click();



//15.Verify success message “You’ve successfully completed registration.” is
//displayed.
String expectedMessage="You've successfully completed registration!";
String actualMessage=Driver.getDriver().findElement(By.xpath("//p")).getText();
     System.out.println("expectedMessage = " + expectedMessage);
     System.out.println("actualMessage = " + actualMessage);
 //    Assert.assertTrue(actualMessage.equals(expectedMessage));
     Assert.assertEquals(actualMessage, expectedMessage);




 }











}
