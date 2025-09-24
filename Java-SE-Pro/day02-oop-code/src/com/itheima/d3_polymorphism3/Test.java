package com.itheima.d3_polymorphism3;

public class Test {


    public static void main(String[] args) {
        //目标：学习多态下的类型转换问题
        Animal a = new Dog();
        a.cry();
        //强制类型转换:解决多态下不能直接调用子类独有方法的问题
        Dog d1 = (Dog) a;
        d1.lookDoor();
        //强制类型转换的注意事项1：只要有继承或者实现关系的两个类，就可以强转
        //编译阶段不会报错（写代码），但是运行是可能出现强制类型转换异常
//        Cat c1 =(Cat) a;//编译不报错，运行时报错
        Cat c = new Cat();
        go(c);

    }

    //2.多态下，父类类型作为方法的形参，可以接受一切子类对象，方法更便利
    public static void go(Animal a) {
        System.out.println("===开始===");
        a.cry();
        //因此Java建议强转前，先判断对象的真实类型，再进行强转
        if (a instanceof Dog){
            Dog d2 = (Dog) a;
            d2.lookDoor();
        }else if (a instanceof Cat){
            Cat c2 =(Cat) a;
            c2.catchFish();
        }
        System.out.println("===结束===");
    }
}
