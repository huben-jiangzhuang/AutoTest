package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThread {
    @Test
    public void test1(){
        System.out.println(Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.println(Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.println(Thread.currentThread().getId());
    }
}
