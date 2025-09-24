package com.itheima.d2_innerclass2;

//外部类
public class Outer {
    public static String schoolName = "黑马";
    public static void inAddr() {
        System.out.println("在深圳");
    }
    private double height;
    //静态内部类：有static修饰，属于外部类本身
    public static class Inner {
        //类有的成分它都有
        private String name;
        private int age;
        public Inner() {
        }
        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        //拓展：成员内部类访问外部类的成员特点
        public void show() {
            //1.成员内部类中，是否可以直接访问外部类的静态成员？？可以
            System.out.println(schoolName);
            inAddr();
            //2.成员内部类中，是否可以 直接 访问外部类的实例成员？？不可以
            Outer o =new Outer();//间接访问
            System.out.println(o.height);//间接访问
//            System.out.println(height);//直接访问：报错
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
    }
}

