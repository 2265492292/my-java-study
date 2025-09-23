package com.itheima.d7_extends;

public class B extends A{
    private int k;
    public void print3(){
        //继承特点（专业、权威）：子类"中”只能继承父类的非私有成员
        System.out.println(i);
        print1();

//        System.out.println(j);
//        print2();
    }
}
