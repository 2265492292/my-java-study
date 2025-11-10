package com.itheima.d8_thread_pool;

import java.util.concurrent.Callable;

//1.定义一个类实现Callable接口
class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    //2.重写Call方法,声明任务和返回的结果
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return Thread.currentThread().getName()+"子线程求和1-" + n + "的结果是：" + sum;
    }
}
