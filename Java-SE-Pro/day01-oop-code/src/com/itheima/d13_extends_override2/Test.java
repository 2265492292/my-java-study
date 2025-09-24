package com.itheima.d13_extends_override2;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("赵敏", '女',169.5,"执着，真诚，没有私心");
        System.out.println(s.toString());//输出对象，其实默认是调用继承自父类Object的toString返回所谓的地址值
        System.out.println(s);//默认调用toString
    }
}
