package com.itheima.d2_redlection;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * 目标：获取类的构造器，并对其进行操作
 */
public class Test2Construtor {
    @Test
    public void testGetConstructors() throws Exception {
        //1.反射第一步： 必须先得到这个类的Class对象
        Class c1 = Student.class;
        //2.获取类的全部构造器
//        Constructor[] cs = c1.getConstructors();//只能拿公有构造器(public)
        Constructor[] cs = c1.getDeclaredConstructors();//获取类的全部构造器
        //3.遍历
        for (Constructor c : cs) {
            System.out.println(c);
        }
    }
    @Test
    public void testGetConstructor() throws Exception {
        //1.反射第一步： 必须先得到这个类的Class对象
        Class c1 = Student.class;
        //2.获取类的指定构造器
        //无参构造器
        Constructor c2 = c1.getDeclaredConstructor();
        System.out.println(c2);
        //有参构造器
        Constructor c3 = c1.getDeclaredConstructor(String.class, int.class, char.class, double.class, String.class);


        //拿到构造器是为了创建对象
        //3.初始化对象
        Student s = (Student) c2.newInstance();
        System.out.println(s);
        c3.setAccessible(true);
        Student s2 = (Student) c3.newInstance("叮当猫", 18, '男', 1.88, "football");
        System.out.println(s2);
    }
}
