package com.itheima.d8_interface;
//接口
public interface A {
    //1.常量：接口中定义常量可以省略public static final 不写，默认会加上
//    public static final String SCHOOL_NAME ="黑马程序员";
    String SCHOOL_NAME ="黑马程序员";

    //2.抽象方法:接口中定义抽象方法可以省略public abstract不写，默认会加上
//    public abstract void run();
    void run();
    void go();
}
