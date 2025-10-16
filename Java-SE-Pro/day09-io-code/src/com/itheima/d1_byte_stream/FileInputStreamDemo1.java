package com.itheima.d1_byte_stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：掌握文件字节输入流每次读取一个字节的形式
        //1.创建文件字节输入流管道于目标文件接通
//        InputStream is = new FileInputStream(new File("day09-io-code\\src\\Fish.txt)");
        InputStream is = new FileInputStream("day09-io-code\\src\\Fish.txt");

        //2.每次读取一个字节返回
        //public int read():每次读取一个字节返回 如果没有字节可读返回-1
        /*int b1 = is.read();
        System.out.println((char) b1);

        int b2 = is.read();
        System.out.println((char) b2);

        int b3 = is.read();
        System.out.println(b3);*/

        //3.使用循环改进
        int b;//用于记住每次读取的一个字节
        while ((b = is.read()) != -1) {
            System.out.print((char) b);
        }

        //拓展
        //      1.这个代码简直是个垃圾
        //          性能差，每次一个一个读取
        //          无法避免读取汉字输出乱码的问题，会截断汉字的字节

    }
}
