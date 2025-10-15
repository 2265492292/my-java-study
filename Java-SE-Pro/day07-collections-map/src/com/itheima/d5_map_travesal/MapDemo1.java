package com.itheima.d5_map_travesal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        //目标：掌握Map集合的遍历方式一：键找值
        Map<String, Integer> map = new HashMap<>();//多态 经典代码之三
        map.put("iphone", 10);
        map.put("小米", 3);
        map.put("huawei", 3);
        map.put("诺基亚", 31);
        System.out.println(map);
        //1.获取map集合的全部键
        Set<String> keys = map.keySet();
        //2.根据键提取值
        for (String key : keys) {
            Integer value = map.get(key);
            System.out.println(key + "===>" + value);
        }
    }


}
