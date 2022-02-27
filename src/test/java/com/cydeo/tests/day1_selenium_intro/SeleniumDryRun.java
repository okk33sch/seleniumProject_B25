package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDryRun {

    public static void main(String[] args) {

        // "C:\Users\metal\Desktop\chromedriver.exe"
        // System.setProperty("webdriver.chrome.driver", ""\"C:"\"Users"\"metal"\"Desktop"\"chromedriver.exe"\"");

//        // 1. Setup Chrome Driver so selenium can use ut to automate chrome.
//        WebDriverManager.chromedriver().setup();
//        // 2. Crate Chrome Driver Object to open browser.
//        WebDriver driver = new ChromeDriver();
//        // 3. Navigate to https://www.google.com.
//        driver.navigate().to("https://www.google.com");

        // 1. Setup Firefox Driver so selenium can use ut to automate chrome.
        WebDriverManager.firefoxdriver().setup();
        // 2. Crate Firefox Driver Object to open browser.
        WebDriver driver = new FirefoxDriver();
        // 3. Navigate to https://www.google.com in Firefox.
        driver.navigate().to("https://www.google.com");


    }
}