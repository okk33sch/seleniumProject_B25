package com.cydeo.tests.nextBase;

import com.cydeo.utilities.NextBaseCrm;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class US_4 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void optionsProfile(){
        NextBaseCrm.logincrm(driver);
        driver.findElement(By.xpath("//span[@class='user-img user-default-avatar']")).click();
        List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@class,'menu-popup-no-icon')]"));//*

        List<String>expectedTitles=new ArrayList<>(Arrays.asList("My Profile","Edit Profile Settings","Themes" ,"Configure notifications","Log out"));
        List<String> actualTitles =new ArrayList<>();

        for (WebElement each : elements) {
            actualTitles.add(each.getText());
        }
        System.out.println("actualTitles = " + actualTitles);
        System.out.println("expectedTitles = " + expectedTitles);
        Assert.assertEquals(actualTitles,expectedTitles);
        driver.close();
    }
}