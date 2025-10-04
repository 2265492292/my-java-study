package com.itheima.d1_stringbuilder;

public class StringBuilderTest3 {
    public static void main(String[] args) {
        //目标：使用StringBuilder完成对字符串的拼接操作
        int[] arr = {11, 44, 33, 66};
        System.out.println(getArrayData(arr));
    }

    public static String getArrayData(int[] arr) {
        if (arr == null) return null;
        //创建StringBuilder对象
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        //遍历数组的内容
        for (int i = 0; i < arr.length; i++) {
            int data = arr[i];
            sb.append(data).append(i == arr.length - 1 ? "" : ",");
        }
        sb.append("]");
        return sb.toString();
    }
}
