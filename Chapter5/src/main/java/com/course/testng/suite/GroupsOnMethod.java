package com.course.testng.suite;

import org.testng.annotations.*;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("server_test1");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("server_test2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("client_test3");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("client_test4");
    }
    @BeforeGroups("client")
    public void beforeGroups(){
        System.out.println("client_beforeGroups");
    }
    @AfterGroups("client")
    public void afterGroups(){
        System.out.println("client_afterGroups");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("beforeSuite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
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
