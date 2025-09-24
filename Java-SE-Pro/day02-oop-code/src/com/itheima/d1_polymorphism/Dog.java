package com.itheima.d1_polymorphism;

public class Dog extends Animal{
    String name ="Dog名称";
    @Override
    public void cry(){
        System.out.println("🐕汪汪汪~~~");
    }
}
