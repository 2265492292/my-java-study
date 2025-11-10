package com.itheima.d7_thread_comunication;

public class Test {
    public static void main(String[] args) {
        //目标：线程通信
        //1、竞争一个桌子
        Desk desk = new Desk();
        //2.创建2个消费者线程
        new ConsumerThread(desk,"良子").start();
        new ConsumerThread(desk,"老八").start();

        //3.创建3个生产者线程
        new MakeThread(desk,"唐仁杰").start();
        new MakeThread(desk,"狗不理").start();
        new MakeThread(desk,"小鱼").start();
    }
}
