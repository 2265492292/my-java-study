package com.itheima.d2_polymorphism2;

public class Cat extends Animal {
    String name ="Cat名称";
    public void catchFish(){
        System.out.println("🐱抓鱼");
    }
    @Override
    public void cry(){
        System.out.println("🐱喵喵喵~~~");
    }
}
