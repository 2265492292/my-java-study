package com.itheima.d2_thread_api;

public class ThreadDemo2 {
    public static void main(String[] args) throws Exception {
        //目标：掌握线程休眠，线程join
        for (int i = 0; i < 5; i++) {
            System.out.println("输出"+i);
            //作用，让当前线程执行的慢一点
            Thread.sleep(1000);//休眠1s后再执行
        }
    }
}
