package com.itheima.d3_transfer_stream;

import java.io.*;
import java.util.Arrays;

public class OutputStreamWriterDemo3 {
    public static void main(String[] args) {
        try (
                //目标：掌握字符输出转换流：可以指定写出去的字符编码
                //1.创建一个文件字节输出流通向目标文件
                OutputStream os =new FileOutputStream("day10-io-code/src/FileReader04-out.txt");
                //指定写出的编码是GBK
                Writer osw =new OutputStreamWriter(os,"GBK");
                //2.把字符输出转换流包装成缓冲输出流
                BufferedWriter bw =new BufferedWriter(osw);
                ){
            bw.write("世界以痛吻我");

            //另一种方法
            String data ="我爱你中国";
            byte[] bytes =data.getBytes("GBK");


            bw.write(Arrays.toString(bytes));
            bw.newLine();
            bw.write("要我报之以歌");
            bw.newLine();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
