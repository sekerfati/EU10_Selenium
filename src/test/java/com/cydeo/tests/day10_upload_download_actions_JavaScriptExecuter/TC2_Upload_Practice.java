package com.cydeo.tests.day10_upload_download_actions_JavaScriptExecuter;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2_Upload_Practice {


  @Test
  public void upload_test(){

      //TC #2 Upload Test
      //1. Go to https://practice.cydeo.com/upload
      // Driver.getDriver().get("https://practice.cydeo.com/upload");
      Driver.getDriver().navigate().to("https://practice.cydeo.com/upload");



      //2. Find some small file from your computer, and get the path of it.
      String path="C:\\Users\\fatih\\OneDrive\\Skrivbord\\sunnyday.jpeg";



      //3. Upload the file.
      WebElement uploadFileButton = Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));
      BrowserUtils.sleep(2);
       uploadFileButton.sendKeys(path);

      WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
      uploadButton.click();


      //4. Assert:
      //-File uploaded text is displayed on the page
      WebElement fileUploadedHeader = Driver.getDriver().findElement(By.xpath("//h3[text()='File Uploaded!']"));
      String actualDisplayedMessageText =fileUploadedHeader .getText();
      String expectedDisplayedMessageText = "File Uploaded!";
      Assert.assertTrue(fileUploadedHeader.isDisplayed());
      Assert.assertEquals(actualDisplayedMessageText, expectedDisplayedMessageText);





  }








}
