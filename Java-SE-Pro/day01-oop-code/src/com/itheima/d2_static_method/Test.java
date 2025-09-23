package com.itheima.d2_static_method;

public class Test {
    public static void main(String[] args) {
        //目标：理解静态方法（类方法  ）还有实例方法的使用
        //1.类名.静态方法(类方法）
        Student.printHelloWorld();
        //2.对象名.静态方法(类方法)
        Student s1 =new Student();
        s1.printHelloWorld();
        //3.对象名.实例方法
        Student s2 =new Student();
        s2.score=100;
        s2.printPass();
//        Student.printPass;//报错
    }
}
