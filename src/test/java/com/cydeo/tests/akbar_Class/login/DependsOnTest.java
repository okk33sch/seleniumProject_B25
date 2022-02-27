package com.cydeo.tests.akbar_Class.login;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DependsOnTest {

    @Test
    public void test1(){
        System.out.println("Test1 is running");
        assertEquals(2,2);
    }

    @Test(dependsOnMethods = {"test1"}, alwaysRun = true)
    public void test2(){
        System.out.println("Test2 is running");
    }

    @Test(dependsOnMethods = {"test1", "test2"})
    public void test3(){
        System.out.println("Test3 is running");
    }

}
