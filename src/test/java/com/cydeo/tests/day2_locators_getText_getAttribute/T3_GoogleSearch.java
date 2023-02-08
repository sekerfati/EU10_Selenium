package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {


        //TC#3: Google search
        //1- Open a Chrome browser:
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();



        //2- Go to: https://google.com
        // driver.navigate("https://www.google.com/");
        driver.get("https://www.google.com/search?q=");
       driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();

        //3- Write “apple” in search box
        //4- PRESS ENTER using Keys.ENTER
        WebElement googleSearchBox= driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple" + Keys.ENTER);



        //5- Verify title:
        //Expected: Title should start with “apple” word
        String expectedTitle="apple";
        String actualTitle=driver.getTitle();
        if (actualTitle.startsWith(expectedTitle)) {
            System.out.println("Title verification PASSED!");
        }
        else {System.out.println("Title verification FAILED!!!");}






    }
}
