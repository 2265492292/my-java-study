package com.itheima.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args){
        //掌握从容器中删除数据的技巧
        //1.准备一个集合，存储商品
        ArrayList<String> list = new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");
        System.out.println(list);
//        list=[Java入门, 宁夏枸杞, 黑枸杞, 人字拖, 特级枸杞, 枸杞子]
//        list=[Java入门, 黑枸杞, 人字拖, 枸杞子]
        //遍历集合中的每个数据，只要包含"枸杞"，就删除
        for (int i = 0; i < list.size(); i++) {
            String name=list.get(i);
            if (name.contains("枸杞")){
                list.remove(name);
                i--;//删除一个元素，索引会自动减1,保证索引的指向正确
            }
        }
        System.out.println(list);
        System.out.println("--------------------");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java入门");
        list2.add("宁夏枸杞");
        list2.add("黑枸杞");
        list2.add("人字拖");
        list2.add("特级枸杞");
        list2.add("枸杞子");
        //解决方案二：从后面倒着遍历并删除就没有问题
        for (int i = list2.size()-1; i >=0; i--) {
            String name=list2.get(i);
            if (name.contains("枸杞")) {
                //删除
                list2.remove(name);
            }
        }
        System.out.println(list2);
    }
}
