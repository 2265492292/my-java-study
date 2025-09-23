package com.itheima.d3_static_util;

import java.util.Random;
//工具类都是静态方法
public class HeimaUtil {
    private HeimaUtil(){
        /// 工具类没有创建对象的需求，建议将工具类的构造器进行私有
    }
    public static String createCode(int n) {
        String code = "";
        String data = "abcdEFGHIJKLMNOPQRSTUVWXYZ0123456ABCDefghijklmnopqrst789uvwxyz";
        //1.直接使用循环控制随机获取多少位字符
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            //2.随机产生一个索引
            int index = r.nextInt(data.length());
            //3.提取对应位置字符
            char c = data.charAt(index);
            //4.拼接给code
            code += c;
        }
        return code;
    }
}
