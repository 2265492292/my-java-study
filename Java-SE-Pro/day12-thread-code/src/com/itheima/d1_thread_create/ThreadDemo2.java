package com.itheima.d1_thread_create;

public class ThreadDemo2 {
    public static void main(String[] args) {
        //目标：掌握多线程的创建方式二：实现Runable接口的方式
        //3.创建任务类的一个对象
        Runnable target =new MyRunable();
        //4.把任务对象交给线程对象
        //public Thread(Runnable target)
//        Thread t =new Thread(target);
        Thread t =new Thread(target,"一号");
        //5.启动线程
        t.start();
        for (int i = 0; i < 4; i++) {
            System.out.println("main线程输出：" + i);
        }
    }
}

//1.定义一个任务类实现Runable接口
class MyRunable implements Runnable {
    //2.重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("子线程输出:" + i);
        }
    }
}
