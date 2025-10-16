package com.itheima.d1_char_stream;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：文件字符输入流的使用：每次读取一个字符
        //1.创建文件字符输入流管道与源文件接通
        Reader fr = new FileReader("day10-io-code/src/FileReader01.txt");
        //2,读取一个字符编号回来，没有字符可读返回-1：public int read()
        /*int c1 = fr.read();
        System.out.println((char) c1);
        int c2 = fr.read();
        System.out.println((char) c2);
        int c3 = fr.read();
        System.out.println(c3);*/

        //3.使用循环解决
        int c;
        while ((c= fr.read())!=-1){
            char ch =(char) c;
            System.out.print(ch);
        }

        //拓展：
        //  是否解决了乱码问题：解决了
        //  性能较差，依旧垃圾
    }
}
