package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

/*
this method will log in with helpdesk1@cybertekschool.com
when called by the user.
 */
public static  void crm_login(WebDriver driver){

//3. Enter valid username
    WebElement inputUserName = driver.findElement(By.xpath("(//input[@class='login-inp'])[1]"));
    inputUserName.sendKeys("helpdesk1@cybertekschool.com");


//4. Enter valid password
    WebElement inputPassWord = driver.findElement(By.xpath("(//input[@class='login-inp'])[2]"));
    inputPassWord.sendKeys("UserUser" );




//5. Click to `Log In` button
    WebElement loginButton =   driver.findElement(By.xpath("//input[@value='Log In']"));
    loginButton.click();






}



public static  void crm_login(WebDriver driver, String userName,  String password){

//3. Enter valid username

        WebElement inputUserName = driver.findElement(By.xpath("(//input[@class='login-inp'])[1]"));
        inputUserName.sendKeys(userName);


//4. Enter valid password
        WebElement inputPassWord = driver.findElement(By.xpath("(//input[@class='login-inp'])[2]"));
        inputPassWord.sendKeys(password );




//5. Click to `Log In` button
        WebElement loginButton =   driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();






    }



}
