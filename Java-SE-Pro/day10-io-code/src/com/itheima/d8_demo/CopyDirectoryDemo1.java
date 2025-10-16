package com.itheima.d8_demo;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class CopyDirectoryDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：复制文件夹
        //源文件夹：D:\桌面\课件作业资料
        //目标位置：D:\桌面\课件作业资料-bak
        copyDirectory(new File("D:\\桌面\\课件作业资料"), new File("E:\\"));
    }

    public static void copyDirectory(File srcDir, File descDir) throws Exception {
        //1.可以做极端判断
        if (srcDir == null || descDir == null || !srcDir.exists() || !descDir.exists() || srcDir.isFile() || descDir.isFile()) {
            return;
        }
        //2.开始拷贝之前，先在目标文件夹创建新文件和源文件夹名称一样
        File destNewDir = new File(descDir, srcDir.getName());
        //创建这个目录
        destNewDir.mkdirs();

        //3.提取原始目录的一级文件对象
        File[] files = srcDir.listFiles();

        //4.判断这个目录下是否可以拿到一级文件对象，一级是否存在一级文件对象
         if (files ==null||files.length==0){
             return;
         }
         //5.遍历全部一级文件对象,拷贝到目录文件夹
        for (File file : files) {
            //6.判断是否是文件，是文件夹递归
            if (file.isFile()){
                //源文件：file
                //目标文件:deatNewDir +file.getName()
                FileUtils.copyFile(file,new File(destNewDir,file.getName()));
            }else {
                //文件夹：递归
                copyDirectory(file,destNewDir);
            }
        }
    }
}
