package com.itheima.d8_thread_pool;

import java.util.concurrent.*;

public class ThreadExecutorDemo2 {
    public static void main(String[] args) {
        //目标：创建线程池对象
        //1.创建线程池
        /*public ThreadPoolExecutor(int corePoolSize,       线程池的核心线程数量
                                    int maximumPoolSize,    线程池的最大线程数量
                                    long keepAliveTime,     临时线程的存活时间
                                    TimeUnit unit,          存活时间的时间单位（秒，分，时，天）
                                    BlockingQueue<Runnable> workQueue,      线程池的任务队列
                                    ThreadFactory threadFactory,            线程池的线程工厂
                                    RejectedExecutionHandler handler)     线程池的任务拒绝策略*/
        ExecutorService pool =new ThreadPoolExecutor(3,5,1, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

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
