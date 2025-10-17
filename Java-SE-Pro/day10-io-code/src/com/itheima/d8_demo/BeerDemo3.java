package com.itheima.d8_demo;
//答案：15 3 1
public class BeerDemo3 {
    public static int totalNumber;
    public static int lastCoverNumber;
    public static int lastBottleNumber;

    public static void main(String[] args) {
        //目标：啤酒问题：一瓶啤酒2元，4个盖子换一瓶，2个空瓶换一瓶，10元喝多少瓶？剩多少盖子和空瓶
        buy(10);
        System.out.println("总数是：" + totalNumber);
        System.out.println("剩余盖子：" + lastCoverNumber);
        System.out.println("剩余空瓶：" + lastBottleNumber);
    }

    public static void buy(int money) {
        //1.拿钱买酒：买多少瓶
        int number = money / 2;
        totalNumber += number;

        //2.计算出本轮总共的空瓶和盖子数量，换算成钱继续递归买酒
        int totalCoverNumber = lastCoverNumber + number;
        int totalBottleNumber = lastBottleNumber + number;

        //3.换算成钱，继续买酒
        int allMoney = 0;
        if (totalCoverNumber >= 4) {
            allMoney += (totalCoverNumber / 4) * 2;
        }
        lastCoverNumber = totalCoverNumber % 4;//记录剩余盖子数
        if (totalBottleNumber >= 2) {
            allMoney += (totalBottleNumber / 2) * 2;
        }
        lastBottleNumber = totalBottleNumber % 2;//记录剩余瓶子数
        if (allMoney >= 2) {
            buy(allMoney);
        }
    }
}
