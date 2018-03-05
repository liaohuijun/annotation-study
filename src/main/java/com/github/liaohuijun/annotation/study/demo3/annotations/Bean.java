package com.github.liaohuijun.annotation.study.demo3.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * <p>Description: 声明这是一个bean</p>
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年2月17日
 */
@Inherited//注解可以被继承
@Documented//文档化
@Retention(RetentionPolicy.RUNTIME)//可以被反射获取
@Target(ElementType.TYPE)//注解在类头顶的类型
public @interface Bean {
	String value() default"This is a JavaBean";
}
