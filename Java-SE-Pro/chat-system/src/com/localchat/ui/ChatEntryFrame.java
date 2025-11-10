package com.localchat.ui;

import javax.swing.*;
import java.awt.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ChatEntryFrame extends JFrame {
    private JTextField nicknameField;//昵称
    private JButton enterButton;//确定
    private JButton cancelButton;//取消
    private Socket socket;

    public ChatEntryFrame() {//构造方法
        setTitle("局域网聊天室");//标题
        setSize(350, 200);//大小
        setLocationRelativeTo(null);//居中
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出程序
        setResizable(false);//不可缩放

        //设置背景颜色
        getContentPane().setBackground(new Color(0xF0F0F0));

        //创建主面板并设置布局
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(0xF0F0F0));
        add(mainPanel);

        //创建顶部面板
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        topPanel.setBackground(new Color(0xF0F0F0));

        //标签和文本框
        JLabel nicknameLabel = new JLabel("昵称：");
        nicknameLabel.setFont(new Font("微软雅黑", Font.BOLD, 16));
        nicknameField = new JTextField(10);
        nicknameField.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        nicknameField.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        topPanel.add(nicknameLabel);
        topPanel.add(nicknameField);
        mainPanel.add(topPanel, BorderLayout.NORTH);

        //按钮面板
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.setBackground(new Color(0xF0F0F0));

        enterButton = new JButton("登录");
        enterButton.setFont(new Font("微软雅黑", Font.BOLD, 16));
        enterButton.setBackground(new Color(0x4CAF50));
        enterButton.setForeground(Color.WHITE);
        enterButton.setBorderPainted(false);
        enterButton.setFocusPainted(false);

        cancelButton = new JButton("取消");
        cancelButton.setFont(new Font("微软雅黑", Font.BOLD, 16));
        cancelButton.setBackground(new Color(0xF44336));
        cancelButton.setForeground(Color.WHITE);
        cancelButton.setBorderPainted(false);
        cancelButton.setFocusPainted(false);

        buttonPanel.add(enterButton);
        buttonPanel.add(cancelButton);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        //添加监听
        enterButton.addActionListener(e -> {
            String nickname = nicknameField.getText();//获取昵称
            nicknameField.setText("");//清空文本框
            if (!nickname.isEmpty()) {
                //发送登录消息给服务器端
                try {
                    login(nickname);
                    //进入聊天室
                    new ClientChatFrame(nickname, socket);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                dispose();//销毁当前窗口
            } else {
                JOptionPane.showMessageDialog(this, "请输入昵称！");
            }
        });

        cancelButton.addActionListener(e -> {
            System.exit(0);
        });//退出程序

        this.setVisible(true);//显示
    }

    private void login(String nickname) throws IOException {
        //1.创建socket管道
        socket = new Socket(Constant.SERVER_IP, Constant.SERVER_PORT);
        //2.获取输出流，发送登录消息给服务器端
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeInt(1);//消息类型：1：登录
        dos.writeUTF(nickname);
        dos.flush();
    }

    public static void main(String[] args) {
        new ChatEntryFrame();
    }
}
