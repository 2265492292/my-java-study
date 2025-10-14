package com.itheima.d5_regex;

public class RegexTest1 {
    public static void main(String[] args) {
        //目标：初步体验正则表达式的作用：校验数据
        System.out.println(checkQQ("2345123"));
        System.out.println(checkQQ2("2345123123"));
    }

    public static boolean checkQQ2(String qq) {
        return qq != null && qq.matches("[1-9]\\d{5,}");
    }

    //先不用正则表达式解决
    public static boolean checkQQ(String qq) {
        //需求：这个qq号码必须是5位以上，全部是数字，不能以0开头
        if (qq == null || qq.startsWith("0") || qq.length() <= 5) {
            return false;
        }
        //2.校验是否都是数字
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
