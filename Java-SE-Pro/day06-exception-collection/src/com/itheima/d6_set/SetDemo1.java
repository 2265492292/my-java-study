package com.itheima.d6_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        //目标：了解Set家族的特点：无序，不重复，无索引
        Set<String> set = new HashSet<>();//多态经典之二
//        Set<String> set=new LinkedHashSet<>();//有序，不重复，无索引
        set.add("张无忌");
        set.add("张无忌");
        set.add("朱九真");
        set.add("周芷若");
        set.add("周芷若");
        set.add("赵敏");
        System.out.println(set);
    }
}
