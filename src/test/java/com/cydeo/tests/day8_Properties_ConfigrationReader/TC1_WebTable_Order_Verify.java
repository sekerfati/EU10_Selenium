package com.cydeo.tests.day8_Properties_ConfigrationReader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC1_WebTable_Order_Verify {


    public WebDriver driver ;

 @BeforeMethod
 public void setUpMethod(){
     driver = WebDriverFactory.getDriver("Chrome");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     //TC #1: Web table practice
//1. Go to: https://practice.cydeo.com/web-tables
     driver.get("https://practice.cydeo.com/web-tables");


 }


@Test
    public void order_name_verify_test(){





//2. Verify Bob’s name is listed as expected.
//Expected: “Bob Martin”
    // locate the cell that has “Bob Martin” text in it:
    // alternative locator for “Bob Martin” cell: //td[text()='Bob Martin']/../td[5]
    WebElement bobMartinCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[text()='Bob Martin']"));
    String expectedText="Bob Martin";
    String actualText = bobMartinCell.getText();
    System.out.println("expectedText = " + expectedText);
    System.out.println("actualText = " + actualText);
    //Assert.assertTrue(actualText.equals(expectedText));
    Assert.assertEquals(actualText, expectedText);


//3. Verify Bob Martin’s order date is as expected
//Expected: 12/31/2021
    WebElement orderDateCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[text()='Bob Martin']/following-sibling::td[3]"));
    String expectedOrderDate="12/31/2021";
    String actualOrderDate=orderDateCell.getText();
    System.out.println("expectedOrderDate = " + expectedOrderDate);
    System.out.println("actualOrderDate = " + actualOrderDate);
   //Assert.assertEquals(actualOrderDate, expectedOrderDate);
    Assert.assertTrue(actualOrderDate.equals(expectedOrderDate));



}



// we use the utility method that we created :
@Test
public void test2(){
    String customerOrderDate1 = WebTableUtils.returnOrderDate(driver, "Alexandra Gray");
    System.out.println("customerOrderDate1 = " + customerOrderDate1);

    String customerOrderDate2 = WebTableUtils.returnOrderDate(driver, "John Doe");
    System.out.println("customerOrderDate2 = " + customerOrderDate2);

}





// using WebTableUtils.orderVerify() Method:
@Test
public void test3(){
 WebTableUtils.orderVerify(driver, "Bart Fisher", "01/16/2021");


}




//@AfterMethod
   // public void tearDown(){
   //  driver.close();
}





