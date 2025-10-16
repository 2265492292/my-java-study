package com.itheima.d6_object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
//注意：如果学生对象要参与序列化，保存，必须实现序列号接口
public class Student implements Serializable {
    private String name;
    private int age;
    private transient String password;
    //transient 修饰的成员变量将不参与序列化
    private double height;
}
