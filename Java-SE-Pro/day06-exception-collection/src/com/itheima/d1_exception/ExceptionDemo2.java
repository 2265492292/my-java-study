package com.itheima.d1_exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        //目标：学习异常的作用
        System.out.println("开始");
        try {
            //监视代码
            System.out.println(divide(10, 2));
            System.out.println("成功了");
        } catch (Exception e) {
            System.out.println("失败了");
            //捕获异常并打印出异常信息
            e.printStackTrace();//打出这个异常信息
//            throw new RuntimeException(e);
        }
        System.out.println("结束");
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("参数有问题");
//            return -1;
            //抛出一个异常作为返回值，通知上层，这里出现了bug
            throw new RuntimeException("/by 0!");
        }
        int c = a / b;
        return c;
    }
}
