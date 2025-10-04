package com.itheima.d4_sf;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        //目标：冒泡算法的实现
        //1.定义一个数组
        int[] arr = {5, 2, 3, 1};
        //           0  1  2  3
        //2.定义一个循环控制冒几轮
        for (int i = 0; i < arr.length - 1; i++) {
            //  轮数(i)       每轮次数        j的占位
            //  第一轮0        3              0 1 2
            //  第二轮1        2              0 1
            //  第三轮2        1              0
            for (int j = 0; j < arr.length - i - 1; j++) {
                //4.判断当前位置j是否大于其后一个位置的数据，若较大，则交换
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
