package com.itheima.demo;

/*
            独立功能
            独立方法
 */
public class Test7_2 {
    public static void main(String[] args) {
        for (int i = 101; i <= 200; i++) {
            if (isSuShu(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isSuShu(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;//不是素数
            }
        }
        return true;
    }
}
