package com.cydeo.tests.day3_CSSSelectorAndXpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC2_getText_GetAttribute {
    public static void main(String[] args) {

        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();


        //2- Go to: https://login1.nextbasecrm.com/
       // driver.get("https://login1.nextbasecrm.com/");
        driver.navigate().to("https://login1.nextbasecrm.com/");


        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));
        String expectedLabelText = "Remember me on this computer";
        String actualLabelText = rememberMeLabel.getText();
        System.out.println("expectedLabelText = " + expectedLabelText);
        System.out.println("actualLabelText = " + actualLabelText);
        if (actualLabelText.equals(expectedLabelText)){
            System.out.println("Label text verification PASSED");
        }
        else {System.out.println("Label text verification FAILED");}



        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPassword = "Forgot your password?";
        String actualForgotPassword = forgotPasswordLink.getText();
        System.out.println("expectedForgotPassword = " + expectedForgotPassword);
        System.out.println("actualForgotPassword = " + actualForgotPassword);
        if(actualForgotPassword.equals(expectedForgotPassword)){
            System.out.println("Forgot password verification PASSED");
        }
        else {       System.out.println("Forgot password verification FAILED");}


        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        String actualHrefAttributeValue = forgotPasswordLink.getAttribute("href");
        String expectedHrefAttributeValue = "forgot_password=yes";
        System.out.println("expectedHrefAttributeValue = " + expectedHrefAttributeValue);
        System.out.println("actualHrefAttributeValue = " + actualHrefAttributeValue);
        if (actualHrefAttributeValue.contains(expectedHrefAttributeValue)) {
            System.out.println("href attribute’s value verification PASSED!");
        }
        else {System.out.println("href attribute’s value verification FAILED!!!");}

     driver.close();


    }
}
