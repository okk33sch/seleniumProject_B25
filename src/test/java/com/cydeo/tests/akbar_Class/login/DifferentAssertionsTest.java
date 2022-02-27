package com.cydeo.tests.akbar_Class.login;

import org.testng.Assert;
import org.testng.annotations.Test;

//import static org.testng.Assert.assertEquals;

public class DifferentAssertionsTest {

    @Test
    public void test1(){
        //assertEquals(2,2);
        //Assert.assertEquals(2,3);
        Assert.assertEquals(2,2,"my number did not match");
        //Assert.assertEquals("selenium", "java", "selenium is not java");
        Assert.assertNotEquals(2,3);
        Assert.assertTrue(3 > 2);
        //Assert.assertTrue(3 > 21, "are you sure");
        Assert.assertFalse(3 > 21);

        String str1 = null;
        Assert.assertNull(str1);

        String str2 = "testNG";
        Assert.assertNotNull(str2);


    }
}
