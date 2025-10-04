package com.itheima.d10_genericity_method;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        //目标：通配符和上下限
        //需求：所以汽车要一起参与比赛
        ArrayList<TSL> tsls = new ArrayList<>();
        tsls.add(new TSL());
        tsls.add(new TSL());
        tsls.add(new TSL());
        go(tsls);

        ArrayList<LX> lxes = new ArrayList<>();
        lxes.add(new LX());
        lxes.add(new LX());
        lxes.add(new LX());
        go(lxes);

       /* ArrayList<DOG> dogs = new ArrayList<>();
        dogs.add(new DOG());
        dogs.add(new DOG());
        dogs.add(new DOG());
        go(dogs);*/

//        ArrayList<int> list = new ArrayList<>();//报错
        //泛型不支持基本数据类型，只能支持对象类型
    }

    //虽然LX和TSL的子类，但是 ArrayList<TSL>和ArrayList<LX>与ArrayList<CAR>没有关系

    /// 通配符：就是 "?" ,可以在使用时代表一切类型。E T K V是定义时使用(element,type,key,vlaue)
    //泛型的上下限：  ? extends Car(上限，？必须是Car或者Car的子类)
    //              ? super   CAr(下限，？必须是Car或者Car的父类)
    public static void go(ArrayList<? extends Car> cars) {
    }
}

class Car {
}

class TSL extends Car {
}

class LX extends Car {
}

class DOG {
}