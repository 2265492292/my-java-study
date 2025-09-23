package com.itheima.d10_extends_modifier2;

import com.itheima.d9_extends_modifier.Fu;

public class Zi extends Fu {
    public void print() {

//        privateMethod();//私有的，报错
//        Method();//缺省的，不在同一个包，报错
        protectedMethod();//保护的，不在同一个包但是在子孙类中
        publicMethod();//公有的，任何地方都可以访问
    }
}
