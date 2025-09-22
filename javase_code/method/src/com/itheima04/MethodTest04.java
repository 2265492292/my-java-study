package com.itheima04;

public class MethodTest04 {
    public static void main(String[] args) {
//        boolean flag = isFlower(111);
//        System.out.println(flag);
//
//        flag=isFlower(153);
//        System.out.println(flag);

        for (int i = 100; i < 1000; i++) {
//            boolean flag = isFlower(i);
//            if (flag) {
//                System.out.println(i);
//            }
            if (isFlower(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isFlower(int number) {
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == number) {
            return true;
        } else {
            return false;
        }
    }
}
