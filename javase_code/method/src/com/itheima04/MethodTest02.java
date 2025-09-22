package com.itheima04;

public class MethodTest02 {
    public static void main(String[] args) {
        boolean flag = compare(10, 20);
        System.out.println("10和20相等吗：" + flag);
        flag = compare(10, 10);
        System.out.println("10和10相等吗：" + flag);
    }

    public static boolean compare(int a, int b) {
//        if(a==b){
//            return true;
//        }else {
//            return false;
//        }

//        boolean flag = (a == b) ? true : false;
//        return flag;

//        boolean flag = (a == b);
//        return flag;

        return (a == b);
    }
}
