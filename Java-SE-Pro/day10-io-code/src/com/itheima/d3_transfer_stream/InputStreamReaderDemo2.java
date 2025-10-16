package com.itheima.d3_transfer_stream;

import java.io.*;

public class InputStreamReaderDemo2 {
    public static void main(String[] args) {
        //目标：字符转换输入流
        try (
                //1.得到GBK文件的原始字节输入流
                InputStream is = new FileInputStream("day10-io-code/src/FileReader01.txt");
                //2.通过字符输入转换流把原始字节流按照指定编码转换成字符输入流
                Reader isr = new InputStreamReader(is, "GBK");
                //3.把字符输入流包装成高级的缓冲字符输入流
                BufferedReader br = new BufferedReader(isr);
        ) {
            //4.按照行读取
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
