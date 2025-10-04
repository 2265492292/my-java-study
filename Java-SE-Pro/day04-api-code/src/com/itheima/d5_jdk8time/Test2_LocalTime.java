package com.itheima.d5_jdk8time;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test2_LocalTime {
    public static void main(String[] args) {
        //0.获取本地时间对象
        LocalTime lt = LocalTime.now();//时、分、秒、纳秒（1秒=1000毫秒，1豪秒=1000微秒，1微秒=1000纳秒，1秒=1000000000纳秒

        //1.获取时间中的信息
        int hour = lt.getHour();
        int minute = lt.getMinute();
        int second = lt.getSecond();
        int nano = lt.getNano();

        //2.修改时间：withHour、withMinute、withSecond、withNano
        LocalTime lt2 = lt.withHour(21);
        LocalTime lt3 = lt.withMinute(10);
        LocalTime lt4 = lt.withSecond(10);
        LocalTime lt5 = lt.withNano(10);
        System.out.println(lt);
        System.out.println(lt2);
        System.out.println(lt3);
        System.out.println(lt4);
        System.out.println(lt5);
        System.out.println("-------------------------------");
        //3.加多少:plusHours、plusMinutes、plusSeconds、plusNanos
        LocalTime lt6 = lt.plusHours(10);
        LocalTime lt7 = lt.plusMinutes(10);
        LocalTime lt8 = lt.plusSeconds(10);
        LocalTime lt9 = lt.plusNanos(10);
        System.out.println("-------------------------------");
        //4.减多少:minusHours、minusMinutes、minusSeconds、minusNanos
        LocalTime lt10 = lt.minusHours(10);
        LocalTime lt11 = lt.minusMinutes(10);
        LocalTime lt12 = lt.minusSeconds(10);
        LocalTime lt13 = lt.minusNanos(10);
        System.out.println("-------------------------------");
        //5.获取指定时间的LocalTime对象
        //public static LocalTime of(int Hours, int minutes, int second)
        LocalTime lt14 = LocalTime.of(12, 12, 12);
        LocalTime lt15 = LocalTime.of(12, 12, 12);
        System.out.println("-------------------------------");
        //6.判断两个时间对象是否相等，在前还是在后
        System.out.println(lt14.equals(lt15));
        System.out.println(lt14.isAfter(lt));
        System.out.println(lt14.isBefore(lt));
    }
}
