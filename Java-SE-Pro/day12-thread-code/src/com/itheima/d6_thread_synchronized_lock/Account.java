package com.itheima.d6_thread_synchronized_lock;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
@NoArgsConstructor
public class Account {
    private String cardId;
    private double money;
    private final Lock lk = new ReentrantLock();

    //加final保护
    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    //小明小红拿同一个账户对象acc取钱
    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();

        try {
            lk.lock();
            //不想让lk参与有参构造器
            if (this.money >= money) {
                System.out.println(name + "取钱成功，吐出：" + money);
                //更新余额
                this.money -= money;
                System.out.println(name + "取钱成功后，账户余额剩余：" + this.money);
            } else {
                System.out.println(name + "来取钱：余额不足！");
            }
        } finally {
            lk.unlock();
        }
    }
}
