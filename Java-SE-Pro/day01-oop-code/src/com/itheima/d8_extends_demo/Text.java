package com.itheima.d8_extends_demo;

public class Text {
    public static void main(String[] args) {
        //了解继承的优点
        Teacher t=new Teacher();
        t.setName("播妞");
        t.setSkill("程序员鼓励师，哄程序员加班");
        System.out.println(t.getName());
        System.out.println(t.getSkill());
    }
}
