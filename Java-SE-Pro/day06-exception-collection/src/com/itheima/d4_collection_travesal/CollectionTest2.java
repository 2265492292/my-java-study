package com.itheima.d4_collection_travesal;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest2 {
    public static void main(String[] args) {
        //目标:三种遍历可能出现的并发修改异常问题
        ArrayList<String> list=new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");

        //1.使用迭代器遍历集合并删除枸杞
        //注意1：如果使用迭代器遍历，并用集合删除数据，会出现并发修改异常，程序出现bug
        //注意2：必须调用迭代器自己的删除方法，才不会出现bug
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.contains("枸杞")){
//                list.remove(name);//如果使用迭代器遍历，并用集合删除数据，会出现并发修改异常，程序出现bug
                it.remove();//必须调用迭代器自己的删除方法，才不会出现bug
            }
        }
        System.out.println(list);
        //Concurrent Modification Exception 并发 修改 异常

        //2.使用增强for遍历集合并删除枸杞：(本质就是迭代器) 一定会出错，而且无法解决
        ArrayList<String> list2=new ArrayList<>();
        list2.add("Java入门");
        list2.add("宁夏枸杞");
        list2.add("黑枸杞");
        list2.add("人字拖");
        list2.add("特级枸杞");
        list2.add("枸杞子");
        /*for (String name : list) {
            if (name.contains("枸杞")){
                list2.remove();
                //增强for无法调用迭代器删除方法
            }
        }
         System.out.println(list2);
        */

        //3.lambda遍历集合并删除，一定会出错，而且无法解决（底层用的还是增强for）
        ArrayList<String> list3=new ArrayList<>();
        list3.add("Java入门");
        list3.add("宁夏枸杞");
        list3.add("黑枸杞");
        list3.add("人字拖");
        list3.add("特级枸杞");
        list3.add("枸杞子");
        list3.forEach(name->{
            if (name.contains("枸杞")){
                list3.remove(name);
            }
        });
        System.out.println(list3);

        //注意：如果是Arraylist带索引的集合，可以使用for循环删除，每次退一步，或者从后面倒着遍历并删除
    }
}
