package com.itheima.d14_extends_field;

public class Test2 {
    public static void main(String[] args) {
        //目标：了解 继承后，子类访问成员的特点：就近原则
        Zi2 zi =new Zi2();
        zi.go();
    }
}
class Zi2 extends Fu2{
    @Override
    public void run(){
        System.out.println("子类跑~~~");
    }
    public void go(){
        run();
        super.run();
    }
}
class Fu2{
    public void run(){
        System.out.println("父类跑");
    }
}