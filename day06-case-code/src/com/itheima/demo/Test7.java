package com.itheima.demo;

public class Test7 {
    public static void main(String[] args) {
        //101到200之间的素数
        //遍历
        int count=0;
        for (int i = 101; i <=200 ; i++) {
            //判断
            boolean flag = true;
            for (int j = 2; j <=i/2 ; j++) {
                if (i%j==0) {
                    //此时肯定不是素数
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("个数："+count);
    }
}
