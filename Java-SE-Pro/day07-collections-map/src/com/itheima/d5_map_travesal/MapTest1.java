package com.itheima.d5_map_travesal;

import java.util.*;

public class MapTest1 {
    public static void main(String[] args) {
        //目标：使用Map集合完成投票案例
        //1.把80个学生选择的景点造出来
        String[] locations = {"玉龙雪山", "伶仃岛", "三亚", "泰国"};
        //                        0         1       2       3

        //2.定义一个List集合，随机挑选80个学生想去的景点
        List<String> data = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            data.add(locations[r.nextInt(locations.length)]);
        }
        System.out.println(data);

        //3.定义一个Map集合，键存储景点，值存储想去的人数
        Map<String, Integer> map = new HashMap<>();
        for (String s : data) {
            //4.判断map集合中是否出现这个景点，如果没有出现，说明是第一次添加
            if (map.containsKey(s)) {
                //之前统计过,值+1
                map.put(s, map.get(s) + 1);
            } else {
                //第一次添加
                map.put(s, 1);
            }
        }
        map.forEach(((s, n) -> System.out.println(s + "选择人数：" + n)));
    }
}
