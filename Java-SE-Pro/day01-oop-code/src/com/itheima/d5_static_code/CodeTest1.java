package com.itheima.d5_static_code;

import java.util.ArrayList;

public class CodeTest1 {
    public static String schoolName="黑马";
    public static ArrayList<String> names=new ArrayList<>();
    //静态代码块：有static修饰，属于类持有，与类一起优先加载，自动执行一次
//    作用：可以初始化静态变量的数据
    static {
        System.out.println("==static静态代码块执行了==");
        names.add("张麻子");
        names.add("老6");
    }

    public static void main(String[] args) {
//        目标：学习静态代码块的特点，了解其应用场景
        System.out.println("==main方法执行了==");
    }
}
