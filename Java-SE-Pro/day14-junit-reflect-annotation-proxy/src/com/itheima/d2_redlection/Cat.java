package com.itheima.d2_redlection;

public class Cat {
    public static int a;
    public static final String COUNTRY="中国";
    private String name;
    private int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private void run(){
        System.out.println("🐱跑的好累呀");
    }
    public void eat(){
        System.out.println("🐱吃的好饱呀");
    }
    private String eat(String name){
        return "🐱吃了好多"+name;
    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Cat.a = a;
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

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
