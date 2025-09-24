package com.itheima.d15_extends_constructor;


public class Wolf extends Animal {
    public Wolf(){
//        super();//子类全部构造器写不写都有，调用父类的无参构造器
        System.out.println("===子类Wolf的无参构造器执行了");
    }
    public Wolf(String n){
        super(n);//如果父类没有无参构造器，则必须手写super(...)，指定调用父类有参构造器
        System.out.println("===子类Wolf的有参构造器被执行了===");
    }
}
