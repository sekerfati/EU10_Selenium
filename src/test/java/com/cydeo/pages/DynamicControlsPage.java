package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsPage {

    public  DynamicControlsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

 @FindBy(css = "form[id='checkbox-example']> button")
    public WebElement removeButton;

    @FindBy(css="div[id='loading']")
    public WebElement loadingBar;

    @FindBy(css="input[type='checkbox']")
    public WebElement checkBoxElement;

    //@FindBy(xpath="p[@id='message']")
    @FindBy(css="p[id='message']")
    public WebElement itIsGoneMessage;



    @FindBy(xpath="//button[text()='Enable']")
    public WebElement enableButton;



    @FindBy(xpath="//input[@type='text']")
    public WebElement inputBox;

    @FindBy(css="p[id='message']")
    public WebElement enabledMessage;




}
