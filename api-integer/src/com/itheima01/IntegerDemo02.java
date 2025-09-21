package com.itheima01;

public class IntegerDemo02 {
    public static void main(String[] args) {
        //int--string
        int number = 100;
        //方式1
        String s1 = number + "";
        System.out.println(s1);
        //方式2
        String s2 = String.valueOf(number);
        System.out.println(s2);
        System.out.println("------------");
        //string--int
        String s = "100";
        //方式1：string--integer--int
        Integer i = Integer.valueOf(s);
        //int intValue() 返回此值Integer为int
        int x=i.intValue();
        System.out.println(x);
        //方式2
        int y = Integer.parseInt(s);
        System.out.println(y);
    }
}
