package com.github.liaohuijun.annotation.study.demo1.decription;

/**
 * 
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年2月17日
 */
@Decription(id = "我是类id",decription = "我是类注释")
public class Active {
    private String name;

    public String getName(){
        return name;
    }

    @Decription(id = "我是方法id",decription = "我是方法注释")
    public void setName(String name){
        this.name = name;
    }
}
