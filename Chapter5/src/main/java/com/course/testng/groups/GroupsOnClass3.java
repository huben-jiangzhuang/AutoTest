package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "tea")
public class GroupsOnClass3 {
    public void tea1(){
        System.out.println("GroupsOnClass3_tea1");
    }
    public void tea2(){
        System.out.println("GroupsOnClass3_tea2");
    }
}
