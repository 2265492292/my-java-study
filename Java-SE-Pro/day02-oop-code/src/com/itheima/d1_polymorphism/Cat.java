package com.itheima.d1_polymorphism;

public class Cat extends Animal {
    String name ="Cat名称";
    @Override
    public void cry(){
        System.out.println("🐱喵喵喵~~~");
    }
}
