package com.itheima.d6_object;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：完成对象的序列化：把Java对象存储到文件中去
        //1.准备一个对象
        Student s =new Student("风驴子",27,"mazi666",160);
        //2.创建对象字节输出流管道与目标文件接通
        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("day10-io-code/src/obj.txt"));
        //3.开始写对象出去
        oos.writeObject(s);
        //4.关闭资源
        oos.close();
    }
}
