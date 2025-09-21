package com.itheima.String;

public class StringDemo3 {
    public static void main(String[] args) {
        //理解String的对象是不可变的
        String name = "黑马";
        name += "程序员";
        name += "播妞";
        System.out.println(name);
        //只要是以"xxx"方式创建的字符串对象，会存储的字符串常量池，且相同内容的字符串只存储一份
        String s1="abc";//存进常量池
        String s2="abc";//常量池已存在'abc',s1,s2指向的地址一致
        System.out.println(s1 == s2);
    }
}
