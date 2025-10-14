package com.itheima.d6_set;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class SetDemo4 {
    public static void main(String[] args) {
        //目标：了解Set家族的特点：无序，不重复，无索引
        Set<String> set = new LinkedHashSet<>();//有序，不重复，无索引
        set.add("java1");
        set.add("java1");
        set.add("html");
        set.add("html");
        set.add("css");
        set.add("黑马");
        System.out.println(set);
    }
}
