package com.localchat.ui;

import javax.swing.*;
import java.awt.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientChatFrame extends JFrame {
    public JTextArea smsContent = new JTextArea(23, 50);
    private JTextArea smsSend = new JTextArea(4, 40);
    public JList<String> userList = new JList<>();
    public JButton btnSend = new JButton("发送");
    private String nickname;
    private Socket socket;

    public ClientChatFrame() {
        initView();
        this.setVisible(true);
    }

    public ClientChatFrame(String nickname, Socket socket) {
        this();//调用无参构造方法，初始化界面
        //初始化数据
        //把昵称展示到标题中
        this.setTitle(nickname + "的聊天窗口");
        this.nickname = nickname;
        this.socket = socket;
        //启动线程，接收服务端发送的消息
        new ClientReaderThread(socket, this).start();
    }

    private void initView() {
        // 设置窗口基本属性
        this.setSize(800, 600);
        this.setLayout(new BorderLayout(5, 5)); // 添加组件间距
        this.setLocationRelativeTo(null);//居中
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 设置窗口背景颜色
        this.getContentPane().setBackground(new Color(0xf5, 0xf5, 0xf5));

        // 设置字体
        Font font = new Font("微软雅黑", Font.PLAIN, 14);
        Font boldFont = new Font("微软雅黑", Font.BOLD, 14);

        // 消息内容框
        smsContent.setFont(font);
        smsContent.setBackground(Color.WHITE);
        smsContent.setEditable(false);
        smsContent.setLineWrap(true);
        smsContent.setWrapStyleWord(true);
        smsContent.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // 发送消息框
        smsSend.setFont(font);
        smsSend.setWrapStyleWord(true);
        smsSend.setLineWrap(true);
        smsSend.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(0xcc, 0xcc, 0xcc)),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));

        // 创建底部面板
        JPanel bottomPanel = new JPanel(new BorderLayout(5, 5));
        bottomPanel.setBackground(new Color(0xf5, 0xf5, 0xf5));
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // 消息输入框滚动面板
        JScrollPane smsSendScrollPanel = new JScrollPane(smsSend);
        smsSendScrollPanel.setBorder(BorderFactory.createEmptyBorder());
        smsSendScrollPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // 发送按钮
        btnSend.setFont(boldFont);
        btnSend.setBackground(new Color(0x4CAF50));
        btnSend.setForeground(Color.WHITE);
        btnSend.setBorderPainted(false);
        btnSend.setFocusPainted(false);
        btnSend.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSend.setPreferredSize(new Dimension(80, 40));

        // 按钮面板
        JPanel btnsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 5));
        btnsPanel.setBackground(new Color(0xf5, 0xf5, 0xf5));
        btnsPanel.add(btnSend);

        // 给发送按钮添加点击监听器
        btnSend.addActionListener(e -> {
            String msg = smsSend.getText();
            smsSend.setText("");
            sendMsgToServer(msg);
        });

        // 添加底部组件
        bottomPanel.add(smsSendScrollPanel, BorderLayout.CENTER);
        bottomPanel.add(btnsPanel, BorderLayout.SOUTH);

        // 用户列表
        userList.setFont(font);
        userList.setBackground(Color.WHITE);
        userList.setSelectionBackground(new Color(0x4CAF50));
        userList.setSelectionForeground(Color.WHITE);

        // 用户列表面板
        JPanel userListPanel = new JPanel(new BorderLayout());
        userListPanel.setBackground(new Color(0xf5, 0xf5, 0xf5));
        userListPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(0xcc, 0xcc, 0xcc)),
                "在线用户",
                0,
                0,
                boldFont
        ));

        JScrollPane userListScrollPanel = new JScrollPane(userList);
        userListScrollPanel.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
        userListPanel.add(userListScrollPanel, BorderLayout.CENTER);
        userListPanel.setPreferredSize(new Dimension(150, 0));

        // 中心消息面板
        JPanel smsContentPanel = new JPanel(new BorderLayout());
        smsContentPanel.setBackground(new Color(0xf5, 0xf5, 0xf5));
        smsContentPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(0xcc, 0xcc, 0xcc)),
                "消息记录",
                0,
                0,
                boldFont
        ));

        JScrollPane smsContentScrollPanel = new JScrollPane(smsContent);
        smsContentScrollPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        smsContentScrollPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        smsContentPanel.add(smsContentScrollPanel, BorderLayout.CENTER);

        // 添加组件到主窗口
        this.add(smsContentPanel, BorderLayout.CENTER);
        this.add(userListPanel, BorderLayout.EAST);
        this.add(bottomPanel, BorderLayout.SOUTH);


    }

    private void sendMsgToServer(String msg) {
        //1.从socket管道中获取输出流
        try {
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            //2.发送消息给服务端
            dos.writeInt(2);//消息类型：2：群聊消息
            dos.writeUTF(msg);
            dos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new ClientChatFrame();
    }

    public void updateOnlineUsers(String[] onLineNames) {
        //把这个线程读取到的在线用户更新到界面上
        userList.setListData(onLineNames);
    }

    //添加消息到界面
    public void setMsgToWin(String msg) {
        //把消息添加到界面中
        smsContent.append(msg);
    }
}