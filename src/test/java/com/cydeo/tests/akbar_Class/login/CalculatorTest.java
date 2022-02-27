package com.cydeo.tests.akbar_Class.login;

import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest {

    @BeforeClass
    public void initialization(){
        System.out.println("@BeforeClass Run once before all tests");
    }

    @BeforeMethod
    public void setup(){
        System.out.println("@BeforeMethod Run once before each test");
    }

    @Test
    public void testOnePlusFive(){
        Assert.assertEquals(1+5,6);
        System.out.println("TEST 1 IS RUNNING");
    }

    @Test
    public void test10Minus4(){
        Assert.assertEquals(10-4,6);
        System.out.println("TEST 2 IS RUNNING");
    }

    @AfterMethod
    public void teardown(){
        System.out.println("@AfterMethod Run once after each test");
    }

    @AfterClass
    public void cleanup(){
        System.out.println("@AfterClass Run once after all test");
    }



}
