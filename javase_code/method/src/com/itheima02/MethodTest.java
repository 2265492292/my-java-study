package com.itheima02;

public class MethodTest {
    public static void main(String[] args) {
        getMax(10,20);
        int a=10;
        int b=20;
        getMax(a,b);
    }
    public static void getMax(int a,int b){
        if (a>=b){
            System.out.println("较大的数是"+a);
        }else {
            System.out.println("较大的数是"+b);
        }
    }
}
