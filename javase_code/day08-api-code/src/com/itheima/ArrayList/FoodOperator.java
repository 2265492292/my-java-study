package com.itheima.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//菜品操作类
public class FoodOperator {
    //1.准备一个容器，存储上架的全部菜品
    private ArrayList<Food> allFoods = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void start() {
        while (true) {
            System.out.println("===========商家管理系统===========");
            System.out.println("1.上架菜品");
            System.out.println("2.下架菜品(作业)");
            System.out.println("3.展示菜品");
            System.out.println("请您输入操作功能：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //独立功能独立方法
                    addFood();
                    break;
                case 2:
                    break;
                case 3:
                    showAllFoods();
                    break;
                default:
                    System.out.println("输入有误，请重新输入！");
            }
        }
    }

    public void addFood() {
        System.out.println("============上架菜品============");
        //a.用户每上架一次菜品实际上就是在集合中新增一个菜品对象
        Food f = new Food();
        //b.为菜品对象注入菜品的数据
        System.out.println("请输入菜品名称：");
        String name = sc.next();
        f.setName(name);
        System.out.println("请输入菜品价格：");
        double price = sc.nextDouble();
        f.setPrice(price);
        System.out.println("请输入菜品描述：");
        String desc = sc.next();
        f.setDesc(desc);

        //c.将菜品对象添加到集合容器中
        allFoods.add(f);
        System.out.println("菜品上架成功！");
    }

    private void showAllFoods() {
        System.out.println("============展示菜品============");
        for (int i = 0; i < allFoods.size(); i++) {
            Food food = allFoods.get(i);
            System.out.println(food.getName()+"\t"+food.getPrice()+"\t"+food.getDesc());
        }
    }
}
