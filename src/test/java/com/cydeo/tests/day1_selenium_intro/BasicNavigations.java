package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

//1- set-up browser driver:
        WebDriverManager.chromedriver().setup();


//2- create the instance of selenium Web-driver:
       // this is the line that is opening an empty browser
        WebDriver driver=new ChromeDriver();


// this line will maximize the browser size:
       driver.manage().window().maximize();
       //driver.manage().window().fullscreen(); //for macbook

//3- go to the "https://www.tesla.com"
        driver.get("https://www.tesla.com");

// get the title of the page:
        // System.out.println("driver.getTitle() = " + driver.getTitle());
        String currentTitle=driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);// tesla page title

        // get the current URL:
        String currentURL=driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);




// stops code execution for 3 seconds:
   Thread.sleep(3000);


//4- use selenium to navigate back:
        driver.navigate().back();



// stops code execution for 3 seconds:
        Thread.sleep(3000);

// use selenium to navigate forward:
        driver.navigate().forward();


// stops code execution for 3 seconds:
        Thread.sleep(3000);

//  use selenium to navigate refresh:
        driver.navigate().refresh();


// stops code execution for 3 seconds:
        Thread.sleep(3000);



//  use selenium to navigate() to() method:
    driver.navigate().to("https://www.google.com");

// get the current title after getting google page:
       // System.out.println("driver.getTitle() = " + driver.getTitle());
    currentTitle=driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);  // google page title

// get the current URL:
       currentURL=driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

// this will  close the currently opened tab/browser:
        driver.close();

// this will close all opened windows:
        driver.quit();







    }
}
