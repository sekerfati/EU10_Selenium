package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLogInPage {

// #1- initialize the driver instance and object of the class:

public LibraryLogInPage(){
/*
initElements method will create connection in between the current web driver session
(instance) and the object of the current class.
 */
    PageFactory.initElements(Driver.getDriver(), this);

}

// #2- use @FindBy annotation to locate web elements

@FindBy(xpath = "//input[@id='inputEmail']")
public WebElement inputUserName;

@FindBy(xpath ="//input[@id='inputPassword']")
public WebElement inputPassWord;

@FindBy(xpath = "//button[.='Sign in']")
public WebElement signInButton;


@FindBy(xpath = "//div[.='This field is required.']")
public WebElement fieldRequiredMessage;



@FindBy(xpath = "//div[.='Please enter a valid email address.']")
public WebElement enterValidEMailErrorMessage;


@FindBy(xpath ="//div[.='Sorry, Wrong Email or Password']")
public WebElement invalidEmailOrPassWordMessage;







}
