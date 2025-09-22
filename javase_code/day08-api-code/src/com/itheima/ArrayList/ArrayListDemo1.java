package com.itheima.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //目标：掌握ArrayList集合的创建和使用
        ///1.创建ArrayList集合的对象(是一个容器，大小可变，数据可以重复，有索引)
//        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<>();//JDK7之后后面类型可以不写
        list.add("java1");
        list.add("java1");
//        list.add(100);
//        list.add(99.5);
        list.add("金庸");
        System.out.println(list);
        ///2.插入数据
        list.add(1,"嵌入式");
        System.out.println(list);
        ///3.根据索引获取数据：list = [java1, 嵌入式, java1, 金庸]
        //                          0     1         2     3
        String ele = list.get(3);
        System.out.println(ele);
        ///4.获取集合的大小(元素个数)
        System.out.println("集合的元素个数:"+list.size());
        ///5.根据索引删除数据，删除的元素返回
        System.out.println(list.remove(1));
        System.out.println(list);
///      6.直接删除数据，返回真假，默认只能删除第一个出现的
        System.out.println(list.remove("java1"));
        System.out.println(list);
        ///7.修改某个索引位置处的数据,返回修改修改前的数据：list=[java1, 金庸]
        System.out.println(list.set(1, "古龙"));
        System.out.println(list);
    }
}
