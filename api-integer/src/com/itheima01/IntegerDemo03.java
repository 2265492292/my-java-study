package com.itheima01;

/*
 *   装箱：把基本数据类型转换为相应的包装类类型
 *   拆箱：把包装类类型转换为相应的基本数据类型
 * */
public class IntegerDemo03 {
    public static void main(String[] args) {
        Integer ii = 100;//Integer.valueof(100)

        ii += 200;
//        ii=ii+200;
//        ii=ii.intValue()+200;
//        ii=300;//Integer.valueOf(300);
        System.out.println(ii);
    }
}
