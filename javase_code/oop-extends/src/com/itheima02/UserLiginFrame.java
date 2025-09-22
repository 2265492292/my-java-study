package com.itheima02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLiginFrame extends JFrame {
    public UserLiginFrame() {

        //窗体初始化
        initFrame();

        //绘制窗体
        paintView();


        String name = "itheima";
        String pwd = "123456";

//        loginButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //获取用户输入的用户名和密码
//                String username = usernameField.getText();
//                String password = passwordField.getText();
//
//                //判断长度
//                if (username.length() < 6 || username.length() > 12) {
//                    //System.out.println("用户名的长度是6-12位，请重新输入");
//                    JOptionPane.showMessageDialog(this, "用户名的长度是6-12位，请重新输入");
//                    usernameField.setText("");
//                    return;
//                } else if (password.length() < 6 || password.length() > 12) {
//                    JOptionPane.showMessageDialog(this, "密码的长度是6-12位，请重新输入");
//                    passwordField.setText("");
//                } else {
//                    //判断是否成功
//                    if (username.equals(name) && password.equals(pwd)) {
//                        //System.out.println("登录成功");
//                        JOptionPane.showMessageDialog(this, "登录成功");
//                        usernameField.setText("");
//                        passwordField.setText("");
//                    } else {
////                    System.out.println("用户名或者密码有误");
//                        JOptionPane.showMessageDialog(this, "用户名或者密码有误");
//                    }
//                }
//            }
//        });

        this.setVisible(true);
    }

    public void paintView() {
        JLabel usernameLabel = new JLabel("用户名");
        usernameLabel.setBounds(50, 50, 50, 20);
        this.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(150, 50, 180, 20);
        this.add(usernameField);

        JLabel passwordLabel = new JLabel("密码");
        passwordLabel.setBounds(50, 100, 50, 20);
        this.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 180, 20);
        this.add(passwordField);

        JButton loginButton = new JButton("登录");
        loginButton.setBounds(50, 200, 280, 20);
        this.add(loginButton);
    }

    public void initFrame() {
        this.setTitle("用户登录");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        this.setLayout(null);
    }
}
