package com.itheima.d5_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        //目标：掌握List的遍历方式
        //1.创建一个List集合对象（一行经典代码）
        List<String> list =new ArrayList<>();
        list.add("金毛狮王");
        list.add("谢逊");
        list.add("白眉");
        list.add("张三丰");
        System.out.println(list);
        //1.for循环（因为List集合有索引）
        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            System.out.println(ele);
        }
        System.out.println("---------------");
        //2.迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //3.增强for循环
        System.out.println("---------------");
        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("---------------");
        //4.Lambda表达式
        list.forEach(name->{
            System.out.println(name);
        });
        System.out.println("-------------");
        //4-2方法引用
        list.forEach(System.out::println);
    }
}
