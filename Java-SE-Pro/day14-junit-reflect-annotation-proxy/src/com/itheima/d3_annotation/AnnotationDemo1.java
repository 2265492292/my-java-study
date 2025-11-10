package com.itheima.d3_annotation;
@MyTest1(name = "从入门到跑路",money = 9.9,authors = {"我","你"})
//@MyTest2(value = "删除")
//@MyTest2(value = "删除",age = 23)
@MyTest2("删除")
public class AnnotationDemo1 {
    @MyTest1(name = "从入门到跑路",money = 9.9,authors = {"我","你"})
    private String name;
    @MyTest1(name = "从入门到跑路",money = 9.9,authors = {"我","你"})
    public static void main(String[] args) {
        //目标：掌握注解的使用
        @MyTest1(name = "从入门到跑路",money = 9.9,authors = {"我","你"})
        int age =12;

    }
}
