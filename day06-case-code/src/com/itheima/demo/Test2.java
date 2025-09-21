package com.itheima.demo;

import java.util.Random;

public class Test2 {
    //生成验证码
    public static void main(String[] args) {
        System.out.println("四位验证码" + createCode(4));
        System.out.println("六位验证码" + createCode(6));
    }

    public static String createCode(int length) {
        String code = "";
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            int type = r.nextInt(3);///0-2
            switch (type) {
                case 0:
                    //数字
                    int number = r.nextInt(10);
                    code += number;
                    break;
                case 1:
                    //大写字母A-Z//65-->90(65+25)
                    char c1 = (char) (r.nextInt(26) + 65);
                    code += c1;
                    break;
                case 2:
                    //小写字母a-z//97--122(97+25)
                    char c2 = (char) (r.nextInt(26) + 97);
                    code += c2;
                    break;
            }
        }
        return code;
    }
}
