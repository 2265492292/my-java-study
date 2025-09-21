package com.itheima.demo;

import java.util.Scanner;

public class MovieOperator {
    //1.获取全部电影对象
    private Movie[] movies;

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    //2.提供方法，展示全部电影，根据id查询电影对象
    public void showAllMovies() {
        System.out.println("====全部电影信息如下====");
        for (int i = 0; i < movies.length; i++) {
            //得到当前电影
            Movie m = movies[i];
            System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getPrice() + "\t" + m.getActor());
        }
    }

    public void getMovieById() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的电影id:");
        int id =sc.nextInt();
        System.out.println("您要查询的电影信息如下:");
        for (int i = 0; i < movies.length; i++) {
            //得到当前电影
            Movie m = movies[i];
            if (m.getId() == id) {
                System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getPrice() + "\t" + m.getActor());
                return;
            }
        }
        System.out.println("没有这个电影");
    }
}
