package com.itheima.d16_extends_constructor2;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("播妞");
        t1.setAge(35);
        t1.setSkill("Java,嵌入式");
        System.out.println(t1.getName());
        System.out.println(t1.getAge());
        System.out.println(t1.getSkill());

        Teacher t2 = new Teacher("波仔", 34, "Java,吹牛逼");
        System.out.println(t1.getName());
        System.out.println(t1.getAge());
        System.out.println(t1.getSkill());
    }
}
