package com.localchat.ui;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientReaderThread extends Thread {
    private Socket socket;
    private DataInputStream dis;
    private ClientChatFrame win;

    public ClientReaderThread(Socket socket, ClientChatFrame win) {
        this.socket = socket;
        this.win = win;
    }

    @Override
    public void run() {
        try {
            //消息类型：1.在线人数更新2.群聊消息3.私聊消息
            dis = new DataInputStream(socket.getInputStream());
            while (true) {
                int type = dis.readInt();//1，2，3
                switch (type) {
                    case 1:
                        //登录消息，更新在线用户列表
                        updateClientOnlineUserList();
                        break;
                    case 2:
                        //群聊消息，读取消息内容，发送给所有在线用户
                        getMsgToWin();
                        break;
                    case 3:
                        //私聊消息，读取消息内容，发送给指定用户
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getMsgToWin() throws IOException {
        //1.读取消息内容
        String msg = dis.readUTF();
        win.setMsgToWin(msg);
    }

    //更新客户端在线用户列表
    private void updateClientOnlineUserList() throws IOException {
        //1.读取有多少个在线用户信息
        int count = dis.readInt();
        //2.循环读取用户信息
        String[] onLineNames = new String[count];
        for (int i = 0; i < count; i++) {
            //3.读取一个用户信息
            String nickname = dis.readUTF();
            //4.把用户信息添加到集合中
            onLineNames[i] = nickname;
        }
        win.updateOnlineUsers(onLineNames);
    }


}
