package com.itheima.d1_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo5 {
    public static void main(String[] args)  {
        //目标：学习异常的处理机制
        //运行时异常：RuntimeExcpetion
        System.out.println("==开始==");
        try {
            parseDate("2023-11-11 11:11:11");
            System.out.println("执行成功");
        } catch (Exception e) { //使用父类进行统一处理
            e.printStackTrace();
            System.out.println("失败了");
        }
        //分类处理
        /*catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
        System.out.println("==结束==");
    }

    private static void parseDate(String s) throws ParseException, FileNotFoundException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(s);//编译时异常，写代码时就报错:没有继承RuntimeExcpetion,而是继承自Excpetion
        System.out.println(d);

        InputStream is = new FileInputStream("D:/meinv.png");
    }

}
