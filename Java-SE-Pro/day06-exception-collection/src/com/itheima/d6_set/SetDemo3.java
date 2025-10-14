package com.itheima.d6_set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        //目标：理解hashSet集合去重复
        //set集合去重复的原理：
        //      首先拿对象的哈希值对底层数组长度运算，得到数据存入的位置，
        //      然后跟该位置里的元素进行equals比较，如果返回true，才算重复

        //需求：如果希望两个内容一样的不同对象就是重复的
        //必须重写他们类的hashCode和equals方法
        Set<Student> sets = new HashSet<>();//无序，不重复，无索引
        Student s1 = new Student("张继科",'男', "借钱");
        Student s2 = new Student("林丹",'男', "打羽毛球");
        Student s3 = new Student("景甜",'女', "old张继科");
        Student s4 = new Student("景甜",'女', "old张继科");

        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        //内容一样,hash值不一样
        sets.add(s1);
        sets.add(s2);
        sets.add(s3);
        sets.add(s4);


        System.out.println(sets);
    }
}
