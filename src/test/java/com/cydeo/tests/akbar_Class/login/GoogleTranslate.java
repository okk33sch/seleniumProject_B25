package com.cydeo.tests.akbar_Class.login;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class GoogleTranslate {
    WebDriver driver;
    @BeforeMethod
    public void SetUp() {
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://translate.google.ca/?hl=en&tab=TT");
    }

        @Test
        public void typeTrial(){
            WebElement findTextBox = driver.findElement(By.xpath("//textarea[@class='er8xn']"));
            //Alert alert = driver.switchTo().alert();
            //alert.accept();
            //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            findTextBox.click();
            findTextBox.sendKeys("anananiiyaniata");


        }
    }
