package com.itheima.d2_buffer_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderDemo2 {
    public static void main(String[] args) {
        //目标：字符缓冲输入流的使用：提升原始字符输入流的读入性能，多了按行读取的能力
        try (
                //1.创建文件字符输入流与源文件接通
                Reader fr = new FileReader("day10-io-code/src/FileReader03.txt");
                //把低级的字符输入流包装成高级的缓冲字符输入流
                BufferedReader br =new BufferedReader(fr);
        ){
           /* //2.定义一个字符数组用于读取多个字符
            char[] buffer =new char[1024];
            int len;//记住没去读取多少个字符
            while ((len = br.read(buffer))!=-1){
                String rs =new String(buffer,0,len);
                System.out.println(rs);
            }*/

           //3.缓冲字符输入流多了一个按照行读取内容的功能(经典代码）
            String line;
            while ((line =br.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
