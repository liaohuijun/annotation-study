package com.github.liaohuijun.annotation.study.demo2.test;

public class Test {
	
	/** @SuppressWarnings("deprecation") 忽略过时的警告*/
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		Person person=new Child();
		
		person.sing();
	}
}
