package com.localchat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

public class ServerReaderThread extends Thread {
    private Socket socket;

    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //消息类型：1.登录消息（包含昵称）2.群聊消息3.私聊消息
            //所以客户端必须声明协议发送消息
            //比如客户端先发送一个数字1，表示登录消息
            //数字2表示群聊消息
            //数字3表示私聊消息
            //数字4表示退出登录/下线消息
            //先从管道读取数字
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            while (true) {
                int type = dis.readInt();
                switch (type) {
                    case 1:
                        //登录消息，更新在线用户列表
                        String nickName = dis.readUTF();
                        //把昵称保存到在线集合中
                        Server.onLineSockets.put(socket, nickName);
                        //发送在线用户列表给所有用户
                        updateClientOnlineUserList();
                        break;
                    case 2:
                        //群聊消息，读取消息内容，发送给所有在线用户
                        String msg = dis.readUTF();
                        sendMsgToAll(msg);
                        break;
                    case 3:
                        //私聊消息，读取消息内容，发送给指定用户
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("客户端下线了：" + socket.getInetAddress().getHostAddress());
            Server.onLineSockets.remove(socket);//移除下线的用户
            updateClientOnlineUserList();//刷新在线人数
        }
    }

    //发送群聊消息给所有在线用户
    private void sendMsgToAll(String msg) {
        //拼装好这个消息再发送
        StringBuilder sb = new StringBuilder();
        String name = Server.onLineSockets.get(socket);

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEE a");
        String nowStr = dtf.format(now);

        String msgResult = sb.append(name).append(" ").append(nowStr).append("\r\n")
                .append(msg).append("\r\n").toString();
        
        //1.把消息发送给全部在线socket管道
        for (Socket socket : Server.onLineSockets.keySet()) {
            try {
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                dos.writeInt(2);//1：告诉客户端，这是在线人数列表，2：群聊消息，3：私聊消息
                dos.writeUTF(msgResult);
                dos.flush();//刷新管道,立即发送
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void updateClientOnlineUserList() {
        //更新全部客户端的在线人数
        //拿到全部在线客户端的用户名称，把这些名称转发给全部在线socket管道
        //1.拿到全部在线用户名称
        Collection<String> onlineUsers = Server.onLineSockets.values();
        //2.把用户名称发送给全部在线socket管道
        for (Socket socket : Server.onLineSockets.keySet()) {
            try {
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                dos.writeInt(1);//1：告诉客户端，这是在线人数列表，2：群聊消息，3：私聊消息
                dos.writeInt(onlineUsers.size());//告诉客户端，本次登录的用户数量
                for (String onlineUser : onlineUsers) {
                    dos.writeUTF(onlineUser);
                }
                dos.flush();//刷新管道,立即发送
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }
}