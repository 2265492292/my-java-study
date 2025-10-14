package com.itheima.d5_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest5 {
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

        Pattern pattern = Pattern.compile("(\\w{2,30})@\\w{2,20}(\\.\\w{2,30}){1,2}");
        //2.通过匹配规则对象pattern与内容data建立联系得到一个匹配器对象
        Matcher matcher = pattern.matcher(data);
        //3.使用匹配器对象，开始爬取内容
        while (matcher.find()){
            //把爬取到的信息提取出来
            String rs =matcher.group(1);//只要爬取出来的邮箱的第一组()的内容
            System.out.println(rs);
        }
    }
}
