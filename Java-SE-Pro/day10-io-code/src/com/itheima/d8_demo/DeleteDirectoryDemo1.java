package com.itheima.d8_demo;

import java.io.File;

public class DeleteDirectoryDemo1 {
    public static void main(String[] args) {
        //删除文件夹
        deleteDir(new File("~~~~~~~~"));
    }

    public static void deleteDir(File dir) {
        //1.不删除
        if (dir == null || !dir.exists()) {
            return;
        }
        //2.如果是文件直接删
        if (dir.isFile()) {
            dir.delete();
            return;
        }
        //3.文件夹
        File[] files = dir.listFiles();//拿一级文件对象
        //没权限
        if (files == null) {
            return;
        }
        //4.空文件夹直接删除
        if (files.length == 0) {
            //空文件夹
            dir.delete();
            return;
        }
        //5.全部遍历，删除文件，再删除文件夹本身
        for (File file : files) {
            if (file.isFile()){
                file.delete();
            }else {
                deleteDir(file);
            }
        }
        dir.delete();
    }
}
