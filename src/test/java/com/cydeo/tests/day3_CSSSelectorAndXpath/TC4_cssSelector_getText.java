package com.cydeo.tests.day3_CSSSelectorAndXpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC4_cssSelector_getText {
    public static void main(String[] args) {
        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
       // driver.get("https://login1.nextbasecrm.com/?forgot_password=y");
         driver.navigate().to("https://login1.nextbasecrm.com/?forgot_password=yes");


        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password
                                                       //TagName[attribute='Value']
       // WebElement resetButton = driver.findElement(By.cssSelector("button[class='login-btn']")); // using sccSelector with class attribute
      //  WebElement resetButton = driver.findElement(By.cssSelector("button[onclick='BX.addClass(this, 'wait');']")); // using sccSelector with onclick attribute
        WebElement resetButton = driver.findElement(By.cssSelector("button[value='Reset password']")); // using sccSelector with value attribute
        String expectedResetPasswordText = "Reset password";
        String actualResetPasswordText = resetButton.getText();
        System.out.println("expectedResetPasswordText = " + expectedResetPasswordText);
        System.out.println("actualResetPasswordText = " + actualResetPasswordText);
        if (actualResetPasswordText.equals(expectedResetPasswordText)){
            System.out.println("Reset password text verification PASSED");
        }
        else {System.out.println("Reset password text verification FAILED");}




    }
}
