package com.itheima.d3_thread_safe;

public class Test {
    public static void main(String[] args) {
        //目标：模拟线程安全问题
        //1.创建一个账户对象，两个人共享
        Account acc=new Account("ICBC-123",100000);

        //2.创建两个线程代表小明和小红，共同去一个账户取钱
        new DrawThread("小明",acc).start();
        new DrawThread("小红",acc).start();
    }
}
