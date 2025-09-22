package com.itheima02;

/*
    学生类
 */
public class Student {
    //成员变量
    private String name;
    //    int age;
    private int age;

//    public void setAge(int a){

    /// /        age=a;
//        if (a<0||a>120){
//            System.out.println("你给的年龄有误");
//        }else {
//            age=a;
//        }
//    }
    public void setAge(int age) {
        this.age = age;
    }
//    public void setName(String n) {
//        name=n;
//    }

    public void setName(String name) {
//        name=name;
        this.name = name;
    }
    //成员方法
    public void study() {
        System.out.println("好好学习");
    }

    public int  getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void doHomework() {
        System.out.println("多做练习");
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}