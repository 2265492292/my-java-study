package com.itheima04;

/*
    学生 JavaBean

    成员变量使用private修饰
    提供每一个成员变量的setXxx()/getXxx()
    提供一个无参构造方法
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s=new Student();

        s.setName("林青霞");
        s.setAge(30);

        System.out.println(s.getName() + "," + s.getAge());
    }
}
