package com.itheima.d2_polymorphism2;

public class Dog extends Animal {
    String name ="Dog名称";
    public void lookDoor(){
        System.out.println("🐕看门");
    }
    @Override
    public void cry(){
        System.out.println("🐕汪汪汪~~~");
    }
}
