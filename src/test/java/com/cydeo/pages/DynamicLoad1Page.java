package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad1Page {

public void DynamicLoad1Page(){

  PageFactory.initElements(Driver.getDriver(), this);
  }

@FindBy(id="start")
public WebElement startButton;

  @FindBy(css = "div#loading")
  public WebElement loadingBar;


    @FindBy(css = "#username")
    public WebElement inputUserName;

    @FindBy(css = "#pwd")
    public WebElement inputPassWord;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

  @FindBy(id="flash")
  public WebElement errorMessage;





}
