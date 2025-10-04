package com.itheima.d5_jdk8time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test3_LocalDateTime {
    public static void main(String[] args) {
        //最重要的一个类
        //0.获取本地日期和时间对象
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println("---------------------------");
        //1.可以获取日期和时间的全部信息
        int year = ldt.getYear();         //年
        int month = ldt.getMonthValue(); //月
        int day = ldt.getDayOfMonth();    //日
        int datOfYear = ldt.getDayOfYear();//一年中的第几天
        int dayOfWeek = ldt.getDayOfWeek().getValue();//星期几
        int hour = ldt.getHour();
        int minute = ldt.getMinute();
        int second = ldt.getSecond();
        int nano = ldt.getNano();

        //2.修改时间信息：
        //withYear、withMonth、withDayOfMonth、withDayOfYear
        //withHour、withMinute、withSecond、withNano
        LocalDateTime ldt2 = ldt.withYear(2029);
        LocalDateTime ldt3 = ldt.withMinute(59);

        //3.加多少
        //plusYears、plusMonths、plusDays、plusWeeks
        //plusHours、plusMinutes、plusSeconds、plusNanos
        LocalDateTime ldt4 = ldt.plusYears(2);
        LocalDateTime ldt5 = ldt.plusMinutes(3);

        //4.减多少
        //minusYears、minusMonths、minusDays、minusWeeks
        //minusHours、minusMinutes、minusSeconds、minusNanos
        LocalDateTime ldt6 = ldt.minusYears(2);
        LocalDateTime ldt7 = ldt.minusMinutes(3);

        //5.获取指定日期和时间的LocalDateTime对象:
        //public static LocalDateTime of(int Years,Month month,int dayOfMonth,
        //                               int hour,int minute,int second,int nanoOfSecond)
        LocalDateTime ldt8 = LocalDateTime.of(2029, 12, 12, 12, 12, 12, 12);
        LocalDateTime ldt9 = LocalDateTime.of(2029, 12, 12, 12, 12, 12, 12);

        //6.判断两个日期、时间对象，是否相等，在前还是在后
        System.out.println(ldt9.equals(ldt8));
        System.out.println(ldt8.isAfter(ldt));
        System.out.println(ldt8.isBefore(ldt));

        //7.可以把LocalDateTIme转换成LocalDate和LocalTime
        //public LocalDate toLocalDate()
        //public LocalTime toLocalTime()
        //public static LocalDateTime of (LocalDate date, LocalTime time)
        //合久必分
        LocalDate ld =ldt.toLocalDate();
        LocalTime lt =ldt.toLocalTime();

//        分久必合
        LocalDateTime ldt10=LocalDateTime.of(ld,lt);
    }
}
