package com.itheima.d5_dataOutputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamDemo2 {
    public static void main(String[] args) {
        //目标：掌握特殊数据输入流读取特殊数据输出流写出去的数据
        try (
                //1.创建高级的特殊数据输入流管道包装低级的字节输入流管道
                DataInputStream dis =new DataInputStream(new FileInputStream("day10-io-code/src/data.txt"))
                ){
            //开始读取
            byte b=dis.readByte();
            System.out.println(b);

            boolean b1 = dis.readBoolean();
            System.out.println(b1);

            int i =dis.readInt();
            System.out.println(i);

            char c= dis.readChar();
            System.out.println(c);

            String s = dis.readUTF();
            System.out.println(s);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
