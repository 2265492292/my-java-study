package com.itheima.d2_file;

import java.io.File;

//目标：掌握File提供的遍历文件夹的方法
public class FileTest4 {
    public static void main(String[] args) {
        File f =new File("D:\\桌面\\课件作业资料");
        //1.public String[] list()：获取当前目录下所有"一级文件名称"到一个字符串数组中去返回
        String[] names = f.list();
        for (String name : names) {
            System.out.println(name);
        }
        //2.public File[] listFiles()：（重点）获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回（重点）
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
        //注意事项：
        //当主调时文件，或者路径不存在时，返回null
        //当主调是空文件夹时，返回一个长度为0的数组
        //当主调是一个内容的文件夹，将里面所有一级文件和文件夹的路径放在File数组中返回
        //当主调是一个文件夹，且里面有隐藏文件时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏文件
        //当主调是一个文件夹，但是没有权限访问该文件夹时，返回null
    }
}
