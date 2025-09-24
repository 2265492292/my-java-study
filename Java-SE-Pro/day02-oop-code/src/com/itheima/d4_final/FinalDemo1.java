package com.itheima.d4_final;
//final修饰基本类型变量，变量存储的数据不能改变
//final修饰引用类型的变量，变量存储的地址不能被改变，但是所指向对象的内容时可以被改变的
public class FinalDemo1 {
    //5.final修饰静态成员变量：称为常量
    //static final 修饰的成员变量叫做常量
    //常量的单词建议全部大写，多个单词用下划线链接
    public static final String SCHOOL_NAME = "黑马程序员";
    public static final String SCHOOL_NAME2;

    static {/// static在类加载时与类一起加载，所以在常量加载时可以在静态代码块初始化
        SCHOOL_NAME2 = "深圳黑马";
//            SCHOOL_NAME2="深圳黑马2";//报错，第二次赋值
    }

    //6.final修饰实例成员变量
    private final String name = "高姑娘";//没有意义

    public static void main(String[] args) {
        //目标：掌握final关键字的作用
        ///3.final修饰变量，有且仅能赋值一次
        //Java的变量有几种？？
        // my ans==静态变量、成员变量
        ///rightAns==成员变量：静态成员变量、实例成员变量
        ///           局部变量：方法内、形参、for循环变量、构造器中的变量
        //4.final修饰局部变量
        final int a = 12;
//        a = 15;//报错，第二次赋值
        final double r = 3.14;
        buy(0.7);

//        SCHOOL_NAME ="黑马2"//报错，第二次赋值
    }

    public static void buy(final double z) {
//        z = 0.1;//报错，第二次赋值
    }
}
//1.final修饰类，类不能被继承
//final class A{}
//class B extends A{}

//2.final修饰方法，方法不能被重写
//class C{
//    public final void run(){
//    }
//}
//class D extends C{
//    @Override
//    public void run(){
//    }
//}


