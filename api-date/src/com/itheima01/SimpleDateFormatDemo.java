package com.itheima01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**   构造方法:
*       SimpleDateFormat() 构造一个 SimpleDateFormat使用默认模式和日期格式符号默认 FORMAT区域设置。
*       SimpleDateFormat(String pattern) 构造一个 SimpleDateFormat使用给定的模式和默认的默认日期格式符号 FORMAT区域设置。
*
    格式化：Date-->String;
        String format(Date date):将日期格式化成日期/时间字符串

    解析：String-->Date
        Date parse(String source):从给定的字符串开始解析文本以生成日期
**/
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //格式化:Date-->String
        Date d=new Date();
//        SimpleDateFormat sdf=new SimpleDateFormat();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s=sdf.format(d);
        System.out.println(s);
        System.out.println("---------------");
//        解析:String-->Date
        String ss="2025-9-16 16:50:20";
//        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd=sdf2.parse(ss);
        System.out.println(dd);
    }
}
