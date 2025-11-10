package com.itheima.d8_thread_pool;

public class MyRunable implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName()+" 输出:"+i);
            System.out.println(Thread.currentThread().getName()+"线程进入休眠！");
            try {
                Thread.sleep(Integer.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
