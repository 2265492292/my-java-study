package com.itheima.d1_stringbuilder;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //目标：学会用StringBuilder,理解其优点
        //1.创建StringBuilder对象
        StringBuilder sb=new StringBuilder();//sb=""
        StringBuilder sb2=new StringBuilder("黑马");//sb="黑马"
        System.out.println(sb);
        System.out.println(sb2);

        //2.拼接内容
        sb.append("深圳黑马").append("Java").append(666).append(true);
        //链式编程
        System.out.println(sb);

        //3.反转内容
        sb.reverse();
        System.out.println(sb);

        //4.拿长度
        System.out.println(sb.length());

        //5.把StringBuilder对象转换成String对象
        //StringBuilder是拼接字符串的手段
        //String才是开发中的目的
        String result = sb.toString();
        System.out.println(result);
    }
}
