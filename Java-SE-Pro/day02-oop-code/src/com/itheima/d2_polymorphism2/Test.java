package com.itheima.d2_polymorphism2;

public class Test {
    //目标：学习使用多态的优点

    public static void main(String[] args) {
        //1.多态下右边对象是解耦合的
//        Animal a =new Cat();
        Animal a =new Dog();
        a.cry();
        //多态下存在的问题：不能直接调用子类独有的功能
//        a.lookDoor();//报错
        Cat c =new Cat();
        go(c);
        Dog d =new Dog();
        go(d);
        System.out.println("---------------------");

    }
    //2.多态下，父类类型作为方法的形参，可以接受一切子类对象，方法更便利
    public static void go(Animal c){
        System.out.println("===开始===");
        c.cry();//对象回调
        //多态下存在的问题：不能直接调用子类独有的功能
//        c.catchFish();//报错
        System.out.println("===结束===");
    }
}
