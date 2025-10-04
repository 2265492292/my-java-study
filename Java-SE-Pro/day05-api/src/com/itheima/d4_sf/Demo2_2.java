package com.itheima.d4_sf;

import java.util.Arrays;

public class Demo2_2 {
    public static void main(String[] args) {
        //实现选择排序
        //1.定一个数组
        int[] arr = {5, 1, 3, 2};
        //2.定义一个循环控制轮数
        for (int i = 0; i < arr.length - 1; i++) {
//            轮数(i)    次数      j的占位
//                0     3         1 2 3
//               1      2           2 3
//                2     1           3
            //定义一个变量记住本轮最小值对应的索引
            int min = i;
            //3.内部循环控制选择次数
            for (int j = i + 1; j < arr.length; j++) {
                //4.判断j对应位置处的数据是否小于当前i位置处的数据
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min!=i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
