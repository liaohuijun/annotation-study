package com.github.liaohuijun.annotation.study.demo1.mytest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年2月17日
 */
// 反射注解
public class MyTestRunner2 {
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
        //反射解析注解的属性
        Class claz = DBCRUD.class;

        Method[] methods = claz.getMethods();

        for(Method m:methods){
            //从该方法上获取MyTest注解
            MyTest mt = m.getAnnotation(MyTest.class);
            if(mt!=null){
                //得到注解中的属性
                long out = mt.timeout();
                long start = System.nanoTime();
                m.invoke(claz.newInstance(), null);
                long end = System.nanoTime();
                if((end-start)>out)
                {
                    System.out.println("运行超时");
                }
            }

        }
    }
}
