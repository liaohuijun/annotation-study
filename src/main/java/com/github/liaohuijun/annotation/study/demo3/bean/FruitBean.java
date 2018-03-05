package com.github.liaohuijun.annotation.study.demo3.bean;

import com.github.liaohuijun.annotation.study.demo3.annotations.Bean;
import com.github.liaohuijun.annotation.study.demo3.annotations.Fruit;
import com.github.liaohuijun.annotation.study.demo3.annotations.Fruit.FruitType;

@Fruit(isMelon=true,name="WaterMelon",price=10,fruitType=FruitType.WATERMELON)
@Bean("This is a Fruit JavaBean!!")
public class FruitBean {}
