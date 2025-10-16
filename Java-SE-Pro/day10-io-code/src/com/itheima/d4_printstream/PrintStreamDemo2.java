package com.itheima.d4_printstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo2 {
    public static void main(String[] args) throws Exception {
        //目标：输出语句的重定向
        System.out.println("红豆生南国");
        System.out.println("春来发几枝");
        PrintStream ps =new PrintStream(new FileOutputStream("day10-io-code/src/ps2.txt",true));
        System.setOut(ps);
        System.out.println("愿君多采撷");
        System.out.println("此物最相思");
    }
}
