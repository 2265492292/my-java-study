package com.itheima.d6_map_impl;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest2 {
    public static void main(String[] args) {
        //目标：掌握Map集合的特点
        //Map体系整体特点：HashMap：按照键，无序，不重复，无索引。值不做要求，键和值都可以是null
        Map<String, Integer> map = new LinkedHashMap<>();//多态 经典代码之三
        //LinkedHashMap按照键，有序！！，不重复，无索引。值不做要求，键和值都可以是null
        map.put("华为手表", 1);
        map.put("iphone17", 1);
        map.put("Java入门到跑路", 1);
        map.put("mete80", 10);
        map.put("iphone17", 31);
        map.put("雨伞", 10);
        map.put(null, null);
        System.out.println(map);
        //{华为手表=1, iphone17=31, Java入门到跑路=1, mete80=10, 雨伞=10, null=null}
    }
}
