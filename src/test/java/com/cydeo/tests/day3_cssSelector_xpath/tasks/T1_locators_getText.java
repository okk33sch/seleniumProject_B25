package com.cydeo.tests.day3_cssSelector_xpath.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {
    public static void main(String[] args) {

        // TC #1: NextBaseCRM, locators and getText() practice
        // 1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2- Go to: https://login1.nextbasecrm.com/
        driver.navigate().to("https://login1.nextbasecrm.com/");

        // 3- Enter incorrect username: “incorrect”
        //driver.findElement(By.className("login-inp")).sendKeys("incorrect");
        WebElement usernameInput = driver.findElement(By.className("login-inp"));
        usernameInput.sendKeys("incorrect");

        // 4- Enter incorrect password: “incorrect”
        WebElement usernamePassword = driver.findElement(By.name("USER_PASSWORD"));
        usernamePassword.sendKeys("incorrect");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 5- Click to login button.
        driver.findElement(By.className("login-btn")).click();


        // 6- Verify error message text is as expected:
        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();

        if (actualErrorMessage.equals(expectedErrorMessage)) {
            System.out.println("Error message verification PASSED!");
        } else {
            System.err.println("Error message verification FAILED!!!");
        }

        System.out.println(actualErrorMessage);

        driver.close();

        // Expected: Incorrect login or password
        // PS: Inspect and decide which locator you should be using to locate web elements.


    }
}
