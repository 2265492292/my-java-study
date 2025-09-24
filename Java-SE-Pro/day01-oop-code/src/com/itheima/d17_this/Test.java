package com.itheima.d17_this;

public class Test {
    //目标：掌握this调用兄弟构造器的作用
    public static void main(String[] args) {
        //1.创建对象封装数据
        Student s1 = new Student("孙悟空", 500, "三星洞");
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getSchoolName());

        //需求：只要不给学校，默认黑马
        //注意事项：
        //this(...)super(...)不能同时出现，且必须在构造器的第一行！
        //super()会访问父类构造器，this()访问兄弟构造器之后也会访问一次父类构造器
        Student s2 = new Student("孙悟空", 500);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getSchoolName());
    }
}
