package com.itheima.demo;

public class Test {
    public static void main(String[] args) {
        //目标：掌握电影信息的开发
        //1.每个电影是一个电影对象，首先要设计电影类，用于创建电影对象，封装电影数据
        //2.准备电影对象数据（电影信息）：一个一个的电影对象存储
        Movie[] movies = new Movie[5];///movies-->引用类型，默认值-->NULL
        movies[0] = new Movie(1,"热辣滚烫",46.5,"贾玲");
        movies[1] = new Movie(2,"飞驰人生",49.9,"沈腾");
        movies[2] = new Movie(3,"非诚勿扰",9.9,"葛优，舒淇");
        movies[3] = new Movie(4,"第二十条",87.5,"雷佳音，赵丽颖");
        movies[4] = new Movie(5,"熊出没",35.5,"光头强");

        //3.把电影对象数据交给电影操作对象进行业务处理
        MovieOperator operator = new MovieOperator(movies);
        operator.showAllMovies();
        operator.getMovieById();
    }
}
