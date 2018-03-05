package com.github.liaohuijun.annotation.study.demo1.mytest;

import java.lang.annotation.*;

/**
 * 
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年2月17日
 */
//元注解： 用来注解注解的
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTest {
    long timeout() default Integer.MAX_VALUE;//设置超时时间的
}
