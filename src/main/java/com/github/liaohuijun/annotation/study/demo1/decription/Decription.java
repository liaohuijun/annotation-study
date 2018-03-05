package com.github.liaohuijun.annotation.study.demo1.decription;


import java.lang.annotation.*;

/**
 * 
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年2月17日
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME) // 也被称为元注解
@Inherited
@Documented
public @interface Decription {
    String id();
    String decription() default "我是默认值";
}

