package com.itheima.String;

public class StringDemo1 {
    public static void main(String[] args) {
        //掌握String创建字符串对象，封装字符串数据的方法
        //方式1：直接"内容"就可以得到字符串对象，封装字符串数据(推荐)
        String name="小黑";
        String schoolName="黑马程序员";
        //方式2：通过调用String的构造方法，得到字符串对象
        String s1=new String();//s1=""
        System.out.println(s1);

        String s2=new String("西门吹雪");
        System.out.println(s2);

        char[] chars={'a','b','c','中','国'};
        String s3=new String(chars);//s3="abc中国"
        System.out.println(s3);

        byte[] bytes={97,98,99,65,66,67};//a,b,c,A,B,C
        String s4=new String(bytes);
        System.out.println(s4);
    }
}
