package com.itheima.d1_innerclass1;

public class Test {
    public static void main(String[] args) {
        //目标：掌握成员内部类，学习语法
        //成员内部类创建对象的语法
        //外部类名.内部类名 对象名 = new 外部类名().new 内部类名();
        Outer.Inner in = new Outer().new Inner();
        in.setName("张三");
        in.show();
        People.Heart h =new People().new Heart();
        h.show();
    }
}
