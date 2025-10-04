package com.itheima.d2_lambda;

import com.itheima.d1_array.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntToDoubleFunction;

public class LambdaTest2 {
    public static void main(String[] args) {
        //目标：掌握lambda表达式简化常见函数式接口的匿名内部类
        double[] scores = {99.5, 90, 59.5, 78, 55};
        //需求：为每个分数加10
        /*Arrays.setAll(scores, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return scores[value]+10;
            }
        });*/
        Arrays.setAll(scores, (int value) -> {
            return scores[value] + 10;
        });
        //1.参数类型可以省略不写
        Arrays.setAll(scores, (value) -> {
            return scores[value] + 10;
        });
        //2.如果只有一个参数，参数类型可以省略，同时()也可以省略
        Arrays.setAll(scores, value -> {
            return scores[value] + 10;
        });
        //3.如果lambda表达式中的方法体代码只有一行代码，可以省略大括号{}不写，如果这行代码式return语句，必须去掉return
        Arrays.setAll(scores, value -> scores[value] + 10);
        System.out.println(Arrays.toString(scores));
        System.out.println("--------------------------");
        Student[] students = new Student[4];
        students[0] = new Student("小明", 21, '男', 169.3);
        students[1] = new Student("老红", 32, '女', 171.3);
        students[2] = new Student("小昭", 19, '女', 168.5);
        students[3] = new Student("张无忌", 23, '男', 183.5);

        /*Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getHeight(),o2.getHeight());
            }
        });*/
        Arrays.sort(students, (Student o1, Student o2) -> {
            return Double.compare(o1.getHeight(), o2.getHeight());
        });
        //1.参数类型可以省略不写
        Arrays.sort(students, (o1, o2) -> {
            return Double.compare(o1.getHeight(), o2.getHeight());
        });
        //3.如果lambda表达式中的方法体代码只有一行代码，可以省略大括号{}不写，如果这行代码式return语句，必须去掉return
        Arrays.sort(students, (o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight()));
        System.out.println(Arrays.toString(students));
    }
}
