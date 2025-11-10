package com.itheima.d3_thread_safe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String cardId;
    private double money;

    //小明小红拿同一个账户对象acc取钱
    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        if (this.money >= money) {
            System.out.println(name + "取钱成功，吐出：" + money);
            //更新余额
            this.money-=money;
            System.out.println(name+"取钱成功后，账户余额剩余："+this.money);
        } else {
            System.out.println(name + "来取钱：余额不足！");
        }
    }
}
