package com.itheima.d5_list;

import java.util.ArrayList;

public class ListTest3 {
    public static void main(String[] args) {
        //底层基于数组：根据索引查询快，增删相对较慢，使用于数据量小，增删少的场景，也是开发中常见的方式
        ArrayList<String> list = new ArrayList<>();
        list.add("java1");//第一次加数据开始扩容
        list.add("java2");
        list.add("java3");
        list.add("java4");
        list.add("java5");
        list.add("java6");
        list.add("java7");
        list.add("java8");
        list.add("java9");
        list.add("java10");
        list.add("java11");

        list.remove(2);
        list.remove("java3");
    }
}
