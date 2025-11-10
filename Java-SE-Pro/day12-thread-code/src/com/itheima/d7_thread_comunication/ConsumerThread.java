package com.itheima.d7_thread_comunication;

//消费者线程
public class ConsumerThread extends Thread {
    private Desk desk;

    public ConsumerThread(Desk desk, String name) {
        super(name);
        this.desk = desk;
    }

    @Override
    public void run() {
        //良子 老八
        while (true) {
            try {
                Thread.sleep(1000);
                desk.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
