package com.course.testng;

import org.testng.annotations.Test;

public class ExpectException {
    /**
     * 当测试的预期结果就是异常时
     */
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExpectionFailed(){
        System.out.println("这是个异常,执行失败");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExpectionSucccess(){
        System.out.println("这是个异常，执行成功");
        throw new RuntimeException();
    }
}
