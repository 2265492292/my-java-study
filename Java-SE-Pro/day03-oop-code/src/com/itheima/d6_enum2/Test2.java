package com.itheima.d6_enum2;

public class Test2 {
    public static void main(String[] args) {
        //目标：搞清楚枚举的应用场景
        //常见应用场景：表示一组信息（信息标志），然后作为参数进行传输
        //需求：需要提供一个方法，可以完成向下取整，向上取整，四舍五入，去掉小数部分
        ///常量做信息标志和分类，也很优雅，但是参数不被约束！
        /// 枚举做信息标准和分类，很优雅，参数值受到约束，最好的信息标志和分类！
        /// 常量都是宏替换，代价小，枚举是对象化操作，代价大，解码是性能差
        System.out.println(handleData(3.9991, Constant2.DOWN));
        System.out.println(handleData(5.991, Constant2.HALF_UP));
    }

    public static double handleData(double number, Constant2 flag) {
        switch (flag) {
            case DOWN:
                //向下取整
                number = Math.floor(number);
                break;
            case UP:
                //向上取整
                number = Math.ceil(number);
                break;
            case HALF_UP:
                //四舍五入
                number = Math.round(number);
            case DELETE_LEFT:
                //去掉小数
                number = (int) number;
                break;
        }
        return number;
    }
}
