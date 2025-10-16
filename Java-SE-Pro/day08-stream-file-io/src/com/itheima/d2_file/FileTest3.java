package com.itheima.d2_file;

import java.io.File;
//目标：掌握File创建和删除文件相关的方法
public class FileTest3 {
    public static void main(String[] args) {
        File f =new File("D:\\桌面\\课件作业资料\\itheima666.txt");

        //1.public boolean createNewFile()：创建一个新文件（文件内容为空），创建成功返回true
//        System.out.println(f.createNewFile());

        //2.public boolean mkdir()：创建一个文件夹，注意：只能创建一级文件夹
//        File f2=new File("D:\\桌面\\课件作业资料\\aaa\\bbb\\ccc");
        File f2=new File("D:\\桌面\\课件作业资料\\aaa");
        System.out.println(f2.mkdir());

        //3.public boolean mkdirs()：创建文件夹，注意：可以创建多级文件夹
        File f3=new File("D:\\桌面\\课件作业资料\\aaaa\\bbb/ccc");
        System.out.println(f3.mkdirs());

        //4.public boolean delete():
        //只能删除文件和空文件夹，不能删除非空文件夹
        System.out.println(f.delete());
        System.out.println(f2.delete());
        System.out.println(f3.delete());

        File f4 =new File("D:\\桌面\\课件作业资料\\");//不能删除非空文件夹
        System.out.println(f4.delete());
    }
}
