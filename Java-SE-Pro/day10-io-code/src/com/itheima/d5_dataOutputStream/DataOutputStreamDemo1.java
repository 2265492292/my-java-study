package com.itheima.d5_dataOutputStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamDemo1 {
    public static void main(String[] args) {
        try (
                //目标：掌握数据输出流写数据的特点：可以写数据和其类型，并且后面可以读取出来
                DataOutputStream dos =new DataOutputStream(new FileOutputStream("day10-io-code/src/data.txt"));
                ){
            //2.写数据和其类型出去
            dos.writeByte(97);
            dos.writeBoolean(true);
            dos.writeInt(1000);
            dos.writeChar('a');
            dos.writeUTF("我在北京天安门666");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
