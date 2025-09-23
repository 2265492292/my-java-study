package com.itheima.d4_static_attention;

public class Test {
    /// 静态变量：有static修饰，属于类持有的变量，在内存中唯一一份，所有对象都共享。
    public static String schoolName = "黑马";

    /// 静态方法
    /// 静态变量和静态方法统称静态成员（静态对象）
    public static void inAddr() {
        System.out.println("我们在黑马学习java");
    }

    /// 实例变量
    private String name;

    /// 实例方法
    private void printInfo() {
        System.out.println("名字是：" + name);
    }

    public static void main(String[] args) {
        //目标：理解使用static的几点注意事项




    }
    ///3.实例方法可以出现this关键字,静态方法(类方法）不可用出现this关键字
    ///2.实例方法中既可以直接访问类成员,也可以直接访问实例成员
    public void noStatic(){
        System.out.println(schoolName);
        inAddr();
        System.out.println(this);//this指向当前对象,输出当前对象
        System.out.println(this.name);
        this.printInfo();
    }
    /// 1.静态方法(类方法)中可以直接访问类的静态成员（静态变量、静态方法）,不可以直接访问实例成员（实例变量、实例方法）
    public static void testStatic() {
        System.out.println(schoolName);
        inAddr();
//        System.out.println(this);//报错

//        System.out.println(name);//报错
//        printInfo();//报错
    }
}
