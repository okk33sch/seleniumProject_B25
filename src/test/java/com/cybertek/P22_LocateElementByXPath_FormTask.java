package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P22_LocateElementByXPath_FormTask {

    public static void main(String[] args) {
        // set up chrome driver and open chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // navigate to checkbox page from practice site
        driver.get("http://practice.cybertekschool.com/registration_form");

        // locate elements using xpath and sign up and verify success message

        /**
         * |//h2[ .='Registration form' ]
         * |//h2[ text()='Registration form' ]
         **/
        WebElement header = driver.findElement(By.xpath("h2[.='Registration form' ]"));
        System.out.println("header.isDisplayed() = " + header.isDisplayed());

        /**
         * //div/h2[ text()='Registration form' ]
         * //div[@class='page-header']/h2[ text()='Registration form' ]
         * //form//input[@name='firstname']
         * //form[@id='registrationForm']//input[@name='firstname']
         * //input[@name='firstname']
         * //input[@data-bv-field='firstname']
         * |//input[@data-by-field='firstname' and @placeholders='first name']
         **/
        WebElement firstNameField = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstNameField.sendKeys("Adam");

        /**
         * //input[@name='lastname']
         * //input[@data-by-field='lastname']
         */
        WebElement lastNameField = driver.findElement(By.xpath("//input[@data-by-field='lastname']"));
        lastNameField.sendKeys("John");

        /**
         * //input[@name='username']
         * //input[@data-bv-field='username']
         */
        WebElement userField = driver.findElement(By.xpath("//input[@data-bv-field='username']"));
        userField.sendKeys("cooluser");

        /**
         * //input[@data-bv-field='email']
         */
        WebElement emailField = driver.findElement(By.xpath("//input[@data-bv-field='email']"));
        emailField.sendKeys("cooluser@cydeo.com");

        /**
         * //input[@name='password' and @data-by-field='password']
         */
        WebElement paswordField = driver.findElement(By.xpath("//input[@name='password' and @data-by-field='password']"));
        paswordField.sendKeys("topsecretgoeshere");

         /**
         * //input[@name= 'phone' and @data-by-field='phone
         */
        WebElement phoneField = driver.findElement(By.xpath("//input[@name= 'phone' and @data-by-field='phone']"));
        phoneField.sendKeys("123-123-1212");

         /**
         * //input[@type='radio' and @value='female']
         */
        WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@type='radio' and @value='female']"));
        femaleRadioButton.click();
         /**
         * //input[@name='birthday']
         */
        WebElement birthField = driver.findElement(By.xpath("//input[@name='birthday']"));
        birthField.sendKeys("01/01/2011");
         /**
         * //select[@name='department']
         */
        WebElement depDropdown = driver.findElement(By.xpath("//select[@name='department']"));
        Select depSelectObj = new Select(depDropdown);
        depSelectObj.selectByIndex(1);
         /**
         * //select[@name='job_title']
         */
        WebElement titleDropdown = driver.findElement(By.xpath("//select[@name='job_title']"));
        Select titleSelectObj = new Select(titleDropdown);
        titleSelectObj.selectByIndex(1);

         /**
         * //input[@id='inlineCheckbox1']
        * //input[@type='checkbox' and @value='cplusplus']
        */
        WebElement cplusCheckbox = driver.findElement(By.xpath("//input[@type='checkbox' and @value='cplusplus']"));
        System.out.println("cplusCheckbox.isSelected() = " + cplusCheckbox.isSelected());
        cplusCheckbox.click();
        /**
        * //*[@id='wooden_spoon']
        * //*[@x='wooden_spoon']
        * //button[@type='submit' and text()='Sign up' ]
        */
        WebElement signupButton = driver.findElement(By.xpath("//button[@type='submit' and text()='Sign up' ]"));
        // close the browser
        driver.quit();
    }
}
