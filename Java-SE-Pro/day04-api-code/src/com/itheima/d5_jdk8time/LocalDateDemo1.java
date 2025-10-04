package com.itheima.d5_jdk8time;

import java.time.LocalDate;

public class LocalDateDemo1 {
    public static void main(String[] args) {
        //目标：搞清楚LocalDate的常用方法
        //1.得到LocalDate的对象:代表的是此刻日期
        LocalDate ld =LocalDate.now();
        System.out.println(ld);

        //2.单独获取年月日
        System.out.println(ld.getYear());
        System.out.println(ld.getMonth());
        System.out.println(ld.getMonthValue());
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getDayOfYear());

        //3.获取星期几
        System.out.println(ld.getDayOfWeek().getValue());
    }
}
