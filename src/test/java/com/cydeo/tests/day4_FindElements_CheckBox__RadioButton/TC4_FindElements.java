package com.cydeo.tests.day4_FindElements_CheckBox__RadioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC4_FindElements {
    public static void main(String[] args) {

        //TC #4: FindElements Task
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        // providing extra  waitTime for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/abtest
        //driver.get("https://practice.cydeo.com/abtest");
        driver.navigate().to("https://practice.cydeo.com/abtest");


        //3- Locate all the links in the page.
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));


        //4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size());


        //5- Print out the texts of the links.

        for (WebElement each : allLinks) {
            System.out.println("Text of the link: "+ each.getText());
        }


        //6- Print out the HREF attribute values of the links
        for (WebElement each : allLinks) {
            System.out.println("href Value: "+ each.getAttribute("href"));
        }


  driver.close();




    }
}
