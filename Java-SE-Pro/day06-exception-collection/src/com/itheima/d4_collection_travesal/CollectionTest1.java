package com.itheima.d4_collection_travesal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionTest1 {
    //需求：输出电影信息
    //分析：每部电影都是一个对象，多部电影使用集合封装
    //遍历集合中的对象，输出每部电影的详情信息
    public static void main(String[] args) {
        Collection<Movie> movies = new ArrayList<>();//电影集合
        movies.add(new Movie("《肖申克的救赎》",9.7,"罗宾斯"));
        movies.add(new Movie("《霸王别姬》",9.6,"张国荣、张丰毅"));
        movies.add(new Movie("阿甘正传",9.5,"汤姆.汉克斯"));
        System.out.println(movies);//地址
        //1.迭代器+循环//需要重写Movie的toString方法
        Iterator<Movie> it =movies.iterator();
//        while (it.hasNext()){
//            String ele = it.next().toString();
//            System.out.println(ele);
//        }
        System.out.println("---------------");
        //不重写toString
        while (it.hasNext()){
            Movie movie =it.next();//把it.next存储在一个对象中
            System.out.println("片名:"+movie.getName());
            System.out.println("评分:"+movie.getScore());
            System.out.println("演员:"+movie.getActor());
        }
        System.out.println("---------------");
        //2.增强for(foreach)
        for(Movie movie:movies){
            System.out.println("片名:"+movie.getName());
            System.out.println("评分:"+movie.getScore());
            System.out.println("主演:"+movie.getActor());
        }
        System.out.println("--------------");
        //3.lambda表达式
        movies.forEach(new Consumer<Movie>() {
            @Override
            public void accept(Movie movie) {
                System.out.println(movie);
            }
        });
        movies.forEach(movie -> System.out.println(movie));
        movies.forEach(System.out::println);
    }
}
