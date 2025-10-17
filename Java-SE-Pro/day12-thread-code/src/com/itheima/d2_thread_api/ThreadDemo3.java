package com.itheima.d2_thread_api;

public class ThreadDemo3 {
    public static void main(String[] args) throws Exception {
        //目标：join线程
        Thread t = new MyThread2();
        t.start();

        for (int i = 0; i < 4; i++) {
            System.out.println("main线程输出：" + i);
            if (i==2){
                t.join();//让t插队先完成执行
            }
        }
    }
}

//1.定义一个类继承Thread类，成为线程类
class MyThread2 extends Thread {
    //2.重写run方法，声明线程要干的事情
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("子线程输出:" + i);
        }
    }
}