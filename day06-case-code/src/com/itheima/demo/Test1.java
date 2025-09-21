package com.itheima.demo;

public class Test1 {
    public static void main(String[] args) {
        double price = calculate(1000, 9, "头等舱");
        System.out.println("优惠价是:" + price);
        ;
    }

    public static double calculate(double price, int month, String type) {
        //淡季还是旺季
        if (month >= 5 && month <= 10) {
//            旺季
//            进行值匹配
            switch (type) {
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *= 0.85;
                    break;
            }
        } else {
//            淡季
            switch (type) {
                case "头等舱":
                    price *= 0.7;
                    break;
                case "经济舱":
                    price *= 0.65;
                    break;
            }
        }
        return price;
    }
}
