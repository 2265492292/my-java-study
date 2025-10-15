package com.itheima.d4_map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        //目标：掌握Map集合的特点
        //Map体系整体特点：HashMap：按照键，无序，不重复，无索引。值不做要求，键和值都可以是null
        Map<String, Integer> map = new HashMap<>();//多态 经典代码之三
        map.put("华为手表", 1);
        map.put("iphone17", 1);
        map.put("Java入门到跑路", 1);
        map.put("mete80", 10);
        map.put("iphone17", 31);
        map.put("雨伞", 10);
        map.put(null, null);
        //{Java入门到跑路=1, null=null, mete80=10, 雨伞=10, iphone17=31, 华为手表=1}
        System.out.println(map);
    }
}
