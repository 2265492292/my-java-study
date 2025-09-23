package com.itheima.d9_extends_modifier;

public class Demo1 {
    public static void main(String[] args) {
        Fu f =new Fu();
//        f.privateMethod();//私有的，报错
        f.Method();//缺省的，同一个包内，可以访问
        f.protectedMethod();//保护的，同一个包内(+子孙类)，可以访问
        f.publicMethod();//公有的，任何地方都可以访问
    }
}
