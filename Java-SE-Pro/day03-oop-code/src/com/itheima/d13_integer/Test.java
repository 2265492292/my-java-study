package com.itheima.d13_integer;

public class Test {
    public static void main(String[] args) {
        ///目标：认识包装类，了解包装类的作用
        int a = 12;

        //1.把基本类型通过包装类包装成对象
//        Integet it =new Integer(12);      //手动装箱
//        Integer it2 =Integer.valueOf(12)  //手动装箱
//        2.自动装箱：基本类型的数据可以自动变成对应的包装类对象
        Integer it = 12;
        Integer it2 = a;

        //Java为了数据的使用方便，其实也设计了自动拆箱
        //3.自动拆箱：包装类的对象可以直接赋值给基本数据类型;
        int it3 = it;//it时integer类型，自动拆箱为int类型
        System.out.println(it3);
        System.out.println("---------Java为包装类提供了新功能----------");
        ///目标2：了解包装类的独有功能
        //1.把基本类型的数据变成字符串
        int a1 = 23;
        String rs1 = Integer.toString(a1);//"23"
        System.out.println(rs1 + 1);//231,字符串

        Integer itt = 23;
        String ittStr = itt.toString();//"23"
        System.out.println(ittStr + 1);//231
        //装什么逼，调方法要入栈，性能还差了一点不如这个
        int a2 = 23;
        String rs2 = a2 + "";//简单就完了
        System.out.println(rs2 + 1);

        //2.把字符串数值转换成对应的基本数据类型(很有用)
        String ageStr = "23";
        //int age = Integer.parseInt(ageStr);
        int age = Integer.valueOf(ageStr);//通用方法
        System.out.println(age + 1);

        String scoreStr = "99.5";
//        double score = Double.parseDouble(scoreStr);
        double score = Double.valueOf(scoreStr);//通用方法
        System.out.println(score + 0.5);//100.0

        //3.由于泛型和集合都不支持基本数据类型，因此万物皆对象，因此包装类在集合和泛型中大量使用并且必须使用。
    }
}
