package com.itheima.d5_jdk8time;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Test4_ZoneId_ZonedDateTime {
    public static void main(String[] args) {
        //目标：了解时区和带时区的时间
        //1.ZoneId(用于获取时区)的常见方法:
        //public static ZoneId systemDefault()：获取系统默认的时区
        ZoneId zoneId =ZoneId.systemDefault();
        String name =zoneId.getId();
//        System.out.println(zoneId.toString());
        System.out.println(name);

        //2.public static Set<String> getAvailableZoneIds()：获取Java支持的全部时区ID
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);
        //public static ZoneId of(String ZoneId):把某个时区id封装成ZoneId对象
        //America/New_York
        ZoneId an =ZoneId.of("America/New_York");
        //2.ZonedDateTime:带时区的时间
        //public static ZonedDateTime now(ZoneId zone)：获取某个时区的zoneDateTime对象
        //public static ZonedDateTime now()：获取系统默认时区的ZonedDateTime对象
        //ZonedDateTime的功能和LocalDateTime一样

        ZonedDateTime zdt=ZonedDateTime.now(an);
        System.out.println(zdt);

        //世界标准时间
        ZonedDateTime utcNow = ZonedDateTime.now(Clock.systemUTC());
        System.out.println(utcNow);
    }
}
