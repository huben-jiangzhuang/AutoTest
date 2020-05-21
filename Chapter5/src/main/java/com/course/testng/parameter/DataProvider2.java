package com.course.testng.parameter;

import com.beust.jcommander.Parameter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProvider2 {
    @Test(dataProvider = "two")
    public void test1(String name ,int age){
        System.out.println("test1方法  name="+name+",age="+age);
    }
    @Test(dataProvider = "two")
    public void test2(String name ,int age){
        System.out.println("test2方法  name="+name+",age="+age);
    }
    @DataProvider(name = "two")
    public Object[][] method(Method method){
        Object[][] result = null;
        if(method.getName().equals("test1")){
            result = new Object[][]{{"lily",12},
                    {"lucy",13}};
            return  result;
        }else if(method.getName().equals("test2")){
            result = new Object[][]{{"tom",22},
                    {"sam",33}};
            return  result;
        }else{
            return result;
        }

    }
}
