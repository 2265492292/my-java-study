package com.itheima.d2_static_method;

public class Student {
    double score;

    //    静态方法：有static修饰，属于类持有，建议用类名访问，也可以用对象名访问
    public static void printHelloWorld() {
        for (int i = 0; i < 3; i++) {
            System.out.println("HelloWorld");
        }
    }

    public void printPass() {
        System.out.println(score >= 60 ? "通过" : "挂科");
    }
}
