package com.itheima.d6_static_singleinstance;

public class Test {
    public static void main(String[] args) {
        //目标：实现单例设计模式：饿汉式单例：拿对象时，对象已经创建好了
        //单例：确保一个类只有一个对象
        A a1 = A.getInstance();
        A a2 = A.getInstance();
        System.out.println(a1);
        System.out.println(a2);
    }
}
