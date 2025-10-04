package com.itheima.d12_objects;


import com.itheima.d11_object.Student;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        //目标：掌握Objects的常用方法
        Student t1 = null;
        Student t2 = new Student("蜘蛛精", 300, 85.5);
//        System.out.println(t1.equals(t2));//如果主调对象时null,直接爆出空指针异常

        /*public static boolean equals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
        }*/
        //Object.equals方法源码中有非空校验
        //更安全，更可靠，推荐使用false
        //今后比较两个内容时，建议用Object的equals来判断
        System.out.println(Objects.equals(t1, t2));

        System.out.println(Objects.isNull(t1));//true
        System.out.println(t1 == null);//true

        System.out.println(Objects.nonNull(t1));//false
        System.out.println(t1 != null);//false
    }
}
