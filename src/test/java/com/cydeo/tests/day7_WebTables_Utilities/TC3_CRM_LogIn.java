package com.cydeo.tests.day7_WebTables_Utilities;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC3_CRM_LogIn extends TestBase {


// we extends the baseClass to inherit.



@Test

    public void crm_login_test(){

//2. Go to : https://login1.nextbasecrm.com/
    driver.get("https://login1.nextbasecrm.com/");

//3. Enter valid username
//USERNAME                             PASSWORD
//helpdesk1@cybertekschool.com         UserUser
//Helpdesk2@cybertekschool.com         UserUser
    WebElement inputUserName = driver.findElement(By.xpath("(//input[@class='login-inp'])[1]"));
    inputUserName.sendKeys("helpdesk1@cybertekschool.com");


//4. Enter valid password
    WebElement inputPassWord = driver.findElement(By.xpath("(//input[@class='login-inp'])[2]"));
    inputPassWord.sendKeys("UserUser" );




//5. Click to `Log In` button
    WebElement loginButton =   driver.findElement(By.xpath("//input[@value='Log In']"));
    loginButton.click();





//6. Verify title is as expected:
//Expected: Portal
    String expectedTitle="Portal";
    String actualTitle= driver.getTitle();
    System.out.println("expectedTitle = " + expectedTitle);
    System.out.println("actualTitle = " + actualTitle);
    BrowserUtils.verifyTitle(driver,"Portal");





}



    @Test
    public void crm_login_test_2(){

//2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

//  calling my utility method to log in helpdesk1
        CRM_Utilities.crm_login(driver);



//6. Verify title is as expected:
//Expected: Portal
        String expectedTitle="Portal";
        String actualTitle= driver.getTitle();
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);
        BrowserUtils.verifyTitle(driver,"Portal");





    }



    @Test
    public void crm_login_test_3(){

//2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

//  calling my utility method to log in helpdesk1
       CRM_Utilities.crm_login(driver, "Helpdesk2@cybertekschool.com", "UserUser");



//6. Verify title is as expected:
//Expected: Portal
        String expectedTitle="Portal";
        String actualTitle= driver.getTitle();
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);
        BrowserUtils.verifyTitle(driver,"Portal");





    }






}
