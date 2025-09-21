package com.itheima01;

public class StringDemo02 {
    public static void main(String[] args) {
        String s1="itheima";
        String s2="itheima";
        String s3="Itheima";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println("-----------");

        String s4=" itheima ";
        System.out.println(s4);
        System.out.println(s4.trim());

        String s5=" it heima ";
        System.out.println(s4);
        System.out.println(s4.trim());
    }
}
