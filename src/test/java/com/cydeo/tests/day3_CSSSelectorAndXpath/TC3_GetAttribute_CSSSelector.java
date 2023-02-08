package com.cydeo.tests.day3_CSSSelectorAndXpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC3_GetAttribute_CSSSelector {
    public static void main(String[] args) {

         //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();



        //2- Go to: https://login1.nextbasecrm.com/
        //driver.get("https://login1.nextbasecrm.com/");
        driver.navigate().to("https://login1.nextbasecrm.com/");




        //3- Verify “Log in” button text is as expected:
        //Expected: Log In
       String expectedLoginButtonText = "Log In";
       // WebElement loginButton = driver.findElement(By.className("login-btn")); // finding webElement by className
      //  String actualLoginButtonText = loginButton.getAttribute("value");

        //LOCATING SAME ELEMENT USING DIFFERENT CSS-SELECTORS :
                                       // tagName[AttributeName='AttributeValue']
                                       //input[class='login-btn']
        WebElement loginButton =   driver.findElement(By.cssSelector("input[class='login-btn']")); //finding webElement by cssSelector using class attribute
         //  WebElement loginButton =  driver.findElement(By.cssSelector("input[type='submit']")); //finding webElement by cssSelector using type attribute
        // WebElement loginButton = driver.findElement(By.cssSelector("input[onclick='BX.addClass(this, 'wait');']")); // this is not working: finding webElement by cssSelector using onclick attribute
        // WebElement loginButton =  driver.findElement(By.cssSelector("input[value='Log In']")); //finding webElement by cssSelector using value attribute
        String actualLoginButtonText = loginButton.getAttribute("value");  // getting the value of valueAttribute
        System.out.println("actualLoginButtonText = " + actualLoginButtonText);
        System.out.println("expectedLoginButtonText = " + expectedLoginButtonText);
        if (actualLoginButtonText.equals(expectedLoginButtonText)) {
        System.out.println("LogIn button text verification PASSED!");
    }
    else {System.out.println("LogIn button text verification FAILED!!!");}

    driver.close();



    }


}
