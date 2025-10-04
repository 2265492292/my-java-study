package com.itheima.d1_array;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class arraysDemo1 {
    public static void main(String[] args) {
        //目标：掌握操作数组的工具类：Arrays的常见方法
        //1.返回数组内容：public static String toString(类型[] a)
        int[] arr = {11, 55, 33, 22, 98};
        System.out.println(arr);
        String result = Arrays.toString(arr);
        System.out.println(result);

        //2.拷贝数组的内容到一个新的数组，并返回新数组
        //public static 类型[] copyOfRange(类型[] original, int from, int to)
        int[] arr2 = Arrays.copyOfRange(arr, 1, 4);
        System.out.println(Arrays.toString(arr2));

        //3.给数组扩容
        //public static 类型[] copyOf(类型[] original, int newLength)
        int[] arr3 =Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(arr3));

        //4.修改数字中的每个数据，再存入
        double[] scores={99.5,90,59.5,78,55};
        //需求：为每个分数加10
        Arrays.setAll(scores, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return scores[value]+10;
            }
        });
        System.out.println(Arrays.toString(scores));

        //5.Arrays类提供的对数组进行排序的操作
        Arrays.sort(scores);//升序排序(由小到大)
        System.out.println(Arrays.toString(scores));
    }
}
