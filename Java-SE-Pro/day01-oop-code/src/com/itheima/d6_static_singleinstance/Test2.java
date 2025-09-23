package com.itheima.d6_static_singleinstance;

public class Test2 {
    public static void main(String[] args) {
        //目标：实现单例设计模式：懒汉式单例：拿对象时，再创建对象
        //单例：确保一个类只有一个对象
        B b1 = B.getInstance();
        B b2 = B.getInstance();
        System.out.println(b1);
        System.out.println(b2);
    }
}
