package com.itheima.d8_genericity_class;

public class Test {
    public static void main(String[] args) {
        //目标：掌握泛型类的定义
        //需求：模拟ArrayList集合，定义一个MyArrayList的泛型类
        MyArrayList<String> list =new MyArrayList<String>();
        list.add("张无忌");
        list.add("赵敏");
        list.add("周芷若");
        list.remove("周芷若");
        System.out.println(list);
    }
}
