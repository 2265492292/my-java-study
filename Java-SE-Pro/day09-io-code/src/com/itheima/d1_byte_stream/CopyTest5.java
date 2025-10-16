package com.itheima.d1_byte_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyTest5 {
    public static void main(String[] args) {

        try {
            //1.创建一个字节输入流管道与源文件接通
            InputStream is = new FileInputStream("day08-stream-file-io/src/light.jpg");

            //2.创建一个字节输出流管道与目标文件接通
            OutputStream os = new FileOutputStream("day09-io-code/src/light-bak.jpg");

            //3.准备一个字节数组
            byte[] buffer = new byte[1024];

            //4.转移数据
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }

            //5.释放资源
            os.close();
            is.close();
            System.out.println("复制完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
