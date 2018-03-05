package com.github.liaohuijun.annotation.study.demo3.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

import com.github.liaohuijun.annotation.study.demo3.annotations.Bean;
import com.github.liaohuijun.annotation.study.demo3.annotations.Fruit;
import com.github.liaohuijun.annotation.study.demo3.annotations.SetString;
import com.github.liaohuijun.annotation.study.demo3.bean.FruitBean;
import com.github.liaohuijun.annotation.study.demo3.bean.FruitChild;
import com.github.liaohuijun.annotation.study.demo3.bean.User;


public class TestClass {
	//-----------------------利用Fruit注解测试的方法Start-------------------//
	/**
	 * <p>Description:测试注解在类头顶上的Annotation<p/>
	 */
	@Test
	public void testFruit(){
		FruitBean fruit = new FruitBean();
		//通过类反射获得注解
		Fruit fruitAnnotation = fruit.getClass().getAnnotation(Fruit.class);
		Bean beanAnnotation = fruit.getClass().getAnnotation(Bean.class); 
		//可以把反射得到的注解，将其方法进行调用
		if(fruitAnnotation!=null){
			//如果@Bean起作用了，那么这行会输出This is a JavaBean
			if(beanAnnotation!=null)
			System.out.println(beanAnnotation.value());
			
			System.out.println(fruitAnnotation.isMelon());
			System.out.println(fruitAnnotation.price());
			System.out.println(fruitAnnotation.annotationType());
			System.out.println(fruitAnnotation.name());
			System.out.println(fruitAnnotation.fruitType());
		}
	}
	
	
	/**
	 * <p>Description:这个测试表明，@Inherited注解是可以延迟继承性的<p/>
	 */
	@Test
	public void testExtends(){
		FruitChild extendsbean = new FruitChild();
		//通过类反射获得注解
		Fruit fruitAnnotation = extendsbean.getClass().getAnnotation(Fruit.class);
		//可以把反射得到的注解，将其方法进行调用
		System.out.println("没错，这个类被"+Fruit.class.getSimpleName()+"所注解了,他是一个水果类");
		System.out.println(fruitAnnotation.isMelon());
		System.out.println(fruitAnnotation.price());
		System.out.println(fruitAnnotation.annotationType());
		System.out.println(fruitAnnotation.name());
		System.out.println(fruitAnnotation.fruitType());
	}
	
	//-----------------------利用Fruit注解测试的方法END-----------------------//
	
	
	
	//-----------------------测试使用SetString注解对User注入属性Start----------------//
	@Test
	public void testUser() throws Exception{
		//反射获取当前名称表示的类
		Class<?> clazz = Class.forName("com.github.liaohuijun.annotation.study.demo3.bean.User");
		User user  = (User) clazz.newInstance();
		
		//得到该类的所有字段
		Field[] fields = clazz.getDeclaredFields();
		//遍历所有字段，找出字段头上是否有相应注解的字段
		for(Field f:fields){
			//测试是否能得到字段的名称
			//System.out.println(f.getName());
			SetString annotation = f.getAnnotation(SetString.class);
			//如果找到了字段头上有相应的注解
			if(annotation!=null){
				//暴力一把,把注解上value的值设置到相应的字段上
				f.setAccessible(true);
				f.set(user,annotation.value());
			}
		}
		
		//查找是否有方法头顶上是否有相应的注解
		Method[] methods = clazz.getDeclaredMethods();
		for(Method m:methods){
			//System.out.println(m.getName());
			SetString annotation = m.getAnnotation(SetString.class);
			//如果有SetString这个注解，直接传入value的值给方法参数
			if(annotation!=null){
				m.invoke(user,annotation.value());
			}
		}
		System.out.println(user.getUsername()+"|"+user.getPassword());
	}
	
	//-------------------------End--------------------------------------//


	@Test
	public void testNest() throws Exception{
		Class<?> a1 = Class.forName("com.github.liaohuijun.annotation.study.demo3.annotations.Fruit");
		/*Annotation[] as = a1.getAnnotations();
		for(Annotation an:as){
			System.out.println(an.toString());
		}*/
		Annotation a = a1.getAnnotation(Bean.class);
		if(a!=null){
			System.out.println(((Bean) a).value());
		}
	}
}
