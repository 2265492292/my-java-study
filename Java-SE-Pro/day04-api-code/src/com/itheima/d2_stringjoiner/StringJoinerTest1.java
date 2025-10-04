package com.itheima.d2_stringjoiner;

import java.util.StringJoiner;

public class StringJoinerTest1 {
    public static void main(String[] args) {
        //目标：使用StringJoiner完成对字符串的拼接操作
        int[] arr = {11, 44, 33, 66};
        System.out.println(getArrayData(arr));
    }

    public static String getArrayData(int[] arr) {
        if (arr == null) return null;
        //创建StringJoiner对象
        //参数1：间隔符   参数2：开始符合    参数3：结束符合
        StringJoiner sb = new StringJoiner(",","[","]");
        //遍历数组的内容
        for (int i = 0; i < arr.length; i++) {
            sb.add(Integer.toString(arr[i]));
        }
        return sb.toString();
    }
}
