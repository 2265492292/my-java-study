package com.itheima.d2_buffer_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterDemo3 {
    public static void main(String[] args) {
        try (
                //目标：掌握字符文件输出流的使用
                //1.创建一个文件字符输出流管道与目标文件接通
                Writer fw = new FileWriter("day10-io-code/src/FileReader02.txt");   //覆盖
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            //2.写字符数据出去
            //a.写一个字符出去：public void write(int c)
            bw.write(97);
            bw.write('鱼');
            bw.newLine();//换行

            //b.写一个字符串出去：public void write(String str)
            bw.write("abc我爱你中国666");
            bw.newLine();//换行

            //c.写一个字符串中的一部分出去：public void write(String str, int off, int len)
            bw.write("abc我爱你中国666", 3, 3);
            bw.newLine();

            //d.写一个字符数组出去：public void write(char[] chars)
            char[] chars = "abc我爱你中国666".toCharArray();
            bw.write(chars);
            bw.newLine();//换行

            //e.写一个字符数组的一部分出去：public abstract void write(char[] chars, int off, int len)
            bw.write(chars, 6, 2);
            bw.newLine();

            /*fw.flush();//刷新
            fw.close();*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
