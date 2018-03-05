package com.github.liaohuijun.annotation.study.demo4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * Description: Constructor annotation （默认构造方法注解定义）
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年2月17日
 */
@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.CONSTRUCTOR) 
public @interface MyConstructorAnnotation 
{
    String uri();
    String desc();
}