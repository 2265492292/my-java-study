package com.itheima.d6_map_impl;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {
    public static void main(String[] args) {
        //目标：掌握Map集合(键）去重复的机制
        Map<Movie,String> map=new HashMap<>();
        map.put(new Movie("摔跤吧爸爸",9.5,"阿米尔汗"),"19:00");
        map.put(new Movie("三傻宝莱坞",8.5,"阿米尔汗2"),"20:50");
        map.put(new Movie("三傻宝莱坞",8.5,"阿米尔汗2"),"21:50");
        map.put(new Movie("阿甘正传",7.5,"汤姆汉克斯"),"21:00");
        System.out.println(map);
    }
}
