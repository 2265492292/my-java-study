package com.itheima.d1_param;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //目标：掌握可变参数的使用
        //需求：求任意个整数数据的和
        sum();//不传参
        sum(10);//传一个参
        sum(20,15,32,100);//传多个参
        sum(new int[]{10,20,30,40});//传一个数组
    }
    //作用：接收数据非常灵活
    //注意事项：
    //      可变参数在形参列表中只能出现一个
    //      可变参数必须放在形参列表的最后面
    public static void sum(int...nums){
        //本质：可变参数在方法内部本质就是一个数组
        System.out.println("个数："+nums.length);
        System.out.println("内容："+ Arrays.toString(nums));
    }
}
