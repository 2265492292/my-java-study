package com.itheima.d2_redlection;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test4Method {
    @Test
    public void testGetMethods() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //1.反射第一步：先得到Class对象
        Class c = Cat.class;
        //2.获取类的全部成员方法
        Method[] methods = c.getDeclaredMethods();
        //3.遍历这个数组
        for (Method method : methods) {
            System.out.println(method.getName() + " " + method.getParameterCount());
        }

        //4.定位单个方法
        Method eat1 = c.getDeclaredMethod("eat");
        Method eat2 = c.getDeclaredMethod("eat", String.class);

        //5.定位方法的目的：执行方法
        Cat cat = new Cat();
        Object result =eat1.invoke(cat);
        System.out.println(result);

        eat2.setAccessible(true);
        Object result2 = eat2.invoke(cat, "鱼");
        System.out.println(result2);
    }
}
