package com.cydeo.tests.akbar_Class.login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GoogleHomePageTest {

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testHomePage() throws InterruptedException {
        driver.get("https://google.com");
        //Thread.sleep(1000);
        // assert the tiitle is Google
        assertEquals(driver.getTitle(), ("Google"));
        //Thread.sleep(1000);
    }

    @Test
    public void testSearch() throws InterruptedException {
        driver.get("https://google.com");
       // Thread.sleep(1000);

        driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);
        //Thread.sleep(1000);


        // assert the title is "selenium -Google search"
        assertEquals(driver.getTitle(),"Selenium - Google Search");
        //Thread.sleep(1000);
    }

    // create a data provider method for google search multiple items
    // verify the expected title according to what we search

    @DataProvider(name = "searchData")
    public Object[][] provideSearchData(){

        return new Object[][]{
                {"selenium", "selenium - Google Search"},
                {"java", "java - Google Search"},
                {"job", "job - Google Search"}
        };
    }

    @Test(dataProvider = "searchData")
    public void searchDataDriven(String keyword, String expectedTitle)throws InterruptedException {
        System.out.println("Search " + keyword + " expected title is "+ expectedTitle);
        // navigate to google
        driver.get("https://google.com");
        //Thread.sleep(1000);

        // search for keyword
        driver.findElement(By.name("q")).sendKeys(keyword + Keys.ENTER);
        //Thread.sleep(1000);

        // assert the title is keyword + " -Google search"
        assertEquals(driver.getTitle(),expectedTitle);
        //Thread.sleep(1000);
    }


    @AfterMethod
    public void cleanup(){
        driver.quit();
    }


}
