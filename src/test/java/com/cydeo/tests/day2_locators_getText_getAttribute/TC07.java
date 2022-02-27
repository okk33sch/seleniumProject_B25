package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC07 {
    public static void main(String[] args) throws InterruptedException {
        // TC:7 As a user I should be able to see User is John Doe

        //1-open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //2-goto https://vytrack.com/
        driver.get("https://vytrack.com");
        //3-click Login label
        driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
        //4-enter username "User1"
        driver.findElement(By.xpath("//input[@class='span2']")).sendKeys("User1");
        //5-enter password "UserUser123"
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("UserUser123");
        //6-click LOG IN
        driver.findElement(By.xpath("//button[@id='_submit']")).click();
        //7-verify the user John Doe
        WebElement userName = driver.findElement(By.xpath("//*[@id=\"user-menu\"]/a"));

        System.out.println("userName = " + userName.getText());
        Thread.sleep(3000);
        driver.close();
    }
}