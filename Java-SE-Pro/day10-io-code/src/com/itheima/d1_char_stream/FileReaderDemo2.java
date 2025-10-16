package com.itheima.d1_char_stream;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo2 {
    public static void main(String[] args) {
        //目标：文件字符输入流的使用，每次读取多个字符
        try (
                //1.创建文件字符输入流与源文件接通
                Reader fr = new FileReader("day10-io-code/src/FileReader01.txt");
                ){
            //2.定义一个字符数组用于读取多个字符
            char[] buffer =new char[3];
            int len;//记住没去读取多少个字符
            while ((len = fr.read(buffer))!=-1){
                String rs =new String(buffer,0,len);
                System.out.println(rs);
            }

            //拓展
            //      可以避免乱码
            //      性能，可以
            //      截至此刻学过的读取文本内容更好的方案
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}