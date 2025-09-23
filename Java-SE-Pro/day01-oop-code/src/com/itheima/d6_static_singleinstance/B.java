package com.itheima.d6_static_singleinstance;

public class B {
    //2.定义一个静态变量用于记住类的唯一一个对象
    private static B b;//b==null

    //1.私有化构造器
    private B() {
    }

    //3.提供一个静态的get方法，返回一个唯一的对象
    public static B getInstance() {
        //第次个访问对象时，需要创建对象
        if (b == null) {
            b = new B();
        }
        return b;
    }
}
