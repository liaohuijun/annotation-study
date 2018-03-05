package com.github.liaohuijun.annotation.study.demo4;

import java.lang.annotation.*;
/**
 * Description: class annotation（类注解定义）
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年2月17日
 */
@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.TYPE) 
public @interface MyClassAnnotation 
{
    String uri();
    String desc();
}