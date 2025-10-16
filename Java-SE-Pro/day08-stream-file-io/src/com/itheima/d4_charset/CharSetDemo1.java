package com.itheima.d4_charset;

import java.util.Arrays;

public class CharSetDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：掌握字符的编码和解码
        String info = "我在黑马听磊哥吹nb!";

        //1.编码成字节
        byte[] bytes = info.getBytes();//默认用平台编码UTF-8编码
        System.out.println(Arrays.toString(bytes));

        byte[] bytes2 = info.getBytes("GBK");//指定GBK编码
        System.out.println(Arrays.toString(bytes2));

        //2,解码成字符
        String rs1 =new String(bytes);//默认用平台编码UTF-8解码
        System.out.println(rs1);

        String rs2 =new String(bytes2,"GBK");//默认用平台编码UTF-8解码
        System.out.println(rs2);
    }
}
