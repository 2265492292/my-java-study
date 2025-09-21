package com.itheima;

public class ControlTest {
    public static void main(String[] args) {
        double money = 0;
        int day = 0;
        while (money < 100) {
            money += 2.5;
            day++;
            if (day % 5 == 0) {
                money -= 6;
            }
        }
        System.out.println(day);
    }
}

//public class ControlTest {
//    public static void main(String[] args) {
//        double dayMoney=2.5;
//        double sumMoney = 0;
//        int result = 100;
//        int day = 1;
//        while (true){
//            sumMoney+=dayMoney;
//            if (sumMoney>=result){
//                break;
//            }
//            if (day%5==0){
//                sumMoney-=6;
//                System.out.println("第"+day+"天花了6元");
//            }
//            day++;
//        }
//        System.out.println("共花了"+day+"天存了100元");
//    }
//}
