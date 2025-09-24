package com.itheima.d6_abstract_demo;

public class Test {
    public static void main(String[] args) {
        //目标：学习抽象类的应用场景
        /// 意义：更好的支持多态
        Animal a = new Cat();
        a.cry();
        Animal a2=new Dog();
        a2.cry();
    }
}
