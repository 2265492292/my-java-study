package com.itheima.d6_static_singleinstance;

/// 饿汉式，拿对象时，对象已经创建好了
public class A {

    //2、定义一个静态变量用于记住类的一个唯一对象（实例）
    private static A a = new A();

    //1、把类的构造器私有化处理
    private A() {
    }

    //3、提供一个静态方法返回这个唯一值
    public static A getInstance() {
        return a;
    }
}
