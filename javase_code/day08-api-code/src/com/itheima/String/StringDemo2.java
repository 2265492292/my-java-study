package com.itheima.String;

public class StringDemo2 {
    public static void main(String[] args) {
        ///熟悉String提供的处理字符串的常用方法
        String name = "abc黑马666";
        ///1.获取字符串的长度(字符个数)
        System.out.println("长度："+name.length());
        ///2.获取字符串中指定索引位置的字符
        System.out.println(name.charAt(2));
        System.out.println("-------------------");
        ///字符串的遍历
        for (int i = 0; i < name.length(); i++) {
            char c  = name.charAt(i);
            System.out.println(c);
        }
        System.out.println("-------------------");
        ///3.把字符串转换为字符数组，再进行遍历
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c  = chars[i];
            System.out.println(c);
        }
        ///4.equals:  比较两个字符串是否相等，，一样就返回true(重点）
        String s1=new  String("黑马666");
        String s2=new  String("黑马666");
        System.out.println(s1 == s2);//false,比较内存地址
        System.out.println(s1.equals(s2));//true,比较内容
        ///5.忽略大小写比较两个字符串是否相等，一样就返回true（常用于验证码的比较）
        String t1="a6GFo";
        String t2="A6gfo";
        System.out.println(t1.equals(t2));//false
        System.out.println(t1.equalsIgnoreCase(t2));//true
        ///6.截取字符串内容(包前闭，不包结束)
        String st="黑马程序员999";
        String rs = st.substring(0, 2);
        System.out.println(rs);
        ///7.从当前索引开始截取到字符串末尾
        String  rs2 = st.substring(2);
        System.out.println(rs2);
        ///8.把字符串中的某个内容替换成新内容，并返回新的字符串对象给我们
        String info="这个游戏简直是个垃圾，sb,去你大爷，还我血汗钱";
        String rs3 = info.replace("垃圾", "**").replace("sb", "**");
        System.out.println(rs3);
        ///9.判断字符串中是否包含某个关键字
        String st2="黑马程序员999";
        System.out.println(st2.contains("黑马"));//true
        System.out.println(st2.contains("程序员"));//true
        System.out.println(st2.contains("99"));//true
        System.out.println(st2.contains("996"));//false
        ///10.判断字符串是否以某个字符串开头
        ///startsWith 判断是否以什么内容开头
        System.out.println(st2.startsWith("黑马"));//true
        System.out.println(st2.startsWith("黑马2"));//false
        System.out.println(st2 .startsWith("黑马程序员"));//true
        ///endsWith 判断是否以什么内容结尾
        System.out.println(st2.endsWith("黑马"));//false
        System.out.println(st2.endsWith("999"));//true
        System.out.println(st2.endsWith("员999"));//true
        ///11.把字符串按照某个指定符号进行切割，并把切割后的结果存储到一个数组中，并返回该数组
        String result="陈羽凡，贾乃亮，王宝强";
        String[] names = result.split("，");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
