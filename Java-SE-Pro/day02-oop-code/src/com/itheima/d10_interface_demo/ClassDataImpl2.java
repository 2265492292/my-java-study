package com.itheima.d10_interface_demo;

import java.util.ArrayList;

public class ClassDataImpl2 implements ClassData {
    private ArrayList<Student> students;

    public ClassDataImpl2(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public void printAllStudentInfos() {
        System.out.println("======展示全部学生信息======");
        int count = 0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.getName() + "" + s.getSex() + "" + s.getScore());
            if (s.getSex() == '男')
                count++;
        }
        System.out.println("男性人数：" + count);
        System.out.println("女性人数" + (students.size() - count));
    }

    @Override
    public void printAllStudentAverageScore() {
        System.out.println("======展示全部学生平均分======");
        Student s1 = students.get(0);
        double score = s1.getScore();
        double allScore = score;
        double max = score;
        double min = score;
        for (int i = 1; i < students.size(); i++) {
            Student s = students.get(i);
            double sc = s.getScore();
            allScore += s.getScore();
            if (sc > max) {
                max = sc;
            }
            if (sc < min) {
                min = sc;
            }
        }
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("平均分：" + (allScore - max - min) / (students.size() - 2));
    }
}
