package com.itheima.d5_enum;

public class Test {
    public static void main(String[] args) {
        //目标：认识枚举类:学习枚举类的特点
//        A a =new A()//报错
        A a1 = A.X;
        A a2 = A.Y;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println("-----------------");
        ///values方法-->拿到枚举类的全部对象，放到一个数组中去返回
        A[] as = A.values();
        for (int i = 0; i < as.length; i++) {
            A a = as[i];
            System.out.println(a);
        }
        A y = A.valueOf("Y");
        System.out.println(y == a2);//地址一样

        //ordinal 拿对象的索引
        System.out.println(a1.ordinal());//0
        System.out.println(a2.ordinal());//1
    }
}
