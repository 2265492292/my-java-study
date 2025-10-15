package com.itheima.d3_collection_test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Lombok：使用注解简化get set 有参 无参构造器的写法
//IDEA >= 2022
//Lombok 是 30版本以上 不要用28
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private String number;
    private String color;
    private int size;

    @Override
    public String toString() {
        return number + color;
    }

    
    /* public Card() {
    }

    public Card(String number, String color) {
        this.number = number;
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }*/
}