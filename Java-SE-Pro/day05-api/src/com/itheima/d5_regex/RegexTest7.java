package com.itheima.d5_regex;

//目标：了解使用正则表达式搜索替换，内容分割
public class RegexTest7 {
    public static void main(String[] args) {
        //1.public String replaceAll(String regex,String newStt):按照正则表达式匹配的内容进行替换
        //需求1：请把    古力娜扎ai8888迪丽热巴999aa5566马儿扎哈dsafgdfgadf卡尔扎巴  中间的非中文字符替换成"-"
        String s1="古力娜扎ai8888迪丽热巴999aa5566马儿扎哈dsafgdfgadf卡尔扎巴";
//        String result = s1.replaceAll("\\w", "-");
        //古力娜扎------迪丽热巴---------马儿扎哈-----------卡尔扎巴
        String result = s1.replaceAll("\\w+", "-");
        //古力娜扎-迪丽热巴-马儿扎哈-卡尔扎巴
        System.out.println(result);
        //2.public String[] split(String regex):按照正则表达式匹配的内容进行分割字符串，返回一个字符串数据
        //需求1：请把    古力娜扎ai8888迪丽热巴999aa5566马儿扎哈dsafgdfgadf卡尔扎巴  中间的人名获取出来
        String[] names =s1.split("\\w+");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
