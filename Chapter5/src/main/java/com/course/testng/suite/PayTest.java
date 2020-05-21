package com.course.testng.suite;

import org.testng.annotations.*;

public class PayTest {
    @Test
    public void paySuccess(){
        System.out.println("payTest");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass");
    }
    @BeforeMethod
    public void beforePaySuccess(){
        System.out.println("beforeMethod");
    }
    @AfterMethod
    public void afterPaySuccess(){
        System.out.println("afterMethod");
    }


}
