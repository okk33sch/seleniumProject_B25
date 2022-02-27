package com.cydeo.tests.akbar_Class.login;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name= "myData")
    public Object[][] provideData() {

        return new Object[][]{
                {"Adam"} ,
                {"John"} ,
                {"Mary"} ,
                {"Alice"}
        };
    }

        @Test(dataProvider = "myData")
        public void testMultipleData(String name){

            System.out.println(name);

        }

        @DataProvider(name = "TwoSetOfData")
        public Object[][] provide2Daya(){

            return new Object[][]{
                    {"Adam", 20} ,
                    {"Alice", 25} ,
                    {"Mary", 26}
            };
        }
        @Test(dataProvider = "TwoSetOfData")
        public void testNameAndBatch(String name, int batchNumber){

            System.out.println(name + " is from batch " + batchNumber);
        }

    }