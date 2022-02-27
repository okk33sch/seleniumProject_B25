package com.cydeo.tests.akbar_Class.login;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BeforeSuiteAfterSuiteBeforeTestAfterTest {

    @BeforeSuite
    public void setupSuite(){
        System.out.println("@BeforeSuite RUN ONCE BEFORE ENTIRE SUITE");
    }

    @BeforeTest
    public void setupTestSet(){
        System.out.println("@BeforeTest RUN ONCE BEFORE EACH TEST SET IN suite xml file");
    }

    @AfterTest
    public void teardownTestSet(){
        System.out.println("@AfterTest RUN ONCE AFTER ENTIRE SUITE IN suite xml file");
    }

    @AfterSuite
    public void teardownSuite(){
        System.out.println("@AfterSuite RUN ONCE AFTER ENTIRE SUITE");
    }
}
