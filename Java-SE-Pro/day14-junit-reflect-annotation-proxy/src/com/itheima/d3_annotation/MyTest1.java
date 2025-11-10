package com.itheima.d3_annotation;

//自定义注解
public @interface MyTest1 {
    String name();
    double money() default 100;
    String[] authors();
}