package com.itheima.d3_recursion;

public class RecursionTest2 {
    public static void main(String[] args) {
        //目标：递归的算法基础：解决求阶乘
        //递归三要素：公式、终结点:f(1)、递归的方向必须走向终结点
        System.out.println(f(5));
    }

    public static int f(int n) {
        if (n == 1) {
            return 1;
        }
        return f(n - 1) * n;
    }
}
