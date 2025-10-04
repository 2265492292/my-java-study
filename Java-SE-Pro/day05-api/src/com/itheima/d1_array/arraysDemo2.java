package com.itheima.d1_array;

import java.util.Arrays;
import java.util.Comparator;

public class arraysDemo2 {
    public static void main(String[] args) {
        Student[] students =new Student[4];
        students[0]=new Student("小明",21,'男',169.3);
        students[1]=new Student("老红",32,'女',171.3);
        students[2]=new Student("小昭",19,'女',168.5);
        students[3]=new Student("张无忌",23,'男',183.5);

        //自定义排序规则方式一:让对象所在的类实现比较规则接口Comparable，重写Comparable,来指定比较规则
//        Arrays.sort(students);

        //自定义排序规则方式二:sort存在重载的方法，支持自带Comparator比较器对象来直接指定比较规则
        //public static <T> void sort(T[] a,Comparator<? super T> c
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();//升序
                /*if (o1.getHeight() > o2.getHeight()) {
                    return 1;
                } else if (o1.getHeight()<o2.getHeight()) {
                    return -1;
                }
                return 0;*/
                return Double.compare(o1.getHeight(),o2.getHeight());
            }
        });
        System.out.println(Arrays.toString(students));

    }
}
