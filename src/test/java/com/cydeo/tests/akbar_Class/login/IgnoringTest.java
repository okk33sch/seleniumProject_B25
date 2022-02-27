package com.cydeo.tests.akbar_Class.login;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IgnoringTest {


    @Test(enabled = false)
    public void test1(){
        System.out.println("test1 is running");
    }

    @Ignore
    @Test
    public void test2(){
        System.out.println("test2 is running");
    }

    @Test
    public void test3(){
        System.out.println("test3 is running");
    }

}
