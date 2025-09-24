package com.itheima.d2_innerclass2;

public class Test {
    //目标：认识静态内部类，学习其特点
    //外部类名.内部类 对象名 = new 外部类名.静态内部类();
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();
        in.show();
    }
}
