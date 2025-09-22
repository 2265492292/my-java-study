package com.itheima.demo;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
//        评委打分
        double score = start(6);
        System.out.println("选手最终得分是:" + score);
    }



    public static double start(int number) {
        //1.定义一个长度为number的数组，用于存储评委的打分
        double[] scores = new double[number];
        //遍历整个数组，录入分数
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+(i+1)+"位评委的打分:");
            double score = sc.nextDouble();
//            判断分数是否在0-100之间
            if (score < 0 || score > 100) {
                System.out.println("您输入的分数必须在0-100之间");
                i--;
                continue;
            }
            //存储打分
            scores[i] = score;
        }
        //找出最高分，最低分，总分
        double max = scores[0];
        double min = scores[0];
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            double score = scores[i];
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
            sum += score;
        }
        System.out.println("最高分"+max);
        System.out.println("最低分"+min);
        return (sum-max-min)/(number-2);
    }
}
