package com.itheima.d2_buffer_stream;

import java.io.*;

public class BufferedInputStreamDemo1 {

    public static void main(String[] args) {
        //目标：使用字节缓冲流提升原始字节流读写数据的性能
        //自带8K(8192)的字符缓冲池，可以提高性能
        try (
                //1.创建一个字节输入流管道与源文件接通
                InputStream is = new FileInputStream("day08-stream-file-io/src/light.jpg");
                //使用高级的缓冲字节输入流包装低级的字节输入流
                InputStream bis =new BufferedInputStream(is);
                //2.创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream("day09-io-code/src/light-bak.jpg");
                //使用高级的缓冲字节输出流包装低级的字节输出流
                OutputStream bos =new BufferedOutputStream(os);

        ) {
            //3.准备一个字节数组
            byte[] buffer = new byte[1024];

            //4.转移数据
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
