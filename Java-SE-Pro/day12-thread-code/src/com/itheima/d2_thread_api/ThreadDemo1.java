package com.itheima.d2_thread_api;

public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread("1号线程");
        //t1.setName("1号线程");
        t1.start();
        System.out.println(t1.getName());//Thread-0

        Thread t2 = new MyThread("2号线程");
        t2.start();
        System.out.println(t2.getName());//Thread-1

        //这行代码是哪个线程在执行，就会得到哪个线程对象
        Thread m = Thread.currentThread();
        m.setName("最牛的");
        System.out.println(m.getName());//main

        for (int i = 0; i < 4; i++) {
            System.out.println(m.getName() + "线程输出：" + i);
        }
    }
}

//1.定义一个类继承Thread类，成为线程类
class MyThread extends Thread {
    public MyThread(String name){
        super(name);
    }
    //2.重写run方法，声明线程要干的事情
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(Thread.currentThread().getName() + "子线程输出:" + i);
        }
    }
}