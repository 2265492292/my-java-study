package com.itheima.d5_map_travesal;

import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {
    public static void main(String[] args) {
        //目标：掌握Map集合的遍历方式三：Lambda
        Map<String, Integer> map = new HashMap<>();
        map.put("蜘蛛精", 1000);
        map.put("小龙女", 21);
        map.put("木婉清", 19);
        map.put("黄蓉", 35);
        System.out.println(map);
        //map = {蜘蛛精=1000, 小龙女=21, 黄蓉=35, 木婉清=19}
/*
        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s + "===>" + integer);
            }
        });
        */

        /*map.forEach((s, v) -> {
            System.out.println(s + "===>" + v);
        });*/

        map.forEach((s, v) -> System.out.println(s + "===>" + v));
    }

}
