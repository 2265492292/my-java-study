package com.itheima03;

public class MethodDemo {
    public static void main(String[] args) {
    boolean flag=isEvenNumber(10);
        System.out.println(flag);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}