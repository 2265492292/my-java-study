package com.itheima.d5_map_travesal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        //目标：掌握Map集合的遍历方式二：键值对遍历(有难度)
        Map<String, Integer> map = new HashMap<>();
        map.put("蜘蛛精", 1000);
        map.put("小龙女", 21);
        map.put("木婉清", 19);
        map.put("黄蓉", 35);
        System.out.println(map);
        //map = {蜘蛛精=1000, 小龙女=21, 黄蓉=35, 木婉清=19}

        //1.一开始是想通过增强for类型直接遍历Map集合，但是无法遍历，因为键值对直接来看是不存在数据类型的
//        for (元素类型 变量：map){
//
//        }
        //2.调用Map集合的一个方法，把Map集合转换成Set集合来遍历
        //把每个数据封装成一个entry对象
       /* map = {蜘蛛精=1000, 小龙女=21, 黄蓉=35, 木婉清=19}
        ↓
        map.entrySet()
        ↓
        Set<Map.Entry<String,Integer>> entries =[(蜘蛛精=1000),(小龙女=21),(黄蓉=35),(木婉清=19)]
                                                    entry
                                                    */
        Set<Map.Entry<String, Integer>> entries = map.entrySet();//用entrySet方法转成Set集合
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "===>" + value);
        }
    }
}
