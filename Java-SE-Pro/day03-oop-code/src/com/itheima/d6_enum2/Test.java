package com.itheima.d6_enum2;

public class Test {
    public static void main(String[] args) {
        //目标：搞清楚枚举的应用场景
        //常见应用场景：表示一组信息（信息标志），然后作为参数进行传输
        //需求：需要提供一个方法，可以完成向下取整，向上取整，四舍五入，去掉小数部分
        ///常量做信息标志和分类，也很优雅，但是参数不被约束！
        System.out.println(handleData(3.9991, Constant.DOWN));
        System.out.println(handleData(5.991, Constant.HALF_UP));
    }

    public static double handleData(double number, int flag) {
        switch (flag) {
            case Constant.DOWN:
                //向下取整
                number = Math.floor(number);
                break;
            case Constant.UP:
                //向上取整
                number = Math.ceil(number);
                break;
            case Constant.HALF_UP:
                //四舍五入
                number = Math.round(number);
            case Constant.DELETE_LEFT:
                //去掉小数
                number = (int) number;
                break;
        }
        return number;
    }
}
