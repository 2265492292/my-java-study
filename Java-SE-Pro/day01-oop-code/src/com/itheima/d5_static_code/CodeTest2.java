package com.itheima.d5_static_code;

public class CodeTest2 {
    //实例代码块，属于类，类加载时执行一次，在构造器之前执行
    //完成实例变量的初始化
    {
        System.out.println("===实例代码块执行了一次===");
    }
    public CodeTest2(){
        System.out.println("=====构造器执行了一次=====");
    }
    public static void main(String[] args) {
        //学习实例代码块的作用和应用场景
        new CodeTest2();
    }
}
