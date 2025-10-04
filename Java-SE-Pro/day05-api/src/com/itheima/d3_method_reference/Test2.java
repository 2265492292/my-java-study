package com.itheima.d3_method_reference;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        //目标：理解实例方法引用
        Student[] students = new Student[4];
        students[0] = new Student("小明", 21, '男', 169.3);
        students[1] = new Student("老红", 32, '女', 171.3);
        students[2] = new Student("小昭", 19, '女', 168.5);
        students[3] = new Student("张无忌", 23, '男', 183.5);
//        Arrays.sort(students,(o1,o2)->Double.compare(o1.getHeight(), o2.getHeight()));

//        Test2 t = new Test2();
//        Arrays.sort(students, (o1, o2) -> t.compare(o1, o2));
        //如果某个lambda表达式只是调用一个实例方法，并且前后参数形式一致，就可以使用实例方法的引用
//        Arrays.sort(students, t::compare);
        Arrays.sort(students, new Test2()::compare);
    }

    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getHeight(), o2.getHeight());
    }
}
