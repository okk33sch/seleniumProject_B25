package com.cydeo.tests.akbar_Class.login;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MakeAppreciation {
    WebDriver driver;
    @BeforeMethod
    public void SetUp(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://login1.nextbasecrm.com/");

    }
    @Test
    public void makeAppreciation() {
        WebElement login = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        login.sendKeys("helpdesk22@cydeo.com");
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("UserUser");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //click More button
        driver.findElement(By.xpath("//span[.='More']")).click();
        //click Appreciation
        driver.findElement(By.xpath("//span[.='Appreciation']")).click();
        //writing message "I appreciate you!"
        //driver.findElement(By.xpath("//body[@contenteditable='true']")).click();
        //WebElement dabis = driver.findElement(By.xpath("//div[@id='bx-html-editor-idPostFormLHE_blogPostForm']"));
        //WebElement dabis = driver.findElement(By.xpath("//body[@contenteditable='true']"));
        //WebElement dabis = driver.switchTo().frame.(driver.findElement(By.xpath("//body[@contenteditable='true']")));
        //driver.switchTo().frame(driver.findElement(By.xpath("//body[@contenteditable='true']")));
        WebElement dabis = driver.findElement(By.xpath("//*[@id='bx-html-editor-ta-cnt-idPostFormLHE_blogPostForm']"));

        dabis.click();
        dabis.sendKeys("I appreciate you!"+ Keys.SPACE + Keys.ENTER);
        //click Send
        driver.findElement(By.xpath("//button[.='Send']")).click();
        String actualText = driver.findElement(By.xpath("//div[@id='blog_post_body_5851']")).getText();
        String expectedText="I appreciate you!";
        Assert.assertEquals(actualText,expectedText);
        driver.close();

    }
}