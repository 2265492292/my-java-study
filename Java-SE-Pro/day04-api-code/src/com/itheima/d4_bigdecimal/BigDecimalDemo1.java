package com.itheima.d4_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        //目标：学会处理浮点数运算失真的问题
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);

        //1.把两个数据包装成BigDecimal对象
        //a、public Bigdecimal(String val):这个接受字符串的构造器才可以处理失真问题
        BigDecimal a1 = new BigDecimal(Double.toString(a));
        BigDecimal b1 = new BigDecimal(Double.toString(b));

        //b、阿里更推荐用valueOf方法包装浮点型数据成为Bigdecimal对象
        //跟上面的做法本质是一样的
        BigDecimal a11 = BigDecimal.valueOf(a);
        BigDecimal b11 = BigDecimal.valueOf(b);

        //2.调用方法进行精度运算
//        BigDecimal c11 = a11.add(b11);//加
//        BigDecimal c11 = a11.subtract(b11);//减
//        BigDecimal c11 = a11.multiply(b11);//乘
        BigDecimal c11 = a11.divide(b11);//除

        double result = c11.doubleValue();
        //转回基本类型进栈，放在堆里需要跨栈去找，性能差
        System.out.println(result);
        System.out.println("-------------------------------------");
        BigDecimal i = BigDecimal.valueOf(0.1);
        BigDecimal j = BigDecimal.valueOf(0.3);
        /*
        * 参数1：除数
        * 参数2：保留位数
        * 参数3：舍入模式
        *  */
        BigDecimal k = i.divide(j,2, RoundingMode.HALF_UP);
        System.out.println(k);
    }
}
