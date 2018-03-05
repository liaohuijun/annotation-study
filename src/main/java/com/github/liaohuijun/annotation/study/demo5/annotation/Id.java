package com.github.liaohuijun.annotation.study.demo5.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 标识数据库字段的ID  
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年2月17日
 */
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.FIELD)  
public @interface Id {	  
	    /** 
	     * ID的名称 
	     * @return 
	     */  
	    String value();  
}
