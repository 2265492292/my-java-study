package com.itheima.d1_static_field;

/// static_field静态字段

public class Test {
    public static void main(String[] args) {
        /// 目标:理解static修饰成员变量的用法
        /// 静态变量也叫类变量
        /// 1.类名.静态变量(推荐)
        Student.name = "袁华";
        ///对象.静态变量(不推荐)
        Student s1 = new Student();
        s1.name = "马冬梅";
        ///对象.静态变量(不推荐)
        Student s2 = new Student();
        s2.name = "秋雅";
        System.out.println(s1.name);//秋雅

        /// 2.对象.实例变量
//        Student.age;//报错
        s1.age=23;
        s2.age=18;
        System.out.println(s1.age);
    }
}
