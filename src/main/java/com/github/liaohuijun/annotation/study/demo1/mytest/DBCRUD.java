package com.github.liaohuijun.annotation.study.demo1.mytest;

/**
 * 
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年2月17日
 */
public class DBCRUD {

    @MyTest(timeout=1000000)
    public void addTest()
    {
        System.out.println("addTest方法执行了");
    }

    @MyTest
    public void updateTest()
    {
        System.out.println("updateTest方法执行了");
    }

}
