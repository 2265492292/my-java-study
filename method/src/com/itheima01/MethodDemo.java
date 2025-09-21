package com.itheima01;

public class MethodDemo {
    public static void main(String[] args) {
        isEvenNumber(10);
        isEvenNumber(9);
        int number=11;
        isEvenNumber(number);
        number=12;
        isEvenNumber(number);
    }

    public static void isEvenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
