package com.itheima.d1_stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest4 {
    public static void main(String[] args) {
        //Stream流常见的终结方法
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("摔跤吧爸爸", 9.5, "阿米尔汗"));
        movies.add(new Movie("三傻宝莱坞", 8.5, "阿米尔汗2"));
        movies.add(new Movie("三傻宝莱坞", 8.5, "阿米尔汗2"));
        movies.add(new Movie("阿甘正传", 7.5, "汤姆汉克斯"));

        //1.forEach
        movies.stream().forEach(System.out::println);
        //2.count
        long count = movies.stream().skip(2).count();
        System.out.println(count);

        //3.取最大值
        /*Optional<Movie> max =movies.stream().max((o1, o2) -> Double.compare(o1.getScore(), o2.getScore()));
//        Optional<Movie> max2 =movies.stream().max(Comparator.comparingDouble(Movie::getScore));
        Movie m = max.get();
        System.out.println(m);*/
        Movie max3 = movies.stream().max((o1, o2) -> Double.compare(o1.getScore(), o2.getScore())).get();
        System.out.println(max3);

        //4.收集Stream流：把Stream流操作后的结果转回到集合或者数组中去返回
        //Stream流：方便操作集合/数组的手段； 集合/数组才是开发的目的
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");
        Stream<String> stream = list.stream();//流只能用一次
        List<String> newList = stream.filter(s -> s.startsWith("张") && s.length() == 3).collect(Collectors.toList());
//        List<String> newList = list.stream().filter(s -> s.startsWith("张") && s.length() == 3).toList();  //jdk16之后才开始支持
        System.out.println(newList);
        //收集到Set集合//set:无序，不重复，无索引
        Stream<String> stream2 = list.stream();//流只能用一次
        Set<String> set = stream2.filter(s -> s.startsWith("张") && s.length() == 3).collect(Collectors.toSet());
        System.out.println(set);
        //收集到数组
        Stream<String> stream3 = list.stream();//流只能用一次
        Object[] objects = stream3.filter(s -> s.startsWith("张") && s.length() == 3).toArray();
        System.out.println(Arrays.toString(objects));

        //收集到Map集合(拓展)
        List<Movie> movies1 = new ArrayList<>();
        movies1.add(new Movie("摔跤吧爸爸", 9.5, "阿米尔汗"));
        movies1.add(new Movie("三傻宝莱坞", 8.5, "阿米尔汗2"));
        movies1.add(new Movie("三傻宝莱坞", 18.5, "阿米尔汗2"));
        movies1.add(new Movie("阿甘正传", 7.5, "汤姆汉克斯"));

//        Map<String, Double> map = movies.stream().limit(2).collect(Collectors.toMap(m1 -> m1.getName(),m2->m2.getScore()));
//        Map<String, Double> map = movies.stream().limit(  3  ).collect(Collectors.toMap(m1 -> m1.getName(),m2->m2.getScore()));
//        报错，键不能重复
//        Map<String, Double> map = movies1.stream().limit(4).collect(Collectors.toMap(m1 -> m1.getName()
//                , m2 -> m2.getScore(), (v1, v2) -> v2));
       //声明二选一规则
        //lambda简化，方法引用：特定类的特定方法
        Map<String, Double> map = movies1.stream().limit(4).collect(Collectors.toMap(Movie::getName
                , Movie::getScore, (v1, v2) -> v2));
        System.out.println(map);
    }
}
