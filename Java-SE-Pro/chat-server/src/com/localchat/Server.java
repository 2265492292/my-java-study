package com.localchat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server {
    //定义一个集合容器存储所有上线的在线用户
    //定义一个Map集合，键：Socket对象，值：用户名
    public static final Map<Socket, String> onLineSockets = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("===启动服务端===");

        try {
            //1.注册端口
            ServerSocket serverSocket = new ServerSocket(Constant.PORT);
            //2.主线程循环监听
            while (true) {
                //3.调用accept()方法，阻塞等待客户端连接，连接成功返回一个Socket对象
                System.out.println("等待客户端连接...");
                Socket socket = serverSocket.accept();
//                把socket管道交给一个独立的子线程来处理，以支持多客户端即时通信
                new ServerReaderThread(socket).start();
                System.out.println("一个客户端上线了");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
