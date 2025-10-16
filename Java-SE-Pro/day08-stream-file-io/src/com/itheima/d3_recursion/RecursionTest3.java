package com.itheima.d3_recursion;

public class RecursionTest3 {
    public static void main(String[] args) {
        //目标：递归的算法基础：解决求和
        System.out.println("1-5的和：" + f(6));
    }

    public static int f(int n) {
        if (n == 1) {
            return 1;
        } else {
            return f(n - 1) + n;//方法递归
        }
    }
}
