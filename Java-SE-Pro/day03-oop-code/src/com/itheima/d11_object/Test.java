package com.itheima.d11_object;

public class Test {
    public static void main(String[] args) {
        //目标：掌握Object的常用方法
        Student s1 =new Student("小昭",21,100);
        //1.toString默认返回对象的所谓地址形式其实是没有意义的，开发中输出对象更多看的是内容，因此toString是为了让子类重写
//        System.out.println(s1.toString());//直接输出对象，toString可以不写
        System.out.println(s1);
        System.out.println("------------------------------");

        //2.equals方法默认是比较两个对象的地址是否一样
        //比较两个对象的地址是否一样可以直接用"=="比较，完全没必要用equals比较
        //因此Object提供的equals的意义是为了让子类重写，以便自己制定比较规则(按照内容比较)
        Student t1 =new Student("殷素素",35,98);
        Student t2 =new Student("殷素素",35,98);
        System.out.println(t1.equals(t2));//true
        System.out.println(t1 == t2);//false
    }
}
