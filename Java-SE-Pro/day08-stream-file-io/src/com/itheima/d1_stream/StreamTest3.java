package com.itheima.d1_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest3 {
    public static void main(String[] args) {
        //目标：掌握Stream流的常见方法
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");

        //1.过滤方法
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);

        //2.准备一个集合，排序
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("摔跤吧爸爸", 9.5, "阿米尔汗"));
        movies.add(new Movie("三傻宝莱坞", 8.5, "阿米尔汗2"));
        movies.add(new Movie("三傻宝莱坞", 8.5, "阿米尔汗2"));
        movies.add(new Movie("阿甘正传", 7.5, "汤姆汉克斯"));

        //集合中如果存储对象，方式一：对象类可以实现Comparable接口，指定比较规则
        movies.stream().sorted().forEach(System.out::println);
        //类型引用
        movies.stream().sorted(Movie::compareTo).forEach(System.out::println);
        System.out.println("----------------------");
        movies.stream().sorted((o1, o2) -> Double.compare(o2.getScore(), o1.getScore())).forEach(System.out::println);
        movies.stream().sorted(Comparator.comparingDouble(Movie::getScore)).forEach(System.out::println);

        //3.limit取前几个
        System.out.println("------------------");
        movies.stream().sorted((o1, o2) -> Double.compare(o2.getScore(), o1.getScore())).limit(3).forEach(System.out::println);

        //4.跳过前几个skip
        System.out.println("------------------");
        movies.stream().sorted((o1, o2) -> Double.compare(o2.getScore(), o1.getScore())).skip(3).forEach(System.out::println);

        //5.dostinct去重复
        System.out.println("-------------------");
        //去重复：需要重写对象类的hashCode和equals方法
        movies.stream().sorted((o1, o2) -> Double.compare(o2.getScore(), o1.getScore())).distinct().forEach(System.out::println);

        //6.map加工方法：把流上的数据加工成新数据
        System.out.println("---------------------");
        movies.stream().map(m -> m.getName() + "===>" + m.getScore()).forEach(System.out::println);

        //7.合并流
        //把两个流接起来
        Stream<String> s1 = Stream.of("张三", "楚留香", "西门吹雪");
        Stream<String> s2 = Stream.of("李四", "石敢当");
        Stream<Integer> s3 = Stream.of(11, 22, 33);
        //public static <T> Stream<T> concat(Stream<? extend T> a, Stream<? extend T> b)
        Stream<String> allStream = Stream.concat(s1, s2);
//        Stream<Object> allStream2 = Stream.concat(s1, s3);
        System.out.println(allStream.count());
//        allStream2.forEach(System.out::println);

    }
}
