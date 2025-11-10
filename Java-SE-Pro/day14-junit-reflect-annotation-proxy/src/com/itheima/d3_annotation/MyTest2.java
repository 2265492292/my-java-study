package com.itheima.d3_annotation;

/**
 * 自定义注解：value
 */
public @interface MyTest2 {
    String value();

    int age() default 70;
}
