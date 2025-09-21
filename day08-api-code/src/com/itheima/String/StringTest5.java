package com.itheima.String;

import java.util.Random;

public class StringTest5 {
    public static void main(String[] args) {
        //String开发验证码
        System.out.println(create(5));
        System.out.println(create(8));
    }

    public static String create(int n) {
        String code = "";
        String data = "abcdEFGHIJKLMNOPQRSTUVWXYZ0123456ABCDefghijklmnopqrst789uvwxyz";
        //1.直接使用循环控制随机获取多少位字符
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            //2.随机产生一个索引
            int index = r.nextInt(data.length());
            //3.提取对应位置字符
            char c = data.charAt(index);
            //4.拼接给code
            code += c;
        }
        return code;
    }
}
