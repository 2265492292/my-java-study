package com.itheima.d5_regex;

import java.util.Scanner;

public class RegexTest3 {
    public static void main(String[] args) {
        //目标：使用所学的正则表达式来校验数据的合法性
//        checkEmial();
        checkPhone();
    }

    private static void checkPhone() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String phone = sc.next();
            if (phone.matches("1[3,9]\\d{9}")) {
                System.out.println("手机号码合法，录入成功");
                break;
            } else {
                System.out.println("手机号码不合法，请重新输入");
            }
        }
    }

    public static void checkEmial() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请您输入邮箱：");
            String email = sc.next();
            //deli0009@163.com
            //542325534@qq.com
            //xulei2@itcast.com.cn
            if (email.matches("\\w{2,30}@\\w{2,20}(\\.\\w{2,30}){1,2}")) {
                System.out.println("邮箱合法，输入成功");
                break;
            } else {
                System.out.println("邮箱不合法，请重新输入");
            }
        }
    }

}
