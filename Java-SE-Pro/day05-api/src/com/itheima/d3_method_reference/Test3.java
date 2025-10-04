package com.itheima.d3_method_reference;

import java.util.Arrays;
import java.util.Comparator;

public class Test3 {
    public static void main(String[] args) {
        //目标：特定类型方法引用
        String[] names = {"dlei", "Angela", "baby", "caocao", "Coach", "曹操", "deby", "eason", "andy"};
        //对他们排序(默认按照首字母编号排序)
        //拓展(忽略大小写排序)
//        Arrays.sort(names);
        /*Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //o1  Angela
                //o2  andy
                return o1.compareToIgnoreCase(o2);
            }
        });*/

//        Arrays.sort(names, (o1, o2) -> o1.compareToIgnoreCase(o2));
        //如果某个lambda表达式只是调用一个实例方法，并且前面参数列表中的第一个参数式作为方法的主调，
        // 后面的所有参数都是作为该实例方法的入参的，则此时就可以使用特定类型的方法引用
        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names));

    }
}
