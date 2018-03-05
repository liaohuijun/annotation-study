package com.github.liaohuijun.annotation.study.demo4;

import java.lang.reflect.*;
/**
 * 译文： 说明：此类用于显示如何使用每个级别的注释。
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年2月17日
 */
@MyClassAnnotation(uri = "com.ross.MySample", desc = "The class name")
public class MySample
{
    @MyFieldAnnotation(uri = "com.ross.MySample#id", desc = "The class field")
    public String id;

    /**
     * Description: default constructor
     */
    @MyConstructorAnnotation(uri = "com.ross.MySample#MySample", desc = "The default constuctor")
    public MySample()
    {
    }

    /**
     * Description: normal method
     */
    @MyMethodAnnotation(uri = "com.ross.MySample#setId", desc = "The class method")
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * Description: MyAnnotation test
     * @throws NoSuchMethodException 
     * @throws SecurityException 
     * @throws NoSuchFieldException 
     */
    public static void main(String[] args) throws SecurityException,
            NoSuchMethodException, NoSuchFieldException
    {
        MySample oMySample = new MySample();
        // get class annotation
        MyClassAnnotation oMyAnnotation = MySample.class
                .getAnnotation(MyClassAnnotation.class);
        System.out.println("Class's uri: " + oMyAnnotation.uri() + "; desc: "
                + oMyAnnotation.desc());

        // get constructor annotation
        Constructor oConstructor = oMySample.getClass().getConstructor();
        MyConstructorAnnotation oMyConstructorAnnotation = (MyConstructorAnnotation) oConstructor
                .getAnnotation(MyConstructorAnnotation.class);
        System.out.println("Constructor's uri: "
                + oMyConstructorAnnotation.uri() + "; desc: "
                + oMyConstructorAnnotation.desc());

        // get method annotation
        Method oMethod = oMySample.getClass().getDeclaredMethod("setId",String.class);
        MyMethodAnnotation oMyMethodAnnotation = oMethod
                .getAnnotation(MyMethodAnnotation.class);
        System.out.println("Method's uri: " + oMyMethodAnnotation.uri()
                + "; desc: " + oMyMethodAnnotation.desc());

        // get field annotation
        Field oField = oMySample.getClass().getDeclaredField("id");
        MyFieldAnnotation oMyFieldAnnotation = oField
                .getAnnotation(MyFieldAnnotation.class);
        System.out.println("Field's uri: " + oMyFieldAnnotation.uri()
                + "; desc: " + oMyFieldAnnotation.desc());

    }

}
