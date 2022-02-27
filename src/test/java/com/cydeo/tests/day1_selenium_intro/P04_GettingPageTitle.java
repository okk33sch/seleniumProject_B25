package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P04_GettingPageTitle {

    public static void main(String[] args) {

        // set up chrome and crate WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // navigate to google and get page title form the tab
        //driver.get("https://yahoo.com");
        driver.get("https://google.com");

        String pageTitle = driver.getTitle();
        System.out.println("pageTitle = " + pageTitle);

        if(pageTitle.equals("Google")){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }

        // quit the browser
        driver.quit();


    }
}
