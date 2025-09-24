package com.itheima.d16_extends_constructor2;

public class Teacher extends People {
    private String skill;

    public Teacher() {
    }

    public Teacher(String name, int age, String skill) {
        super(name, age);
        //为什么子类构造器要先调用父类构造器？？？
        ///      初始化继承自父类部分的数据！！！
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
