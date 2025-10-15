package com.itheima.d4_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        //目标：掌握Map集合的常用API（重点）
        Map<String, Integer> map = new HashMap<>();//多态 经典代码之三
        map.put("手表", 1);
        map.put("iphone17", 1);
        map.put("Java入门到跑路", 1);
        map.put("mete80", 10);
        map.put("iphone17", 31);
        map.put("雨伞", 10);
        map.put("huawei", 365);
        map.put(null, null);
        map.put("娃娃", 2);
        System.out.println(map);
        //{Java入门到跑路=1, null=null, mete80=10, 雨伞=10, iphone17=31, 华为手表=1}

        //1.获取集合的大小(元素个数)
        System.out.println(map.size()); //6

        //2.清空集合
//        map.clear();
        System.out.println(map);

        //3.判断集合是否为空
        System.out.println(map.isEmpty());

        //4.根据键获取对应的值(重点)
        System.out.println(map.get("手表"));
        System.out.println(map.get("手表2")); //如果没有这个键，返回null

        //5.根据键删除整个数据，返回删除数据对应的值(重点)
        System.out.println(map.remove("娃娃"));
        System.out.println(map);

        //6.判断是否包含某个键(重点)
        System.out.println(map.containsKey("娃娃"));  //false
        System.out.println(map.containsKey("huawei"));//true
        System.out.println(map.containsKey(null));  //true
        System.out.println(map.containsKey("手表2")); //false
        System.out.println("----------");
        //7.判断是否包含某个值
        //{Java入门到跑路=1, null=null, 手表=1, huawei=10, mete80=10, 雨伞=10, iphone17=31}
        System.out.println(map.containsValue(1));   //true
        System.out.println(map.containsValue(365)); //true
        System.out.println(map.containsValue("1")); //false

        //8.获取Map集合的全部键,到一个Set集合中返回
        //set==键 -->  无序，不重复，无索引
        //{Java入门到跑路=1, null=null, 手表=1, huawei=10, mete80=10, 雨伞=10, iphone17=31}
        //public Set<K> keySet():
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        //9.获取Map集合的全部值，到一个Collection集合中返回
        //Collection == 值(value)  --> 有序，可重复!!重点，有索引
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}
