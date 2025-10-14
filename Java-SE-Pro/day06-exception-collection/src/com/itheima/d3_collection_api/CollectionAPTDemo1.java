package com.itheima.d3_collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionAPTDemo1 {
    public static void main(String[] args) {
        //目标：掌握Collection提供的常用方法，是全部单列集合都可以直接用的
//        Collection特点：有序、可重复、有索引
        Collection<String> list = new ArrayList<>();//多态写法：父类(collection)引用指向子类对象(ArrayList)
//        多态的前提，存在<继承><重写>
//        Collection->接口,ArrayList->实现
        //多态的优点：更加灵活，可替换性好
        //缺点：不能调用子类独有方法：Arraylist独有方法
        //1.添加数据 boolean add(E e)
        list.add("java1");
        list.add("java1");
        list.add("赵敏");
        list.add("赵敏");
        list.add("小昭");
        list.add("灭绝师太");
        System.out.println(list);//[java1, java1, 赵敏, 赵敏, 小昭, 灭绝师太]

        //2.清空集合
//        list.clear();
        System.out.println(list);
        //3.判断集合是否为空
        System.out.println(list.isEmpty());
        //4.直接删除集合中的某个数据：默认只能删除第一个java1
        System.out.println(list.remove("java1"));
        System.out.println(list);
        //5.判断集合中是否包含某个数据
        System.out.println(list.contains("java1"));//true
        System.out.println(list.contains("Java1"));//false
        //6.获取集合中的包含某个数据
        System.out.println(list.size());
        //7.把集合转化成数组
        Object[] array = list.toArray();//转成Object->可能集合中可能有其他类型数组
        //toArray自动创建大小相同的Object数组
        System.out.println(Arrays.toString(array));
        //转成字符串数组
        //拓展
        String[] arrays = list.toArray(String[]::new);//方法引用
        System.out.println(Arrays.toString(arrays));

        //8.拓展：把别人的集合加给自己
        Collection<String> c1=new ArrayList<>();
        c1.add("java1");
        c1.add("java1");

        Collection<String> c2 = new ArrayList<>();
        c2.add("java2");
        c2.add("java2");
        c1.addAll(c2);
        //把c2集合的数据加入到c1-->拷贝
        System.out.println(c1);
    }
}
