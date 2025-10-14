package com.itheima.d1_exception;

import java.util.Scanner;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        //目标：异常的处理方式2：捕获异常尝试修复
        while (true) {
            try {
                double price = getPrice();
                System.out.println("本商品定价是：" + price);
                break;
            } catch (Exception e) {
                System.out.println("您输入的价格不合法");;
            }
        }
    }

    public static double getPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入合法价格:");
        double price = sc.nextDouble();
        return price;
    }
}
