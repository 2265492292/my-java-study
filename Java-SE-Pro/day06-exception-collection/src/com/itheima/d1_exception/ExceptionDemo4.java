package com.itheima.d1_exception;

public class ExceptionDemo4 {
    //    目标：认识自定义异常2
    //编译时异常
    public static void main(String[] args) {
        System.out.println("开始");
//        save(1000);//编译时报错
        try {
            save(200);
            System.out.println("执行成功了");
        } catch (Exception e) {
            e.printStackTrace();//打印异常对象信息
            System.out.println("执行失败了");
//            throw new RuntimeException(e);
        }
        System.out.println("结束");
    }

    public static void save(int age) throws ItheimaAgeIllegalException {
        //throw 方法内部使用，创建异常并从此处抛出
        //throws 方法上，抛出方法内部的异常给调用者
        if (age <= 0 || age > 150) {
            //这个年龄非法！创建异常对象并立即抛出去
            throw new ItheimaAgeIllegalException("/age is xiagao!");
        }
        System.out.println("年龄保存成功,年龄是:" + age);
    }
}
