package com.cydeo.tests.day4_FindElements_CheckBox__RadioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1_2_cssSelector_Practice {
    public static void main(String[] args) {
    //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        //driver.get("https://practice.cydeo.com/forgot_password");
        driver.navigate().to("https://practice.cydeo.com/forgot_password");


        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        // locate homeLink using cssSelector class attribute:
        WebElement homeLink_ex1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        // locate homeLink using cssSelector class attribute: syntax #2:
        WebElement homeLink_ex2 = driver.findElement(By.cssSelector(".nav-link"));
        // locate homeLink using cssSelector href attribute:
        WebElement homeLink_ex3 =driver.findElement(By.cssSelector("a[href='/']"));



        //b. “Forgot password” header
        //Locate header using cssSelector: Locate parent element and move down to child(h2)
        WebElement header_ex1= driver.findElement(By.cssSelector("div.example >h2"));
        //Locate header using xpath with using text:
        WebElement header_ex2= driver.findElement(By.xpath("//h2[text()='Forgot Password']"));



        //c. “E-mail” text:
        // locating e-mail text element with xpath using for attribute:
        WebElement emailLabel= driver.findElement(By.xpath("//label[@for='email']"));


        //d. E-mail input box
        // locating E-mail input box element with xpath using name attribute:
        WebElement emailInputBox_ex1 = driver.findElement(By.xpath("//input[@name='email']"));
        // locating E-mail input box element with xpath using type attribute:
        WebElement emailInputBox_ex2 = driver.findElement(By.xpath("//input[@type='text']"));
       // locating E-mail input box element with xpath using pattern attribute:
        WebElement emailInputBox_ex3 = driver.findElement(By.xpath("//input[@pattern='[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$']"));



        //e. “Retrieve password” button
        // locating “Retrieve password” button using xpath with id attribute:
        WebElement retrievePasswordButton_ex1 = driver.findElement(By.xpath("//button[@id='form_submit']"));
        // locating “Retrieve password” button using xpath with class attribute:
        WebElement retrievePasswordButton_ex2 = driver.findElement(By.xpath("//button[@class='radius']"));
        // locating “Retrieve password” button using xpath with type attribute:
        WebElement retrievePasswordButton_ex3 = driver.findElement(By.xpath("//button[@type='submit']"));




        //f. “Powered by Cydeo text"
        // locating “Powered by Cydeo text" using xpath with style attribute:
        WebElement powerByText_ex1 = driver.findElement(By.xpath("//div[@style='text-align: center;']"));



        //4. Verify all web elements are displayed.
        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("emailInputBox_ex1.isDisplayed() = " + emailInputBox_ex1.isDisplayed());
        System.out.println("retrievePasswordButton_ex1.isDisplayed() = " + retrievePasswordButton_ex1.isDisplayed());
        System.out.println("powerByText_ex1.isDisplayed() = " + powerByText_ex1.isDisplayed());

        // close the tab:
        driver.close();



    }
}
