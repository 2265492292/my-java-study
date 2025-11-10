package com.itheima.d7_thread_comunication;

//生产者线程
public class MakeThread extends Thread{
    private Desk desk;

    public MakeThread(Desk desk, String name){
        super(name);
        this.desk=desk;
    }

    @Override
    public void run() {
        //唐仁杰 狗不理 小鱼
        while (true) {
            try {
                Thread.sleep(1000);
                desk.put();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
