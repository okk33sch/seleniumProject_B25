package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P05_GettingPageSoource_CurrentUrl {
    public static void main(String[] args) {

        // set up chrome and crate WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // navigate to google and print out the current url
        driver.get("https://google.com");

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        // get the page source of html
        System.out.println("driver.getPageSource() = " + driver.getPageSource());

        driver.quit();


    }
}
