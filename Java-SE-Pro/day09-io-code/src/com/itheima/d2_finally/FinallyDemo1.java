package com.itheima.d2_finally;

public class FinallyDemo1 {
    public static void main(String[] args) {
        //目标：认识finally的作用
        //try或者catch后，一定会执行，除非JVM挂了
        try {
            System.out.println(10 / 2);
//            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("===============finally==============");
        }
        System.out.println(divide());
    }
    public static int divide(){
        try {
            return 10/2;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        } finally {
            System.out.println("===============finally2==============");
            return 100;//不要在finally中返回数据，会覆盖前面所有的数据
        }
    }
}
