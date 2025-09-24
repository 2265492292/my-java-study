package com.itheima.d12_interface_jdk8;

public class Test {
    public static void main(String[] args) {
        //目标：学习JDK 8开始 接口新增的三种方法
        B b =new B();
        b.run();

        A.inAddr();
//        B.inAddr();//报错
    }
}
