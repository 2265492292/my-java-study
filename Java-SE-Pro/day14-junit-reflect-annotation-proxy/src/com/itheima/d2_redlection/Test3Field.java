package com.itheima.d2_redlection;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * 目标：获取类的成员变量
 */
public class Test3Field {
    @Test
    public void testGetFields() throws Exception {
        //1.反射第一步：先得到类的Class对象
        Class c = Cat.class;
        //2.获取类的全部成员变量
        //3.遍历这个成员变量数组
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType() + "==>" + field.getName());
        }
        //4.定位某个成员变量
        Field fname =c.getDeclaredField("name");

        //5.成员变量的作用依然是：取值和赋值
        Cat cat =new Cat();
        fname.setAccessible(true);
        fname.set(cat,"哆啦A梦");

        String name =(String) fname.get(cat);
        System.out.println(name);
    }
}
