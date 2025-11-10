package com.itheima.d4_tcp1;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：实现TCP下一收一发:客户端
        System.out.println("=====客户端启动=====");
        //1.常见Socket普通对象，请求与服务端的Socket链接，可靠连接
        Socket socket =new Socket("127.0.0.1",6666);

        //2.从socket通信管道中得到一个字节输出流
        OutputStream os =socket.getOutputStream();

        //3.包装成 特殊数据流         /缓冲流
        DataOutputStream dos =new DataOutputStream(os);
        dos.writeInt(1);
        dos.writeUTF("你好");

        //4.释放资源
        socket.close();
    }
}
