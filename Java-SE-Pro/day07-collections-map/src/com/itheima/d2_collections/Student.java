package com.itheima.d2_collections;

public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private double height;

    //重写compare比较方法
    //s1.compareTo(s2)
    //左边对象：s1 == this
    //右边对象：s2 == o
    @Override
    public int compareTo(Student o) {
        //指定比较规则：按照年龄升序比较
        //官方规则如下：
        //如果你认为左边对象 > 右边对象 返回正整数
        //如果你认为左边对象 < 右边对象 返回负整数
        //如果你认为左边对象 = 右边对象 返回0 如此：就会自动进行升序排序
        /*if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        }
        return 0;*/
//        return this.age-o.age;//升序
        return o.age - this.age;//降序
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}' + '\n';
    }

    public Student() {
    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
