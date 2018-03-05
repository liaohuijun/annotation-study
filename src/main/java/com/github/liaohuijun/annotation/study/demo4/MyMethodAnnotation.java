package com.github.liaohuijun.annotation.study.demo4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * Description: method annotation
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年2月17日
 */
@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.METHOD) 
public @interface MyMethodAnnotation 
{
    String uri();
    String desc();
}
