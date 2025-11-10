package com.itheima.d7_thread_comunication;

import lombok.Data;

@Data
public class Desk {
    private String data;//包子数据

    //良子 老八
    public synchronized void get() throws Exception {//加锁
        String name = Thread.currentThread().getName();
        if (data == null) {
            //没包子，暂停自己，唤醒别人
            this.notifyAll();
            this.wait();//先唤醒别人再暂停
        } else {
            //有包子，开始吃
            System.out.println(name + "吃了：" + data);
            data = null;
            this.notifyAll();
            this.wait();
        }
    }

    //唐仁杰 狗不理 小鱼
    public synchronized void put() throws Exception {
        String name = Thread.currentThread().getName();
        if (data == null){
//            没包子，做包子
            data=name+"做的肉包子";
            System.out.println(name+"生产了一个肉包子");
            this.notifyAll();
            this.wait();
        }else {
            //有包子
            this.notifyAll();
            this.wait();
        }
    }
}
