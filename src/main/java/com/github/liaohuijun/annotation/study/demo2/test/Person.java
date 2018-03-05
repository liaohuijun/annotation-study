package com.github.liaohuijun.annotation.study.demo2.test;

public interface Person {

	public String name();
	
	public int age();
	
	/**@deprecated 表示过时的方法*/
	@Deprecated
	public void sing();
}
