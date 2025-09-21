package com.itheima.String;

import java.util.Scanner;

public class StringTest4 {
    public static void main(String[] args) {
        //完成用户登录功能
        //登录功能是一个独立的功能（独立功能独立方法）
        //最多给三次机会
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("第" + i + "次登录开始");
            System.out.println("请输入用户名：");
            String loginName = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
            String result = login(loginName, password);
            if ("success".equals(result)) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println(result);
            }
        }
    }


    public static String login(String loginName, String password) {
        //拿到正确的用户名和密码
        String okLoginName = "itheima";
        String okPassword = "123456";
        //2.判断用户输入的登录名和密码是否正确
//        if (loginName == okLoginName) {
        //"loginName == okLoginName"比较的是地址
        //okLoginName在常量池中,用户输入的loginName在堆中,所以一定为false
        if (okLoginName.equals(loginName)) {
            //登录名正常
            //3.判断密码是否正确
//        if (password == okPassword) {
            if (okPassword.equals(password)) {
                return "success";
            } else {
                return "密码有误";
            }
        } else {
            return "用户名有误";
        }

    }

}
