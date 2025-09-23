package com.itheima.d10_extends_modifier2;

import com.itheima.d9_extends_modifier.Fu;

public class Demo2 {
    public static void main(String[] args) {
        Fu f = new Fu();
//        f.privateMethod();//私有的，报错
//        f.Method();//缺省的，不在同一个包，报错
//        f.protectedMethod();//保护的，不在同一个包，报错
        f.publicMethod();//公有的，任何地方都可以访问
        Zi zi =new Zi();
//        zi.protectedMethod();//报错，虽然是子孙对象，但是不在子孙类中
        zi.publicMethod();
    }
}
