package com.itheima.d4_printstream;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintStreamDemo1 {
    public static void main(String[] args) {
        try (
                //目标：打印流，方便，高效的写数据出去
//                PrintStream ps = new PrintStream("day10-io-code/src/ps.txt");
//                PrintWriter ps = new PrintWriter("day10-io-code/src/ps.txt");
                PrintWriter ps =new PrintWriter(new FileWriter("day10-io-code/src/ps.txt",true));
        ) {
            ps.println(666);
            ps.println(97);
            ps.println(97.9);
            ps.println('a');
            ps.println(true);
            ps.println("好好学Java");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
