package com.itheima.d3_thread_safe;

public class DrawThread extends Thread{
    private Account acc;
    //取钱线程类
    public DrawThread(String name, Account acc){
        super(name);
        this.acc=acc;
    }

    //小明 小红
    @Override
    public void run (){
        //小明，小红拿同一个账户对象acc取钱
        acc.drawMoney(100000);
    }
}
