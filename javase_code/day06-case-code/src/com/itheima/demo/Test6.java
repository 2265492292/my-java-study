package com.itheima.demo;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        //抽奖
        int[] money = {9, 666, 188, 520, 99999};
        start(money);
    }

    public static void start(int[] money) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i < money.length; i++) {

            System.out.println("请" + (i + 1) + "号粉丝抽奖：");
            sc.next();//暂停等待回车
            while (true) {//crtl+alt+t
                int index = r.nextInt(money.length);
                int redMoney = money[index];
                //红包不存在重新抽
                if (redMoney != 0) {
                    //有钱，给她
                    System.out.println("恭喜你，中奖：" + redMoney + "元");
                    money[index]=0;
                    break;
                }
            }
        }
    }
}
