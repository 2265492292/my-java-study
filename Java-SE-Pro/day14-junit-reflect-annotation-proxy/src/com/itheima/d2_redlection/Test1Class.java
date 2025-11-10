package com.itheima.d2_redlection;
/**
 * 目标：获取Class对象
 */

public class Test1Class {
    public static void main(String[] args) throws ClassNotFoundException {
        //目标：反射第一步：获取Class对象
        //1. 获取Class对象方式一：类名.class
        Class c1 = Student.class;
        System.out.println(c1);

        //方式二：Class.forName("全类名")
        Class c2 = Class.forName("com.itheima.d2_redlection.Student");
        System.out.println(c2);

        //方式三：对象.getClass()
        Student s = new Student();
        Class c3 = s.getClass();
        System.out.println(c3);

        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
    }
}
