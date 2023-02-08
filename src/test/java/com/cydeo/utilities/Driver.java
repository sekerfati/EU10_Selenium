package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /*
 creating a private    constructor, so we are closing access to
  the object of this class from outside the class
     */

  private  Driver(){}




/*
we make     WebDriver private, because we want to close access from outside the class.
we make it static because we will use it in a static method
 */
private static WebDriver driver;    // value is null by default




/*
create a reusable utility method which will return same driver instance when we call it.
 */
public static WebDriver getDriver(){

    if (driver== null){
/*
we read our browserType from Configuration.properties
this way, we can control which browser is opened from outside our code, from Configuration.properties.
 */
        String browserTyp=ConfigurationReader.getPropertyMethod("browser");


 /*
 depending on the browserType that will be returned from configuration.properties file,
 switch statement will determine the case, and open
  */

        switch (browserTyp){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
               break;


            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;

        }
    }

    return driver;




}



// driver.quite()----> NoSuchSessionException
// driver.close()---->
// try to create a method named closeDriver:
/*
this method will make sure our diver is always null after using quit() method:
 */

 public  static  void closeDriver(){

if(driver!= null){
// this line will terminate the existing session. Value will not be even null.
    driver.quit();
driver=null;            }

 }





}
