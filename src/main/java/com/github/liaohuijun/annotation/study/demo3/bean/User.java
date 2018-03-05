package com.github.liaohuijun.annotation.study.demo3.bean;

import com.github.liaohuijun.annotation.study.demo3.annotations.SetString;

public class User {
	//在属性上面注解
	@SetString(value="caizhifa")
	 private String username;
	 private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	
	//在方法上注解
	@SetString("123456")
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
