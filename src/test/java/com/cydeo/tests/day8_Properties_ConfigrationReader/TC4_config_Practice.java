package com.cydeo.tests.day8_Properties_ConfigrationReader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC4_config_Practice {



// public WebDriver driver ;

 //   @BeforeMethod
 //   public void setUpMethod(){

//TC #4: Google search
//1- Open a chrome browser
//2- Go to: https://google.com

//        // we are getting the browserType dynamically from our configuration.properties file:
//        String browserType= ConfigurationReader.getPropertyMethod("browser");
//        driver = WebDriverFactory.getDriver(browserType);

 //       driver.manage().window().maximize();
  //      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 //       driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();


  //  }







  @Test

  public void google_search_test(){
// at the first call  Driver.getDriver() will go to the switchCase
      Driver.getDriver().get("https://google.com");
      Driver.getDriver().findElement(By.xpath("//button[@id='L2AGLb']")).click();
// After the first call  Driver.getDriver() will go to the return driver.


//3- Write “apple” in search box
      WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
       googleSearchBox.sendKeys(ConfigurationReader.getPropertyMethod("searchValue")+ Keys.ENTER);



//4- Verify title:
//Expected: apple - Google Search
String expectedTitle=ConfigurationReader.getPropertyMethod("searchValue")+ "- Google Search";
String actualTitle=Driver.getDriver().getTitle();
Assert.assertEquals(actualTitle, expectedTitle);









  }





}
