package com.itheima.d3_method_reference;
//自定义排序规则方式1:让对象所在的类实现比较规则接口Comparable，重写Comparable,来指定比较规则

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private char gender;
    private double height;

    public Student() {
    }

    public Student(String name, int age, char gender, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", height=" + height +
                '}' + "\n";
    }

    public static int compareByHeight(Student o1,Student o2){
        return Double.compare(o1.getHeight(), o2.getHeight());
    }
    //指定大小规则
    //比较者:this
    //被比较者:o
    @Override
    public int compareTo(Student o) {
        //官方规定:
        //如果您认为左边大于右边，请返回正整数
        //如果您认为左边小于右边，请返回负整数
        //如果您认为左边等于右边，请返回0
        //只要这么干，默认就是升序排序
        /*if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        }
        return 0;*/
//        return this.age - o.age;//升序
        return o.age - this.age;//降序
    }
}
