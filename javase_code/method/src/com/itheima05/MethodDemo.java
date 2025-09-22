package com.itheima05;

//调用方法的时候，java虚拟机会根据参数的不同来区分同名的方法
public class MethodDemo {
    public static void main(String[] args) {
        int result = sum(10, 20);
        System.out.println(result);

        double result2=sum(10,20);
        System.out.println(result2);

        int result3=sum(10,20,30);
        System.out.println(result3);
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
}
