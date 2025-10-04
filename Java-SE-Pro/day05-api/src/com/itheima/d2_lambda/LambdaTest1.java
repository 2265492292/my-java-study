package com.itheima.d2_lambda;

public class LambdaTest1 {
    public static void main(String[] args) {
        //目标：认识lambda时如何简化匿名内部类的
        Animal a1 = new Animal() {
            @Override
            public void run() {
                System.out.println("跑得快");
            }
        };
        a1.run();

        //错误示范：Lambda并不能简化所以匿名内部类的代码。只能简化函数式接口的匿名内部类
/*        Animal a2 = () -> {
            System.out.println("跑得慢");
        };
        a2.run();*/
        Swimming s1 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生游得快");
            }
        };
        s1.swim();
        Swimming s2 = () -> {
            System.out.println("老师游得慢");
        };
        s2.swim();
    }
}

@FunctionalInterface//函数式接口中有且只有一个抽象方法
interface Swimming {
    void swim();
}

abstract class Animal {
    public abstract void run();
}