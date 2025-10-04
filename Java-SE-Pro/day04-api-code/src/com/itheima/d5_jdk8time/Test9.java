package com.itheima.d5_jdk8time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test9 {
    public static void main(String[] args) {
        //目标：高考倒计时
        //1.高考时间
        String startTime = "2026-06-07 09:30:00";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt1 = LocalDateTime.parse(startTime, dtf);

        //2.知道此刻离高考时间差多少天，多少分，多少秒
        LocalDateTime ldt2 = LocalDateTime.now();

        //3.计算两个时间差
        Duration duration = Duration.between(ldt2, ldt1);
//        System.out.println(duration.toDays() + "天" + duration.toHours() + "时" + duration.toMinutes() + "分" + duration.toSeconds() + "秒");
        System.out.println(duration.toDays() + "天" + duration.toHoursPart() + "时" + duration.toMinutesPart() + "分" + duration.toSecondsPart() + "秒");
    }
}
