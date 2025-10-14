package com.itheima.d2_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//目标：掌握Collections集合工具类的使用
public class CollectionsTest1 {
    public static void main(String[] args) {
        //1.public static <T> boolean addAll(Collection<? super T>c, T...elements:为集合批量添加数据
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张无忌", "张无忌", "小昭", "殷素素");
        System.out.println(names);

        //2.public static void  shuffle(List<?> list):打乱List集合中的顺序
        Collections.shuffle(names);
        System.out.println(names);

        //3.public static <T> void sort(list<T> list):对List集合中的元素进行升序排序
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("赵敏", 19, 169.5);
        Student s2 = new Student("周芷若", 18, 171.5);
        Student s3 = new Student("周芷若", 18, 171.5);
        Student s4 = new Student("小昭", 17, 165.5);
        Collections.addAll(students, s1, s2, s3, s4);
        //方式一：让对象的类实现Comparable接口：重写compare方法，指定大小比较规则
        Collections.sort(students);
        System.out.println(students);
//        4.public static <T> void sort(List<T> list, Comparator<? super T> c);//? super T:必须是T或者T的父类
        //对List集合中元素，按照比较器对象指定的规则进行排序
        //方式二：指定Comparator比较器对象，再指定比较规则
        //TreeSet的构造器可以带比较器，list需要结合Collections工具类
        Collections.sort(students,((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight())));
//        Collections.sort(students,((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight())));
        System.out.println(students);
    }
}
