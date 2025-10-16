package com.itheima.d6_object;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo2 {
    public static void main(String[] args) throws Exception{
        //目标：对象反序列化     使用对象字节输入流管道把文件中的Java对象读取到内存中来
        //1.创建对象字节输入流管道
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("day10-io-code/src/obj.txt"));

        //2.读取对象进来（对象反序列化）
        Student s =(Student) ois.readObject();

        System.out.println(s);
        ois.close();
    }
}
