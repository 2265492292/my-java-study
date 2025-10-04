package com.itheima.d1_stringbuilder;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //目标：继续StringBuilder拼接字符串的性能测试
        //1.使用String拼接
        /*String s = "";
        for (int i = 0; i < 1000000; i++) {
            s += "abc";
        }
        System.out.println(s);*/

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("abc");
        }
        System.out.println(sb);
    }
}
