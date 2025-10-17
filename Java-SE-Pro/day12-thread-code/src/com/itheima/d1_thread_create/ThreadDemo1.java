package com.itheima.d1_thread_create;

public class ThreadDemo1 {
    //注意：main方法本身就是一条主线程负责执行的
    public static void main(String[] args) {
        //目标：掌握线程的创建方式一：继承Thread类
        //3.创建线程对象代表具体线程
        Thread t = new MyThread();
        //4.启动线程：会自动执行子线程的run()方法
        //直接调run，cpu不会注册新线程执行，此时相当于还是单线程
//        t.run();
        //只有调用strat()方法才是启动一个新的线程执行
        t.start();
        //不要把主线程任务放在启动子线程之前，这样主线程是先跑完的，相当于单线程的效果
        for (int i = 0; i < 4; i++) {
            System.out.println("main线程输出：" + i);
        }
    }
}

//1.定义一个类继承Thread类，成为线程类
class MyThread extends Thread {
    //2.重写run方法，声明线程要干的事情
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("子线程输出:" + i);
        }
    }
}