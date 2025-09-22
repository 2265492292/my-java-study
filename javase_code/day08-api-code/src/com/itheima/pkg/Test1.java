package com.itheima.pkg;

import com.itheima.pkg2.Car;
import com.itheima.pkg2.Tiger;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        //掌握在自己包下的程序中调用其他包下的程序
        //在自己程序中调用其他包下的程序的注意事项
        //1.如果在当前程序中，要调用自己所在包下的其他程序，则直接调用即可(同一个包下的类，互相可以直接调用)
        Student s1=new Student();
        //2.如果在当前程序中，要调用其他包下的程序，则必须导包
        Car c=new Car();
        //3.如果在当前程序中，要调用Java提供的程序，也需要导包，但是java.lang包是默认导入的，所以不需要导包
        Random  r=new Random();
        System.out.println(666);
        String name="王麻子";
        //如果当前程序中，需要调用多个不同包下的程序，而这些程序名正好一样，此时默认只能导入一个程序，另一个程序必须带包名访问
        Tiger t = new Tiger();
        t.run();

        com.itheima.pkg3.Tiger t2=new com.itheima.pkg3.Tiger();
        t2.run();
    }
}
