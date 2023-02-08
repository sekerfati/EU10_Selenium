package com.cydeo.tests.day4_FindElements_CheckBox__RadioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC6_StaleElementReferenceException {
    public static void main(String[] args) {

//TC #6: StaleElementReferenceException Task
//1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


//2- Go to: https://practice.cydeo.com/abtest
        //driver.get("https://practice.cydeo.com/abtest");
        driver.navigate().to("https://practice.cydeo.com/abtest");



//3- Locate “CYDEO” link, verify it is displayed.
        WebElement cydeoLink =  driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));
       // WebElement cydeoLink_ex2=  driver.findElement(By.xpath("//a[text()='CYDEO']"));
       // WebElement cydeoLink_ex3=  driver.findElement(By.xpath("//a[@target='_blank']"));

        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());
        if (cydeoLink.isDisplayed()){
            System.out.println("CYDEO” link verification PASSED ");
        }
        else {System.out.println("CYDEO” link verification FAILED ");}

//4- Refresh the page.
        driver.navigate().refresh();

//5- Verify it is displayed, again.
       // we are refreshing the webElement reference by reassigning (relocating) the webElement
        cydeoLink =  driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));
        if (cydeoLink.isDisplayed()){
            System.out.println("CYDEO” link after refresh verification PASSED ");
        }
        else {System.out.println("CYDEO” link after refresh verification FAILED ");}


        driver.close();









    }
}
