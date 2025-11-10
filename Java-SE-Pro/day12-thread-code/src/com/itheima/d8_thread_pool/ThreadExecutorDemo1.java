package com.itheima.d8_thread_pool;

import java.util.concurrent.*;

public class ThreadExecutorDemo1 {
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
        Runnable target =new MyRunable();
        pool.execute(target);   //自动创建线程，并处理此任务
        pool.execute(target);   //自动创建线程，并处理此任务
        pool.execute(target);   //自动创建线程，并处理此任务
        pool.execute(target);   //任务队列有3个位置，核心线程占满之后进入队列等待
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);   //任务队列占满，启动临时线程
        pool.execute(target);   //任务队列占满，启动临时线程
        pool.execute(target);   //超过最大线程数量，抛出异常


        //3.线程池没有死亡
//        pool.shutdownNow();//立即关闭，不管任务是否完成；返回没有执行完的任务
//        pool.shutdown();
        //开发中一般不会关闭线程池

    }
}
