package com.cydeo.tests.day3_CSSSelectorAndXpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1_Locators_getText {
    public static void main(String[] args) {

        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a Chrome browser
        //  WebDriverManager.chromedriver().setup();
       // WebDriver driver=new ChromeDriver();
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();



        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
       // driver.navigate().to("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        WebElement inputUsername = driver.findElement(By.className("login-inp"));
        inputUsername.sendKeys("incorrect");

        //4- Enter incorrect password: “incorrect”
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

        //5- Click to login button.
        WebElement logInbutton = driver.findElement(By.className("login-btn"));
        logInbutton.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        String expectedMessage = "Incorrect login or password";
        WebElement errorMessage = driver.findElement(By.className("errortext"));
        String actualMessage =errorMessage.getText();
        System.out.println("expectedMessage = " + expectedMessage);
        System.out.println("actualMessage = " + actualMessage);
        if (actualMessage.equals(expectedMessage)){
            System.out.println("Error message verification PASSED");
        }
        else {System.out.println("Error message verification FAILED");}

        driver.close();




    }
}
