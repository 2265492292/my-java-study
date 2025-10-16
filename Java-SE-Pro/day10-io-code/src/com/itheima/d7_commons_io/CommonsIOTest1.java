package com.itheima.d7_commons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;

//目标：使用CommonsIO框架进行IO相关的操作
public class CommonsIOTest1 {
    public static void main(String[] args) throws Exception {
        FileUtils.copyFile(new File("day10-io-code/src/FileReader04-out.txt"),
                new File("day10-io-code/src/FileReader04-new.txt"));
//        FileUtils.copyDirectory(new File(),new File());//复制文件夹
//        FileUtils.deleteDirectory(new File());//删除文件夹

        //JDK 7 开始 新增了单行复制相关的技术
//        Files.copy(Path.of(""),Path.of(""));
    }
}
