package com.itheima.d4_innerclass4;

import javax.swing.*;

public class Test3 {
    public static void main(String[] args) {
        //拓展：掌握匿名内部类的真实场景
        //GUI SWING编程：桌面编程
        //1.创建一个窗口
        JFrame win = new JFrame("登录窗口");

        JPanel pannel = new JPanel();
        win.add(pannel);

        JButton btn = new JButton("登录");
        pannel.add(btn);

        //给按钮绑定单击事件监听器对象，可以用来监听用户的点击，以便做出反应
        //匿名内部类时作为一个对象参数传输给方法使用的，至于什么时候用匿名内部类要看实际开发的需要，遇到了才用，没有遇到不会主动用
        //还有一个很重要的作用：简化代码（新技术的基础）
       /* btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击了，进行登录");
                JOptionPane.showMessageDialog(win,"别点我");
            }
        });*/
        btn.addActionListener(e -> JOptionPane.showMessageDialog(win, "别点我"));
        //设计大小，居中展示
        win.setSize(400, 300);//大小
        win.setLocationRelativeTo(null);//居中
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭窗口退出程序
        win.setVisible(true);//可见性
    }
}
