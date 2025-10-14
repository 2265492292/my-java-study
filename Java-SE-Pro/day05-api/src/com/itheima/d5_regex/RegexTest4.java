package com.itheima.d5_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.awt.SystemColor.info;

public class RegexTest4 {
    public static void main(String[] args) {
        //目标：了解使用正则表达式去文本中爬取想要的信息
        String data = "来学Java,\n" +
                "电话：19829818152\n" +
                "联系邮箱：2265492292@qq.com\n" +
                "座机电话：01036517895" +
                "邮箱:2265492292@163.com\n" +
                "热线电话:400-314-2743\n";
        //需求：从中间爬取出邮箱 手机号码 座机号码 400
        //1.定义爬写规则，封装要爬取的格式
        Pattern pattern = Pattern.compile("(\\w{2,30}@\\w{2,30}(\\.\\w{2,30}){1,2})|1[3,9]\\d{9}" +
                "|(0\\d{2,6}-?[1-9]\\d{3,10})|(400-?[1-9]\\d{2,6}-?[1-9]\\d{2,6})");
        //2.通过匹配规则对象pattern与内容data建立联系得到一个匹配器对象
        Matcher matcher = pattern.matcher(data);
        //3.使用匹配器对象，开始爬取内容
        while (matcher.find()){
            //把爬取到的信息提取出来
            String info =matcher.group();
            System.out.println(info);
        }
    }
}
