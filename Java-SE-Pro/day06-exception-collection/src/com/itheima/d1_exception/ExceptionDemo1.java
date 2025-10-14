package com.itheima.d1_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    public static void main(String[] args) throws ParseException {
        //目标：认识异常
        //运行时异常：RuntimeExcpetion
        System.out.println("==开始==");
        int[] arr = {11, 22, 33};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
//        System.out.println(arr[3]);   //ArrayIndexOutOfBoundsException 数组索引越界异常
        System.out.println("-----------------");
        String name = "itheima";
//        String name = null;     //NullPointerException 空指针异常
        System.out.println(name.length());
        System.out.println("-----------------");
//        System.out.println(10 / 0);     //ArithmeticException 数学操作异常
        System.out.println("-----------------");
        Object o = "张麻子";
//        Integer i =(Integer) o;     //ClassCastException 类型转换异常
        System.out.println("-----------------");
        String s = "23a";
//        int it = Integer.valueOf(s);    //NumberFormatException 数字转换异常
//        System.out.println(it);
        System.out.println("-----------------");
        //编译时异常
        parseDate("2024-03-19 13:20:31");
        System.out.println("==结束==");
    }

    private static void parseDate(String s) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(s);//编译时异常，写代码时就报错:没有继承RuntimeExcpetion,而是继承自Excpetion
        System.out.println(d);
    }

}
