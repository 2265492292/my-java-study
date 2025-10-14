package com.itheima.d5_list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        //目标：掌握List的特有方法
        //1.创建一个List集合对象
        List<String> list = new ArrayList<>();//多态--经典
        list.add("张无忌");
        list.add("周芷若");
        list.add("小昭");
        list.add("朱九真");
        //2.给某个位置插入一个数据
        list.add(1,"赵敏");
        System.out.println(list);
        //3.根据索引删除数据
        System.out.println(list.remove(2));
        System.out.println(list);
        //4.修改索引处的位置
        list.set(2,"灭绝师太");
        System.out.println(list);
        //5.根据索引取数据
        System.out.println(list.get(2));
    }
}
