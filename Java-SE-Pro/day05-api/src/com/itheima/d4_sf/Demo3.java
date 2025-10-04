package com.itheima.d4_sf;

public class Demo3 {
    public static void main(String[] args) {
        //二分查找
        //前提条件：数据必须是有序的
        int[] array = {7, 23, 79, 81, 103, 127, 131, 147};
        int index = secrchDataIndex(array, 79);
        System.out.println("79的索引是:" + index);

        int index2 = secrchDataIndex(array, 179);
        System.out.println("179的索引是:" + index2);
    }

    public static int secrchDataIndex(int[] array, int number) {
        //1.定义头尾指针
        int left = 0;
        int right = array.length - 1;
        //2.开始二分查找
        while (left <= right) {
            //3.取中间索引
            int middle = (left + right) / 2;
            //4.判断当前要找的数据与中间数据大小情况
            if (number > array[middle]) {
                left = middle + 1;
            } else if (number < array[middle]) {
                right = middle - 1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
