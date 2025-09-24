package com.itheima.d5_abstract;
//抽象类：使用abstact修饰的
public abstract class A {
    //抽象方法：absract修饰，只能有方法签名，没有方法体
    public abstract void go();

    //和普通类的特性一样，拥有成员变量、方法，构造器
    private String name;
    private int age;

    public A() {
    }

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}