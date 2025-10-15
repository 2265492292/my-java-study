package com.itheima.d6_map_impl;

import java.util.Map;
import java.util.TreeMap;

public class MapTest3 {
    public static void main(String[] args) {
        //目标：掌握TreeMap集合：按照键的升序排序，不重复，无索引
        //方式二：TreeMap集合肯定可以自带比较器对象指定比较规则
        Map<Movie,String> map=new TreeMap<>(((o1, o2) -> Double.compare(o2.getScore(), o1.getScore())));
//        Map<Movie,String> map=new TreeMap<>();
        //方式一：Movie类实现Comparable接口指定比较规则
        map.put(new Movie("摔跤吧爸爸",9.5,"阿米尔汗"),"19:00");
        map.put(new Movie("三傻宝莱坞",8.5,"阿米尔汗2"),"20:50");
        map.put(new Movie("三傻宝莱坞",8.5,"阿米尔汗2"),"21:50");
        map.put(new Movie("阿甘正传",7.5,"汤姆汉克斯"),"21:00");
        System.out.println(map);
    }
}
