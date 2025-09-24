package com.itheima.d1_polymorphism;

public class Test {
    public static void main(String[] args) {
        //目标：认识多态，学习多态的使用前提
        //前提：1.有继承/实现关系；存在父类引用子类对象；存在方法重写
        //1.对象多态 | 行为多态
        Animal a1 =new Cat();
        a1.cry();//方法：编译看左边，运行看右边
        System.out.println(a1.name);//成员变量：编译看左边，运行也看左边
        Animal a2 =new Dog();
        a2.cry();//方法：编译看左边，运行看右边
        System.out.println(a2.name);//成员变量：编译看左边，运行也看左边
    }
}
