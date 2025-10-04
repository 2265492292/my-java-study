package com.itheima.d5_jdk8time;

import java.time.Instant;

public class Test5_instant {
    public static void main(String[] args) {
        //目标：掌握Instant的对象，获取此刻时间信息
        Instant now =Instant.now();
        System.out.println(now);

        //获取总秒数
        System.out.println(now.getEpochSecond());
        //不高1秒的秒数
        System.out.println(now.getNano());

        //Instant对象的作用：做代码的性能分析，或者记录用户的操作时间点
    }
}
