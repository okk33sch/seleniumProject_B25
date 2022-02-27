package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_BasicNavigation {

    public static void main(String[] args) {

        // set up chrome and crate WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // navigate.to(url)
        // driver.get(url) // shorter wayy
        driver.get("https://google.com");
        // navigate.back()
        driver.navigate().back();
        // navigate.forward()
        driver.navigate().forward();
        // navigate.refresh()
       driver.navigate().refresh();




    }
}
