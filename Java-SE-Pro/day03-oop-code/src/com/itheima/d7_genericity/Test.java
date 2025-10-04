package com.itheima.d7_genericity;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //目标：认识泛型、
        /*ArrayList list = new ArrayList();
        list.add("黑马");
        list.add("深圳");
        list.add("Java");
        list.add(true);
        list.add(false);
        list.add(99.5);

        //1.开发中很多时候需要统一数据类型（如果不使用泛型，类型无法统一，就需要进行强制转换
        for (int i = 0; i < list.size(); i++) {
            Object ele = list.get(i);
            String result = (String) ele;//强制转换
            System.out.println(result);
        }*/
        System.out.println("----------------------------------");
        //ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<>();//JDK1.7 开始，后面类型可以不写
        list2.add("黑马");
        list2.add("深圳");
        list2.add("Java");
//        list2.add(true);//报错
//        list2.add(false);//报错
//        list2.add(99.5);//报错
        for (int i = 0; i < list2.size(); i++) {
            Object ele = list2.get(i);
            String result = (String) ele;//强制转换
            System.out.println(result);
        }
    }
}
