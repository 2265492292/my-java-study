package com.itheima.d1_static_field;
/// static_field静态字段
public class User {
    public static int number;//静态变量，只有一份，可以被共享

    public User(){
//        User.number++;
//        访问当前类中的静态变量，可以省略类名不写;
        number++;
    }
}
