package com.itheima.d4_collection_travesal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {
        //目标：掌握Collection集合的遍历方式一：迭代器遍历
        //
        //1.准备一个集合
        Collection<String> list =new ArrayList<>();
        list.add("赵敏");
        list.add("古力娜扎");
        list.add("马儿扎哈");
        System.out.println(list);
        //list=[赵敏，古力娜扎，马儿扎哈]
//              it
        //2得到这个集合对象的迭代器对象
        Iterator<String> it = list.iterator();
        /*
        System.out.println(it.next());//取完之后取下一个
        System.out.println(it.next());//取完之后取下一个
        System.out.println(it.next());//取完之后取下一个*/
//        System.out.println(it.next());//NoSuchElementException  没有此元素异常
        //3.使用循环改进
        while (it.hasNext()){
            String ele =it.next();
            System.out.println(ele);
        }
    }
}
