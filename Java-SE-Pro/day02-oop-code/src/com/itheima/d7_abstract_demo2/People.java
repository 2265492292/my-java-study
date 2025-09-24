package com.itheima.d7_abstract_demo2;

public abstract class People {
    //模板方法设计模式（不能被重写，加上final修饰，保护它！）
    public final void write(){
        System.out.println("\t\t\t《我的爸爸》");
        System.out.println("\t我的爸爸还是很棒的，听我介绍一下");
        //所有子类都要写正文，但每个子类写的情况是不一样的，为我们就可以把正文的书写定义成抽象方法
        //具体的实现交给子类来写
        writeMain();
        System.out.println("\t有这样的爸爸真好");
    }
    public abstract void writeMain();
}
