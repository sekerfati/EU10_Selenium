package com.cydeo.tests.day13_Review_And_Practices;

import com.cydeo.pages.DoubleClickPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_DoubleClick {
    @Test
    public void TC1_Double_Click_test(){
//TC #1: Double Click Test
//1. Go to
//https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
 Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
 Driver.getDriver().findElement(By.id("accept-choices")).click();



//2. Switch to iframe.
     Driver.getDriver().switchTo().frame("iframeResult");


//3. Double-click on the text “Double-click me to change my text color.”
        DoubleClickPage doubleClickPage=new DoubleClickPage();
       Actions actions=new Actions(Driver.getDriver());
       actions.doubleClick(doubleClickPage.textToDoubleClick).perform();



//4. Assert: Text’s “style” attribute value contains “red”.
//NOTE: FOLLOW POM

       String actualStyleAttributeValue=doubleClickPage.textToDoubleClick.getAttribute("style");
       String expectedStyleAttributeValue="red" ;
       Assert.assertTrue(actualStyleAttributeValue.contains(expectedStyleAttributeValue));








    }



}
