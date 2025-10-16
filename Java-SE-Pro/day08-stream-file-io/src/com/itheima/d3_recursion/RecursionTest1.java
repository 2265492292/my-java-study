package com.itheima.d3_recursion;

public class RecursionTest1 {
    public static void main(String[] args) {
        //目标：认识递归的形式
        test1();
        test2();
    }
    //直接递归
    public static void test1(){
        System.out.println("test1");
        test1();
    }
    //间接递归
    public static void test2(){
        System.out.println("test2");
        test3();
    }
    public static void test3(){
        test2();
    }
}
