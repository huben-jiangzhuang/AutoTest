package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    @Test(dataProvider = "testD")
    public void testDataProvider(String name,int age){
        System.out.println("testDataProvider  name="+name+",age="+age);
    }

    @DataProvider(name = "testD")
    public Object[][] providerData(){
        Object[][] result ={
                {"lily",10},
                {"lucy",20}
        };
        return result;
    }

}
