package com.itheima.d3_transfer_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Test1 {
    public static void main(String[] args) {
        //目标：不同编码下，字符流读取文本内容的问题
        try (
                //代码编码：UTF-8    文件编码：UTF-8  a我m ==> o [ooo] o   乱码
                //代码编码：UTF-8    文件编码：GBK    a我m ==> o [oo] o    乱码
                //1.创建一个文件字符输入流与源文件接通
                Reader fr = new FileReader("day10-io-code/src/FileReader01.txt");
                //2.把原始字符输入流包装成高级缓冲字符输入流
                BufferedReader br = new BufferedReader(fr);
        ) {
            String line;//记住每次读取的一行数据
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
