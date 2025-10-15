package com.itheima.d3_collection_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Room {
    //准备一副牌
    private ArrayList<Card> allCards = new ArrayList<>();

    //2.初始化54张牌
    {
        //3.准备点数：个数确定，类型确定
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //4.准备花色：个数确定，类型确定 ->数组
        String[] colors = {"♠", "♥", "♣", "♦"};
        //5.准备组装每一张牌对象
        int size = 0;
        for (String number : numbers) {
            size++;
            for (String color : colors) {
                //6.创建牌对象封装这张牌数据
                Card c = new Card(number, color, size);
                //7.加入到集合中去
                allCards.add(c);
            }
        }
        //8.单独加入大小王
        allCards.add(new Card("", "🃏", ++size));
        allCards.add(new Card("", "👲", ++size));
        System.out.println("新牌是:" + allCards);
    }


    public void start() {
        //9.洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后:" + allCards);
        //10.发牌
        //定义三个玩家
        List<Card> lhc = new ArrayList<>();
        List<Card> ryy = new ArrayList<>();
        List<Card> dfbb = new ArrayList<>();
        //发出去51张
        for (int i = 0; i < allCards.size() - 3; i++) {
            Card c = allCards.get(i);
            if (i % 3 == 0) {
                //请阿重接拍
                lhc.add(c);
            } else if (i % 3 == 1) {
                ryy.add(c);
            } else if (i % 3 == 2) {
                dfbb.add(c);
            }
        }
        //拿到最后三张牌
        List<Card> lastThreeCards = allCards.subList(allCards.size() - 3, allCards.size());
        //抢地主
        ryy.addAll(lastThreeCards);
        //11.对牌排序(作业)
        sortCards(lhc);
        sortCards(ryy);
        sortCards(dfbb);
        //12.看牌
        System.out.println("阿冲：" + lhc);
        System.out.println("阿盈：" + ryy);
        System.out.println("阿败：" + dfbb);
    }

    private void sortCards(List<Card> crads) {
        Collections.sort(crads, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                //o1 ♣
                //o2 👲
                return o2.getSize() - o1.getSize();
            }
        });
    }
}
