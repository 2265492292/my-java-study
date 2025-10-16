package com.itheima.d2_buffer_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        //目标：完成出师表案例

        try (
                //2.创建缓冲字符输入流与源文件接通
                BufferedReader br = new BufferedReader(new FileReader("day10-io-code/src/csb.txt"));
                //6.创建缓冲字符输出流
                BufferedWriter bw = new BufferedWriter(new FileWriter("day10-io-code/src/csb-2.txt"));
        ) {
            //1.准备一个集合，存储原文没段落
            List<String> data = new ArrayList<>();

            //3.开始按照行读取，存入到集合中去
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
            System.out.println(data);
            //4.对每段按照首字符编号进行排序
            Collections.sort(data);
            System.out.println(data);

            //5.把排序好的集合中的每段文章输出到新文件中去
            for (String ln : data) {
                bw.write(ln);
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
