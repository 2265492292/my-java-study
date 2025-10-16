package com.itheima.d2_file;

import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
//目标：掌握File提供的判断文件类型，获取文件信息功能
public class FileTest2 {
    public static void main(String[] args) {
        //创建文件对象，指代某个文件
        File f = new File("D:\\桌面\\课件作业资料\\light.jpg");
        File f1 = new File("day08-stream-file-io\\src\\light.jpg");
        //2.public boolean exists():判断当前文件对象，对应的文件路径是否存在。存在返回true
        System.out.println(f.exists()); //true

        //3.public boolean isFile():判断当前文件对象指代的是否是文件，是文件返回true,反之
        System.out.println(f.isFile()); //true

        //4.public boolean isDirectory():判断当前文件对象指代的是否是文件夹，是文件夹返回true，反之
        System.out.println(f.isDirectory());    //false

        //5.public String getName():获取文件名称（包括后缀）
        System.out.println(f.getName());

        //6.public long length():获取文件的大小，返回字节个数
        System.out.println(f.length());

        //7.public long lastModified():获取文件的最后修改时间
        long time = f.lastModified();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEE a");
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneId.systemDefault());
        String result = dtf.format(dateTime);
        System.out.println(result);

        System.out.println(f.lastModified());

        //8.public String getPath():获取创建文件对象时，使用的路径
        System.out.println(f.getPath());
        System.out.println(f1.getPath());
        //9.public String getAbsolutePath():获取绝对路径
        System.out.println(f.getAbsolutePath());
        System.out.println(f1.getAbsolutePath());

        //找到真正的相对路径
        File file = new File("");
        System.out.println(file.getAbsolutePath());
    }
}
