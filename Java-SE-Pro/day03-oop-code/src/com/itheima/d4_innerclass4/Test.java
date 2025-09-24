package com.itheima.d4_innerclass4;

public class Test {
    public static void main(String[] args) {
        //目标：认识匿名内部类(更方便的创建一个子类对象)
        //匿名内部类本质是一个 子类 ，同时会立即创建一个子类对象
        //编译时匿名内部类的名称：当前类名 $ 编号
//        Animal a =new Dog();
        //利用匿名内部类创建对象
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("🐕汪汪汪");
            }
        };
        a.cry();
    }
}

/*class Dog extends Animal{
    @Override
    public void cry() {
        System.out.println("🐕汪汪汪");
    }
}*/
abstract class Animal {
    public abstract void cry();
}