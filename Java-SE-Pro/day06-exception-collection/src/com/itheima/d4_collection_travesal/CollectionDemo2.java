package com.itheima.d4_collection_travesal;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo2 {
    public static void main(String[] args) {
        //目标：掌握Collection集合的遍历方式二：增强for(foreach遍历)
        //数组、集合都可以用
        //1.准备一个集合
        ArrayList<String> list = new ArrayList<>();
        list.add("赵敏");
        list.add("古力娜扎");
        list.add("马儿扎哈");
        //2.增强for循环遍历集合
        for (String s : list) {
            System.out.println(s);
        }
        //3.增强for也可以遍历数组
        int[] ages ={19,18,23};
        for (int age :ages){
            System.out.println(age);
        }
//        s和age只是接受数据的，无法直接修改数组或集合中的数据
    }
}
