package com.itheima.d6_set;

public class SetDemo2 {
    //哈希值：一个int类型的数值（随机值），Java忠每个对象都有一个哈希值
    //Java中的所有对象，都可以调用Object类提供的hashCode方法，返回该对象自己的哈希值
    //对象哈希值的特点：
    //同一个对象多次调用hashCode()方法返回的哈希值是相同的
    //不同的对象，他们的哈希值一般不相同，但也有可能会相同（哈希碰撞）（哈希值是int(-21e~~21e）
    public static void main(String[] args) {
        //目标：拿到对象的哈希值
        String name1 ="abc";
        String name2 ="scB";
        //备注：不同对象的哈希值大概率不相同，但可能存在相同的情况
        System.out.println(name1.hashCode());
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
    }

}
