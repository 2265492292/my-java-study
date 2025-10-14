package com.itheima.d5_regex;

/// 目标：掌握正则表达式的书写规则
public class RegexTest2 {
    public static void main(String[] args) {
        //1.字符类(只能匹配单个字符)
        System.out.println("a".matches("[abc]"));//[abc]只能匹配a`b`c
        System.out.println("e".matches("[abcd]"));//false

        System.out.println("d".matches("[^abc]"));//非abc
        System.out.println("a".matches("[^abc]"));//false

        System.out.println("b".matches("[a-zA-Z]"));//[a-zA-Z] 只能是a-z A-Z的字符
        System.out.println("2".matches("[a-zA-Z]"));//false

        System.out.println("k".matches("[a-z&&[^bc]]"));//a-z && 非bc
        System.out.println("b".matches("[a-z&&[^bc]]"));//false

        System.out.println("ab".matches("[a-zA-Z0-9]"));//false
        ///注意：以上带[内容]的规则都只能用于匹配单个字符

        //2.预定义字符(只能匹配单个字符) \d  \D  \s  \S  \w  \W
        System.out.println("徐".matches("."));//可以匹配任意字符
        System.out.println("徐徐".matches("."));//false

        //在Java中，\是有特殊用途的；例如特殊字符\n  \t
        System.out.println("1".matches("\\d"));//true   只能匹配数字
        System.out.println("12".matches("\\d"));//false

        System.out.println(" ".matches("\\s"));//   \s代表一个空白字符
        System.out.println("a".matches("\\s"));//false

        System.out.println("a".matches("\\S"));//   \S代表一个非空字符
        System.out.println(" ".matches("\\S"));//false

        System.out.println("a".matches("\\w"));//   \w代表[a-zA-Z_0-9]
        System.out.println("_".matches("\\w"));//true
        System.out.println("徐".matches("\\w"));//false

        System.out.println("徐".matches("\\W"));//   [^\w]不能是a-zA-Z_0-9
        System.out.println("a".matches("\\W"));//false

        System.out.println("23332".matches("\\d"));//false 注意：以上预定义字符都只能匹配单个字符
        //3.数量词:    ?   *   +   {n} {n,}    {n,m}
        System.out.println("a".matches("\\w?"));//?代表0次或1次
        System.out.println("".matches("\\w?"));//true
        System.out.println("abc".matches("\\w?"));//false

        System.out.println("abc12".matches("\\w*"));//*代表0次或多次
        System.out.println("".matches("\\w*"));//true
        System.out.println("abc12张".matches("\\w*"));//false

        System.out.println("abc12".matches("\\w+"));//+代表1次或多次
        System.out.println("".matches("\\w+"));//false
        System.out.println("abc12张".matches("\\w"));//false

        System.out.println("a3a".matches("\\w{3}"));//{n}代表正好是n次
        System.out.println("abcd".matches("\\w{3}"));//false
        System.out.println("abcd".matches("\\w{3,}"));//{3,}代表>=3次
        System.out.println("ab".matches("\\w{3,}"));//false
        System.out.println("abcd徐".matches("\\w{3,}"));//false
        System.out.println("abc232d".matches("\\w{3,9}"));//{3,9代表是 大于等于3次，小于等于9次

        //4.其他几个常用符号:   (?i)忽略大小写   |或  （）分组
        System.out.println("----------------------------------");
        System.out.println("abc".matches("(?i)abc"));//true
        System.out.println("ABC".matches("(?i)abc"));//true
        System.out.println("aBc".matches("a((?i)b)c"));//true
        System.out.println("ABc".matches("a((?i)b)c"));//false

        //需求1:要么是三个小写字母，要么是3个数字
        System.out.println("123".matches("(\\d{3})|([a-z]{3})"));
        System.out.println("ABC".matches("\\d{3}|[a-z]{3}"));
        System.out.println("aAc".matches("\\d{3}|[a-z]{3}"));

        //需求2：必须是我爱开头，中间可以是至少一个”编程“，最后至少是一个”666“
        System.out.println("我爱编程666".matches("我爱(编程)+(666)+"));//+代表至少一个
        System.out.println("我爱编程编程666666".matches("我爱(编程)+(666)+"));
        System.out.println("我爱编程编程6666666".matches("我爱(编程)+(666)+"));
    }
}
