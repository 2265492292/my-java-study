package com.itheima.d5_tcp2;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：实现TCP下多收多发:客户端
        System.out.println("=====客户端启动=====");
        //1.常见Socket普通对象，请求与服务端的Socket链接，可靠连接
        Socket socket =new Socket("127.0.0.1",6666);

        //2.从socket通信管道中得到一个字节输出流
        OutputStream os =socket.getOutputStream();

        //3.包装成 特殊数据流         /缓冲流
        DataOutputStream dos =new DataOutputStream(os);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请说：");
            String msg =sc.nextLine();
            if ("exit".equals(msg)){
                System.out.println("推出成功");
                dos.close();    //关输出流
                socket.close();//关socket
                break;
            }
            dos.writeUTF(msg);
            dos.flush();
        }
    }
}
