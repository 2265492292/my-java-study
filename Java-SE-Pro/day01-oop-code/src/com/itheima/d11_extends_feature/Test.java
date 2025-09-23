package com.itheima.d11_extends_feature;

public class Test {
    public static void main(String[] args) {

    }
}
//1.Java是单继承的，一个类只能继承一个直接父类
//2.Java不支持多继承
//class A{}
//class B{}
//class C extends A,B{}

//3.Java支持多层继承
class M{}
//class M extends Object
/// 4.Java中所有类都继承自Object,是所有类的祖宗类
class N extends M{}
class P extends N{}