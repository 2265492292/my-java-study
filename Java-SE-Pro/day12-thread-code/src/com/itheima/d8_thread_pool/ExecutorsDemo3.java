package com.itheima.d8_thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsDemo3 {
    public static void main(String[] args) {

        //目标：创建线程池对象
        //1.用Executors创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);
        //2.处理任务
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));

        try {
            String s = f1.get();
            System.out.println(s);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String s = f2.get();
            System.out.println(s);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String s = f3.get();
            System.out.println(s);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
