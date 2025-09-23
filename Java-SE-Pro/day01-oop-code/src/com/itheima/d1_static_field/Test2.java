package com.itheima.d1_static_field;
/// static_field静态字段
public class Test2 {
    public static void main(String[] args){
        //目标：搞清楚static修饰成员变量的应用场景
        new User();
        new User();
        new User();
        System.out.println("创建了几个变量："+User.number);
    }
}
