package com.itheima.d6_map_impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data// 包含了无参 + get + set + toString + hashCode + equals
@NoArgsConstructor
@AllArgsConstructor //写有参之后要加无参注释
public class Movie implements Comparable<Movie> {
    private String name;
    private double score;
    private String actor;

    @Override
    public int compareTo(Movie o) {
        return Double.compare(this.score, o.score);
    }
}
