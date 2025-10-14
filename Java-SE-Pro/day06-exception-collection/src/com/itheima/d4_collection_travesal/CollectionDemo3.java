package com.itheima.d4_collection_travesal;

import java.util.ArrayList;
import java.util.function.Consumer;

public class CollectionDemo3 {
    public static void main(String[] args) {
        //目标：掌握Collection集合的遍历方式三：lambda表达式
        //1.准备一个集合
        ArrayList<String> list = new ArrayList<>();
        list.add("赵敏");
        list.add("古力娜扎");
        list.add("马儿扎哈");

        /*list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);//用System. out对象引用它的println方法
    }
}
