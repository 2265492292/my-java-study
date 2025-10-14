package com.itheima.d6_set;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo5 {
    public static void main(String[] args) {
        //目标：理解TreeSet排序对象
        //方式二：TreeSet集合自带比较器对象Comparator
        /*Set<Girl> set = new TreeSet<>(new Comparator<Girl>() {
            @Override
            public int compare(Girl o1, Girl o2) {
                return Double.compare(o2.getHeight(), o1.getHeight());
            }
        });//排序，无重复，无索引*/
        Set<Girl> set = new TreeSet<>((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight()));//排序，无重复，无索引
        set.add(new Girl("赵敏", '女', 21, 169.5));
        set.add(new Girl("刘亦菲", '女', 34, 167.5));
        set.add(new Girl("李若彤", '女', 26, 168.5));
        set.add(new Girl("章若楠", '女', 19, 171.5));
        set.add(new Girl("杨幂", '女', 34, 172.5));

        System.out.println(set);
    }
}
