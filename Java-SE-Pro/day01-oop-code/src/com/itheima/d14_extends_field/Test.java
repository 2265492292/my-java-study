package com.itheima.d14_extends_field;
//1.子类方法中访问其他成员(成员变量、成员方法)，是依照就近原则的
//先子类局部范围找
//子类成员范围找
//父类成员范围找，如果父类范围还没有找到就报错
public class Test {
    public static void main(String[] args) {
        //目标：了解 继承后，子类访问成员的特点：就近原则
        Zi zi =new Zi();
        zi.showName();
    }
}
class Zi extends Fu{
    String name ="子类名称";
    public void showName(){
        String name="局部名称";
        System.out.println(name);
        System.out.println(this.name);//访问子类的成员name
        //如果子父类中，出现了重名的成员，会优先使用子类的
        //可以通过 spuer 关键字，指定访问父类的成员:
        //super.父类成员变量/父类成员方法
        System.out.println(super.name);
    }
}
class Fu{
    String name ="父类名称";
}