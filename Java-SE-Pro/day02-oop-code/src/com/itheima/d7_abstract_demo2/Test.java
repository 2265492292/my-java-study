package com.itheima.d7_abstract_demo2;

public class Test {
    public static void main(String[] args) {
        //目标：完成学生和老师写作文的功能
        //写作文的步骤和架构是统一的：
        People s=new Teacher();
        s.write();
    }
}
