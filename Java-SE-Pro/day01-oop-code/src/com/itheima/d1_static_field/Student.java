package com.itheima.d1_static_field;
/// static_field静态字段
public class Student {
    //静态变量(类变量):有static修饰，属于类持有的变量，在内存中唯一一份，所有对象都共享。
    static String name;
    //实例变量:没有static修饰，属于对象实例的变量，每个对象实例有自己一份。
    int age;
}
