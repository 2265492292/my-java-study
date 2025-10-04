package com.itheima.d5_jdk8time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test6_DateTimeFormatter {
    public static void main(String[] args) {
        //1.创建一个日期时间格式化器对象
        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss EEE a");

        //2.对时间进行格式化
        LocalDateTime ldt =LocalDateTime.now();
        String result = dtf.format(ldt);
        System.out.println(result);

        //3.格式化时间，另外一种方式
        String result2= ldt.format(dtf);
        System.out.println(result2);

        //4.解析时间：解析时间一般使用LocalDateTime提供的解析方法来解析
        String dateStr="2023-11-11 11:11:11";
        //必须写一个日期时间格式化器与这个时间的格式一模一样
        DateTimeFormatter dtf2 =DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt2 =LocalDateTime.parse(dateStr,dtf2);
        System.out.println(ldt2);
    }
}
