package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test(timeOut = 3000)
    public void ignore1() throws InterruptedException {
        System.out.println(Thread.currentThread().getId());
        Thread.sleep(4000);
    }
    //注解上添加属性enabled = false,不执行
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2");
    }
    @Test(enabled = false)
    public void ignore3(){
        System.out.println("ignore3");
    }
}
