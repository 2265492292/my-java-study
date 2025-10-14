package com.itheima.d5_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest6 {
    public static void main(String[] args) {
        //目标：了解使用正则表达式去文本中爬取想要的信息
        String data = "欢迎张全蛋光临本系统！他删库并跑路欢迎李二狗子光临本系统" +
                "欢迎马六光临本系统！他浏览了很多网页！欢迎夏咯光临本系统！他在六点钟送出一个嘉年华！";
        //1.指定爬取规则对象：设置匹配机制
        String regex1 = "欢迎(.+)光临";//贪婪匹配
        String regex2 = "欢迎(.+?)光临";//非贪婪匹配
        Pattern pattern = Pattern.compile(regex2);
        //2.让内容和爬取规则建立关系，得到一个匹配器对象
        Matcher matcher = pattern.matcher(data);
        //3.开始使用匹配器对象
        while (matcher.find()){
            //把爬到的信息提取出来
            String rs =matcher.group(1);
            System.out.println(rs);
        }
    }
}
