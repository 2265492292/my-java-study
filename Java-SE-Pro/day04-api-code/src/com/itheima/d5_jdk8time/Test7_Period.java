package com.itheima.d5_jdk8time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Test7_Period {
    public static void main(String[] args) {
        //掌握Period的作用：计算两个日期相差的年数、月数、天数
        LocalDate start = LocalDate.of(2025,10,4);
        LocalDate end = LocalDate.of(2025,12,15);

        //1.创建Period对象，封装两个日期
        Period period =Period.between(start,end);
        //2.通过period对象获取两个日期对象相差的信息
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
