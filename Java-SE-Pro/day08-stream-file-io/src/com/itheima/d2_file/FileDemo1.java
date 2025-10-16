package com.itheima.d2_file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        //目标：掌握File对象的创建，来代表具体的文件
        //1.创建File对象
        File f1 = new File("D:\\桌面\\课件作业资料\\light.jpg");
//        File f11 = new File("D:/桌面/课件作业资料/light.jpg");
//        File f111 = new File("D:"+File.separator+"桌面"+File.separator+"课件作业资料"+File.separator+"light.jpg");
        System.out.println(f1.length());

        //2.File对象可以代表文件，也可以代表文件夹
        File f2 =new File("D:\\桌面\\课件作业资料");
        System.out.println(f2.length());//拿到的是文件夹本身的大小，不是里面全部内容的大小
        //3.File对象代表的文件路径可以是不存在的
        File f3 =new File("D:\\桌面\\qzy666\\qzyaaa");
        //4.File对象的路径可以支持绝对路径、相对路径
        //什么是绝对路径？从磁盘开始一路寻找的路径（依赖于当前操作系统，适合找特定操作系统特定位置的内容）
        File f4 =new File("D:\\桌面\\课件作业资料\\light.jpg");
        //什么是相对路径？默认相对到相对工程下寻找文件的--->不带盘符，直接到project(工程)下找文件
        //一般用来找项目中的资源文件（重点）
        File f5=new File("day08-stream-file-io/src/light.jpg");
        System.out.println(f5.length());
    }
}
