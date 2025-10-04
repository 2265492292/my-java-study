package com.itheima.d3_math;

public class MathTest {
    //目标：了解Math类提供的常见方法
    public static void main(String[] args) {
///        1.public static int abs(int a);取绝对值(拿到的结果一定是正数)
//        public static double abs(double a);
        System.out.println(Math.abs(-12));
        System.out.println(Math.abs(123));
        System.out.println(Math.abs(3.14));
        System.out.println("-----------------------");
///        2.public static double ceil(double a);向上取整
        System.out.println(Math.ceil(4.0000000000001));
        System.out.println(Math.ceil(4.0));
        System.out.println("-----------------------");
///        3.public static double floor(double a);向下取整
        System.out.println(Math.floor(4.99999999999));
        System.out.println(Math.floor(4.0));
        System.out.println("-----------------------");
///        4.public static long round(double a);四舍五入
        System.out.println(Math.round(3.499999999));
        System.out.println(Math.round(3.50000000001));
        System.out.println("-----------------------");
///        5.public static int max(int a, int b);取较大值
///          public static int min(int a, int b);取较小值
        System.out.println(Math.max(10,20));
        System.out.println(Math.min(10,20));
        System.out.println("-----------------------");
///        6.public static double pow(double a,double b);取次方
        System.out.println(Math.pow(2,3));//2的3次方
        System.out.println(Math.pow(3,2));//3的2次方
        System.out.println("-----------------------");
///        7.public static double random();取随机数[0.0 1.0](包前不包后)
        System.out.println(Math.random());
    }
}

