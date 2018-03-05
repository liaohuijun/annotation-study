package com.github.liaohuijun.annotation.study.demo3.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * <p>Description: 注解学习01，小水果Annotation</p>
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年2月17日
 */
@Target(ElementType.TYPE)//放在class头顶的注解
@Retention(RetentionPolicy.RUNTIME)//此注解在运行时可以通过反射机制获取
@Documented//生成文档
@Inherited//注解的继承性
public @interface Fruit {
	//水果名
	public String name() default "";
	//水果水分值
	public String value() default "";
	//水果价格
	public int price();
	//是不是瓜类
	public boolean isMelon() default false; 
	
	//水果所属的类型(测试Enum)
	public enum FruitType{WATERMELON,APPLE,ORANGE,OTHER};  
	public FruitType fruitType()default FruitType.OTHER;
}
