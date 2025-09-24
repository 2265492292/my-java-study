package com.itheima.d4_innerclass4;

public class Test2 {
    public static void main(String[] args) {
        //目标：匿名内部类的使用场景：通过作为一个对象参数传给方法使用
        Swimming s1 =new Swimming() {
            @Override
            void swim() {
                System.out.println("学生🏊‍很快");
            }
        };
        go(s1);

        go(new Swimming() {
            @Override
            void swim() {
                System.out.println("老师🏊‍很慢");
            }
        });
    }
    public static void go(Swimming s){
        System.out.println("===开始===");
        s.swim();
        System.out.println("===结束===");
    }
}

//需求：学生和老师一起参加一次游泳比赛
abstract class Swimming{
    abstract void swim();
}